package com.example.ShopperSMart.model;


import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.print.attribute.standard.OutputDeviceAssigned;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "item")
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Column(name = "required_quantity")
    Integer requiredQuantity;

    @ManyToOne
    @JoinColumn
    Product product;

    @ManyToOne
    @JoinColumn
    OrderEntity orderEntity;

    @ManyToOne
    @JoinColumn
    Cart cart;
}
