package com.springframework.beerstore.web.services;

import com.springframework.beerstore.web.model.RiceDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class riceServiceImpl implements riceService {


    @Override
    public RiceDto getRiceById(UUID riceID) {
        return RiceDto.builder().riceId(UUID.randomUUID())
                .riceName("Neendor Rice")
                .riceBrand("Neendor")
                .build();
    }
}
