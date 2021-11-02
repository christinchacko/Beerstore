package com.springframework.beerstore.web.services;

import com.springframework.beerstore.web.model.RiceDto;

import java.util.UUID;

public interface riceService {

    public RiceDto getRiceById(UUID riceID);
}
