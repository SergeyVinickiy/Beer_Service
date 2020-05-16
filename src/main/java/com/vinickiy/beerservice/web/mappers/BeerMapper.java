package com.vinickiy.beerservice.web.mappers;


import com.vinickiy.beerservice.domain.Beer;
import com.vinickiy.beerservice.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface BeerMapper {

Beer beerDtoToBeer(BeerDto beerDto);
BeerDto beerToBeerDto(Beer beer);

}
