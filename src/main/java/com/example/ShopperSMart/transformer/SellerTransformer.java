package com.example.ShopperSMart.transformer;

import com.example.ShopperSMart.dto.RequestDto.SellerRequestDto;
import com.example.ShopperSMart.dto.ResponseDto.SellerResponseDto;
import com.example.ShopperSMart.model.Seller;
import lombok.experimental.UtilityClass;

@UtilityClass
public class SellerTransformer {

    public static Seller sellerRequestDtoToSeller(SellerRequestDto sellerRequestDto){

        return Seller.builder()
                .name(sellerRequestDto.getName())
                .emailId(sellerRequestDto.getEmailId())
                .mobNo(sellerRequestDto.getMobNo())
                .build();
    }

    public static SellerResponseDto sellerToSellerResponseDto(Seller seller){

        return SellerResponseDto.builder()
                .name(seller.getName())
                .mobNo(seller.getMobNo())
                .build();
    }

}
