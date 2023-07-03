package com.example.ShopperSMart.service;

import com.example.ShopperSMart.dto.RequestDto.SellerRequestDto;
import com.example.ShopperSMart.dto.ResponseDto.SellerResponseDto;

public interface SellerService {

    public SellerResponseDto addSeller(SellerRequestDto sellerRequestDto);

}
