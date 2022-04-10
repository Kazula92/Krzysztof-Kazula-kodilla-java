package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BigmacTestSuite {

    @Test
    void testBigmacNew () {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .ingredient("Onion")
                .bun("With sesame seeds")
                .ingredient("Bacon")
                .burgers(2)
                .sauce("Barbecue")
                .ingredient("Camembert")
                .ingredient("tomato")
                .build();
        System.out.println(bigmac);
        //When
        int howManyIngredients = bigmac.getIngredients().size();
        //Then
        assertEquals(4,howManyIngredients);
    }
}
