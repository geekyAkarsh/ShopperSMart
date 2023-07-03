package com.example.ShopperSMart.dto.RequestDto;


import lombok.*;
import lombok.experimental.FieldDefaults;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class SellerRequestDto {

    String name;
    String mobNo;
    String emailId;
}
