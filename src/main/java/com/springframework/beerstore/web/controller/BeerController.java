package com.springframework.beerstore.web.controller;

import com.springframework.beerstore.web.model.BeerDto;
import com.springframework.beerstore.web.services.beerService;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RequestMapping("/api/v1/Beer")
@RestController
public class BeerController {

    private final beerService beerService;

    public BeerController(beerService beerService) {
        this.beerService = beerService;
    }

    @GetMapping("/{beerId}")
    public ResponseEntity<BeerDto> getBeer(@PathVariable("beerId") UUID beerId) {

        return new ResponseEntity<>(beerService.getbeerByID(beerId), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity handlePost(BeerDto beerDto){

        BeerDto savedDto = beerService.savedBeer(beerDto);

        HttpHeaders headers = new HttpHeaders();
        headers.add("location", "/api/v1/Beer"+ beerDto.getBeerId().toString());
        return new ResponseEntity(headers, HttpStatus.CREATED);
    }

    @PutMapping("/{beerId}")
    public ResponseEntity updateBeer(@PathVariable("beerId") UUID beerId, BeerDto beerDto){
        beerService.update(beerId, beerDto);

        return new ResponseEntity(HttpStatus.NO_CONTENT);

    }

    @DeleteMapping("/{beerId}")
    @ResponseStatus
    public void deleteBeer(@PathVariable("beerId") UUID beerId){

        beerService.deleteBeer(beerId);
    }

}
