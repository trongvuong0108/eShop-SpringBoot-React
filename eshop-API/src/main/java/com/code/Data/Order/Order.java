package com.code.Data.Order;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "orderId")
    private int id ;

    private String address ;
    private String phone ;
    private String note ;
    private String name ;
    private String email;

}
