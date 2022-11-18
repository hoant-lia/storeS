package com.example.Store.entity.users;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity

@Table(name = "tb_role")
public class TbRole {
    @Id
    private String id;

    @Enumerated(EnumType.STRING)
    @Column(length = 20)
    private ERole name;

}
