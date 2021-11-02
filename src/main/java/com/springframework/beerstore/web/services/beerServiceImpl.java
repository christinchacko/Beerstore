package com.springframework.beerstore.web.services;

import com.springframework.beerstore.web.model.BeerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Slf4j
public class beerServiceImpl implements beerService {
    @Override
    public BeerDto getbeerByID(UUID beerId) {
        return BeerDto.builder().beerId(UUID.randomUUID())
                .beerName("Toburge")
                .beerStyle("No Style here")
                .build();
    }

    @Override
    public BeerDto savedBeer(BeerDto beerDto) {

        return BeerDto.builder().beerId(UUID.randomUUID()).build();

    }

    @Override
    public BeerDto update(UUID beerId, BeerDto beerDto) {
        return null;
    }

    @Override
    public void deleteBeer(UUID beerId) {
        log.debug("Deleting a beer");
    }

}
