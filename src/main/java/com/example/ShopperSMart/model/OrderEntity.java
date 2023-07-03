package com.example.ShopperSMart.model;


import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.CreationTimestamp;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "order_info")
public class OrderEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Column(name = "order_no")
    String orderNo; // uuid

    @Column(name = "total_value")
    Integer totalValue;

    @CreationTimestamp
    @Column(name = "order_date")
    Date orderDate;

    @Column(name = "card_used")
    String cardUsed;

    @ManyToOne
    @JoinColumn
    Customer customer;

    @OneToMany(mappedBy = "orderItem",cascade = CascadeType.ALL)
    List<Item> itemList = new ArrayList<>();

}
