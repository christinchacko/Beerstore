package com.springframework.beerstore.web.services;

import com.springframework.beerstore.web.model.BeerDto;

import java.util.UUID;


public interface beerService {
    BeerDto getbeerByID(UUID beerId);

    BeerDto savedBeer(BeerDto beerDto);

    BeerDto update(UUID beerId, BeerDto beerDto);

    void deleteBeer(UUID beerId);
}
