package com.example.ShopperSMart.model;


import com.example.ShopperSMart.Enum.Category;
import com.example.ShopperSMart.Enum.ProductStatus;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.boot.archive.scan.spi.ClassDescriptor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Column(name = "name")
    String name;

    @Column(name = "category")
    @Enumerated(EnumType.STRING)
    Category category;

    @Column(name = "price")
    Integer price;

    @Column(name = "quantity")
    Integer quantity;

    @Column(name = "product_status")
    @Enumerated(EnumType.STRING)
    ProductStatus productStatus;

    @ManyToOne
    @JoinColumn
    Seller seller;

    @OneToMany(mappedBy = "product",cascade = CascadeType.ALL)
    List<Item> itemList = new ArrayList<>();

}
