package com.vinickiy.beerservice.services;

import com.vinickiy.beerservice.web.model.BeerDto;
import java.util.UUID;

public interface BeerService {

    BeerDto getById(UUID beerId);

    BeerDto saveNewBeer(BeerDto beerDto);

    BeerDto updateBeer(BeerDto beerDto, UUID beerId);
}

