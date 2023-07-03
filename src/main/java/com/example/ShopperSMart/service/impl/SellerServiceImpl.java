package com.example.ShopperSMart.service.impl;

import com.example.ShopperSMart.dto.RequestDto.SellerRequestDto;
import com.example.ShopperSMart.dto.ResponseDto.SellerResponseDto;
import com.example.ShopperSMart.model.Seller;
import com.example.ShopperSMart.repository.SellerRepository;
import com.example.ShopperSMart.service.SellerService;
import com.example.ShopperSMart.transformer.SellerTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class SellerServiceImpl implements SellerService {

    @Autowired
    SellerRepository sellerRepository;

    @Override
    public SellerResponseDto addSeller(SellerRequestDto sellerRequestDto) {

        Seller seller = SellerTransformer.sellerRequestDtoToSeller(sellerRequestDto);

        Seller savedSeller = sellerRepository.save(seller);

        return SellerTransformer.sellerToSellerResponseDto(savedSeller);
    }
}
