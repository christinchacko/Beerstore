package com.springframework.beerstore.web.controller;


import com.springframework.beerstore.web.model.RiceDto;
import com.springframework.beerstore.web.services.riceService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;


@RestController
@RequestMapping("/api/store/rice")
public class RiceController {

    private final riceService riceService;

    public RiceController(riceService riceService) {
        this.riceService = riceService;
    }

    @GetMapping("/{riceId}")
    public ResponseEntity<RiceDto> getRice (@PathVariable("riceId") UUID riceId){

        return new ResponseEntity<>(riceService.getRiceById(riceId), HttpStatus.OK);
    }
}
