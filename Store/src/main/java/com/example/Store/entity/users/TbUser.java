package com.example.Store.entity.users;

import com.example.Store.entity.vendors.TbVendor;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "tb_user")
public class TbUser {
    //
    @Id
    private String id;

    @NotBlank
    @Size(max = 50)
    private String username;
    @NotBlank
    @Size(max = 150)
    private String password;
    @NotBlank
    @Size(max = 50)
    @Email
    private String email;
    private Date created_at;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tb_vendor_id")
    private TbVendor vendor;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "tb_user_role",
            joinColumns = @JoinColumn(name = "tb_user_id"),
            inverseJoinColumns = @JoinColumn(name = "tb_role_id"))
    private Set<TbRole> roles = new HashSet<>();

    public TbUser() {
    }

    public TbUser(String id, String username, String password, String email, Date created_at, TbVendor vendor, Set<TbRole> roles) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
        this.created_at = created_at;
        this.vendor = vendor;
        this.roles = roles;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public TbVendor getVendor() {
        return vendor;
    }

    public void setVendor(TbVendor vendor) {
        this.vendor = vendor;
    }

    public Set<TbRole> getRoles() {
        return roles;
    }

    public void setRoles(Set<TbRole> roles) {
        this.roles = roles;
    }
}

