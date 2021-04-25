package com.breweryservice.brewery.services;

import com.breweryservice.brewery.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {
    BeerDto getBeerById(UUID beerId);
}
