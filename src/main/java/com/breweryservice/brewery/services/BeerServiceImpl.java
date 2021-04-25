package com.breweryservice.brewery.services;

import com.breweryservice.brewery.web.model.BeerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder().id(UUID.randomUUID())
                .beerName("Jeric Brew")
                .beerStyle("Dark Ale")
                .build();
    }
}
