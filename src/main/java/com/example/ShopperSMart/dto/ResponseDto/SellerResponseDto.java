package com.example.ShopperSMart.dto.ResponseDto;


import lombok.*;
import lombok.experimental.FieldDefaults;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class SellerResponseDto {

    String name;
    String mobNo;

}
