package com.example.ShopperSMart.model;


import com.example.ShopperSMart.Enum.CardType;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.sql.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "card")
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Column(name = "card_no",unique = true,nullable = false)
    String cardNo;

    @Column(name = "cvv",nullable = false)
    int cvv;

    @Column(name = "valid_till")
    Date validTill;

    @Column(name = "card_type")
    @Enumerated(EnumType.STRING)
    CardType cardType;

    @ManyToOne
    @JoinColumn
    Customer customer;
}
