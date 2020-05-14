package com.vinickiy.beerservice.bootstrap;

import com.vinickiy.beerservice.domain.Beer;
import com.vinickiy.beerservice.repositories.BeerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class BeerLoader implements CommandLineRunner {

    private final BeerRepository beerRepository;

    public BeerLoader(BeerRepository beerRepository) {
        this.beerRepository = beerRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        loadBeerObject();
    }

    private void loadBeerObject(){
        if(beerRepository.count() == 0){
            beerRepository.save(Beer.builder()
                    .beerName("Goldstar")
                    .beerStyle("IPA")
                    .quantityToBrew(200)
                    .upc(21321545L)
                    .minOnHand(12)
                    .price(new BigDecimal("12.95"))
                    .build());

            beerRepository.save(Beer.builder()
                    .beerName("Galaxy Cat")
                    .beerStyle("IPA")
                    .quantityToBrew(200)
                    .upc(213215345L)
                    .minOnHand(12)
                    .price(new BigDecimal("11.95"))
                    .build());
        }
    }

}
