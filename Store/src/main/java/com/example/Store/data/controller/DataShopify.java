package com.example.Store.data.controller;

import com.example.Store.data.model.customers.Customer;
import com.example.Store.data.model.customers.CustomersList;
import com.example.Store.data.model.orders.LineItem;
import com.example.Store.data.model.orders.Order;
import com.example.Store.data.model.orders.OrderList;
import com.example.Store.data.model.products.*;
import com.example.Store.entity.customers.CountryDB;
import com.example.Store.entity.customers.CustomerDB;
import com.example.Store.entity.orders.CheckoutDB;
import com.example.Store.entity.orders.OrderDB;
import com.example.Store.entity.orders.OrderProductDB;
import com.example.Store.entity.products.*;
import com.example.Store.entity.vendors.TbVendor;
import com.example.Store.service.customers.CountryService;
import com.example.Store.service.customers.CustomerService;
import com.example.Store.service.orders.OrderProductService;
import com.example.Store.service.orders.OrderService;
import com.example.Store.service.products.*;
import com.example.Store.service.vendors.VendorService;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

@RestController
@RequestMapping("/data")
public class DataShopify {
    @Autowired
    private CountryService countryService;
    @Autowired
    private ImageService imageService;
    @Autowired
    private SizeService sizeService;
    @Autowired
    private MaterialService materialService;
    @Autowired
    private StyleService styleService;
    @Autowired
    private ColorService colorService;
    @Autowired
    private VendorService vendorService;
    @Autowired
    private ProductService productService;
    @Autowired
    private VariantService variantService;

    @Autowired
    private CustomerService customerService;
    @Autowired
    private OrderService orderService;
    @Autowired
    private OrderProductService orderProductService;

    public void checkOption(String value, VariantDB variantDB){
        if (value == null) return;
        if(sizeService.findByTitle(value)!=null){
            variantDB.setSize(sizeService.findByTitle(value));
            return;
        }
        if(colorService.findByTitle(value)!=null){
            variantDB.setColor(colorService.findByTitle(value));
            return;
        }
        if(styleService.findByTitle(value)!=null){
            variantDB.setStyle(styleService.findByTitle(value));
            return;
        }
        variantDB.setMaterial(materialService.findByTitle(value));
        return;
    }
    public String randomId(String header){
        return header+String.valueOf(java.time.LocalTime.now());
    }

    public HttpEntity<String> entity (){
        HttpHeaders headers = new HttpHeaders();
        headers.set("Content-Type","application/json");
        headers.set("X-Shopify-Access-Token", "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");
        //HttpEntity<String > entity = new HttpEntity<String >(headers);
        return  new HttpEntity<String >(headers);
    }


    @GetMapping("/customers")
    public CustomersList getAllCustomer(){
        String url ="https://shop-of-hoa.myshopify.com/admin/api/2022-10/customers.json";
        RestTemplate restTemplate = new RestTemplate();
        String resultt= restTemplate.exchange(url,HttpMethod.GET,entity(),String.class).getBody();
        System.out.println("Result = "+resultt);

        Gson gson = new GsonBuilder()
                .create();
        CustomersList customers = gson.fromJson(resultt, CustomersList.class);

        List<Customer> customerList = customers.getCustomers();

        List<CustomerDB> customerDBS = new ArrayList<CustomerDB>();
        for(Customer c:customerList){
            CountryDB countryDB = new CountryDB();
            countryDB.setId(String.valueOf(c.getDefaultAddress().getId()));
            countryDB.setCity(c.getDefaultAddress().getCity());
            countryDB.setCountry(c.getDefaultAddress().getCountry());
            countryDB.setCreated_at(c.getCreatedAt());
            countryDB.setUpdated_at(c.getUpdatedAt());
            countryDB.show();
            CustomerDB customerDB = new CustomerDB();
            customerDB.setId(c.getId());
            customerDB.setEmail(String.valueOf(c.getEmail()));
            customerDB.setFirst_name(c.getFirstName());
            customerDB.setLast_name(c.getLastName());
            customerDB.setPhonenumber(String.valueOf(c.getPhone()));
            customerDB.setAddress1(c.getDefaultAddress().getAddress1());
            customerDB.setAddress2(c.getDefaultAddress().getAddress2());
            customerDB.setCreated_at(c.getCreatedAt());
            customerDB.setUpdated_at(c.getUpdatedAt());
            customerDBS.add(customerDB);
            String idCountry = countryService.findCountry(countryDB);
            if(idCountry==null){
                countryService.add(countryDB);
            }else {
                countryDB.setId(idCountry);
            }

            countryDB.addCustomer(customerDB);
            customerService.add(customerDB);

        }
        return customers;
    }
    @GetMapping("/orders")
    public String getAllOrder(){
        String url ="https://shop-of-hoa.myshopify.com/admin/api/2022-10/orders.json";
        RestTemplate restTemplate = new RestTemplate();
        String resultt= restTemplate.exchange(url,HttpMethod.GET,entity(),String.class).getBody();
        System.out.println("Result = "+resultt);
        Gson gson = new GsonBuilder()
                .create();
        OrderList orders = gson.fromJson(resultt, OrderList.class);
        List<Order> orderList = orders.getOrders();
        for(Order o:orderList){
//            String urlcheckout = "https://shop-of-hoa.myshopify.com/admin/api/2022-10/checkouts/"+o.getCheckoutToken()+".json";
//            String resultCheckout = new RestTemplate().exchange(urlcheckout,HttpMethod.GET,entity(),String.class).getBody();
//            System.out.println(resultCheckout);
            OrderDB orderDB = new OrderDB();
            orderDB.setId(o.getId());
            orderDB.setName(o.getName());
            orderDB.setTotal_price(Double.valueOf(o.getTotalPrice()));
            orderDB.setCurrency_code(o.getCurrency());
            orderDB.setTotal_discounts(Double.valueOf(o.getTotalDiscounts()));
            orderDB.setTotal_tax(Double.valueOf(o.getTotalTax()));
            orderDB.setStatus("created");
            orderDB.setCreated_at(o.getCreatedAt());
            orderDB.setUpdated_at(o.getUpdatedAt());

            orderService.addOrder(orderDB);
            System.out.println("Order added");

            for(LineItem i:o.getLineItems()){
                OrderProductDB orderProductDB = new OrderProductDB();
                orderProductDB.setId(i.getId());
                orderProductDB.setQuantity(i.getQuantity());
//                orderProductDB.setTax(i.getT);
                orderProductDB.setStatus("");
                VariantDB variantDB = variantService.findById(i.getVariantId());
                orderProductDB.setVariant(variantDB);
                orderProductDB.setOrder(orderDB);
                orderDB.addOrderProduct(orderProductDB);
                orderProductService.addOrderProduct(orderProductDB);
                System.out.println("OrderProduct added");
            }

        }

        return resultt;
    }

    @GetMapping("/products")
    public ProductList getAllProducts(){
        String url ="https://shop-of-hoa.myshopify.com/admin/api/2022-10/products.json";
        RestTemplate restTemplate = new RestTemplate();
        String resultt= restTemplate.exchange(url,HttpMethod.GET,entity(),String.class).getBody();
        System.out.println("Result = "+resultt);
        Gson gson = new GsonBuilder().create();

        ProductList productList = gson.fromJson(resultt,ProductList.class);
        List<Product> products = productList.getProducts();
        for(Product p:products){
            System.out.println("-------");

            ProductDB productDB = new ProductDB();
            VariantDB variantDB = new VariantDB();
            SizeDB sizeDB = new SizeDB();
            StyleDB styleDB =new StyleDB();
            ColorDB colorDB = new ColorDB();
            MaterialDB materialDB = new MaterialDB();
            TbVendor vendor = new TbVendor();

            productDB.setId(p.getId());
            productDB.setTitle(p.getTitle());
            productDB.setType(p.getProductType());
            productDB.setDescription(p.getBodyHtml().substring(0,250<p.getBodyHtml().length()?250:p.getBodyHtml().length()));
            productDB.setStatus(p.getStatus());
            productDB.setCreated_at(p.getCreatedAt());
            productDB.setUpdated_at(p.getUpdatedAt());

//            TbVendor vendor1 = vendorService.findByName(p.getVendor());
            System.out.println("Vendor =" +vendor);
            TbVendor tbVendor = vendorService.findByName(p.getVendor());
            if(tbVendor==null) {
                vendor.setName(p.getVendor());
                vendor.setCreated_at(p.getCreatedAt());
                vendor.setUpdated_at(p.getUpdatedAt());
                String id_vendor = randomId("vendor");
                vendor.setId(id_vendor);
                vendor.show();
                vendorService.add(vendor);
                System.out.println("add vendor done");
            }else {
                vendor=tbVendor;
            }

            vendor.addProduct(productDB);
            productService.addProduct(productDB);

            ImageDB imageDB = new ImageDB();
            for(Image i:p.getImages()){
                imageDB.setId(i.getId());
                imageDB.setSrc(i.getSrc());
                imageDB.setCreated_at(i.getCreatedAt());
                imageDB.setUpdated_at(i.getUpdatedAt());
                imageDB.setProduct(productDB);
                imageService.addImage(imageDB);
                productDB.addImage(imageDB);
                System.out.println("add image done");
            }

            for (Option o:p.getOptions()){
                switch (o.getName()){
                    case "Size":
                        System.out.println("Case Size");
                        for(String s:o.getValues()){
                            if(sizeService.findByTitle(s)==null) {
                                sizeDB.setTitle(s);
                                String id_size = randomId("size");
                                sizeDB.setId(id_size);
                                sizeService.addSize(sizeDB);
                                System.out.println("add size done");
                            }
                        }
                        break;

                    case "Color":
                        System.out.println("Case Color");
                        for(String s:o.getValues()){
                            if(colorService.findByTitle(s)==null) {
                                colorDB.setTitle(s);
                                String id_size = randomId("color");
                                colorDB.setId(id_size);
                                colorService.addColor(colorDB);
                                System.out.println("add color done");
                            }
                        }
                        break;

                    case "Style":
                        System.out.println("Case Style");
                        for(String s:o.getValues()){
                            if(styleService.findByTitle(s)==null) {
                                styleDB.setTitle(s);
                                String id_size = randomId("style");
                                styleDB.setId(id_size);
                                styleService.addStyle(styleDB);
                                System.out.println("add style done");
                            }
                        }
                        break;
                    case "Material":
                        System.out.println("Case Material");
                        for(String s:o.getValues()){
                            if(materialService.findByTitle(s)==null) {
                                materialDB.setTitle(s);
                                String id_size = randomId("material");
                                materialDB.setId(id_size);
                                materialService.addMaterial(materialDB);
                                System.out.println("add material done");
                            }
                        }
                        break;

                }
            }
            for(Variant v:p.getVariants()){
                variantDB.setId(v.getId());
                variantDB.setPrice(v.getPrice());
                variantDB.setCompare_at_price(v.getCompareAtPrice());
                variantDB.setWeight(v.getWeight());
                variantDB.setWeight_unit(v.getWeightUnit());
                variantDB.setQuantity(Long.valueOf(v.getInventoryQuantity()));

                variantDB.setProduct(productDB);


                if(v.getOption1()!= null)checkOption(v.getOption1(),variantDB);
                if(v.getOption2()!= null)checkOption(v.getOption2(),variantDB);
                if(v.getOption3()!= null)checkOption(v.getOption3().toString(),variantDB);


                variantService.addVariant(variantDB);
//                productDB.addVariant(variantDB);
                System.out.println("add variant done");
            }

        }
        return productList;
    }
}