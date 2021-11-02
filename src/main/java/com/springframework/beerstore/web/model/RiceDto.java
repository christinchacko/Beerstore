package com.springframework.beerstore.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RiceDto {
    private UUID riceId;
    private String riceName;
    private String riceBrand;
}
