package com.aakash.produceandaccept.controller;

import com.aakash.produceandaccept.pokemonDao;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class pokemonController {

    @GetMapping(value = "/pokemon/{pName}" , produces = {"application/json","application/xml"})
    public ResponseEntity<pokemonDao> pokemonInfo (@PathVariable String pName) {


        pokemonDao pikachu = new pokemonDao();
        pikachu.setPokemonName("Pikachu");
        pikachu.setPokemonType("Electric");
        pikachu.setPokemonColor("Yellow");
        pikachu.setPokemonSize("Small");

        pokemonDao charizard = new pokemonDao();
        charizard.setPokemonName("Charizard");
        charizard.setPokemonType("Fire/Flying");
        charizard.setPokemonColor("Orange");
        charizard.setPokemonSize("Large");

        pokemonDao balbasaur = new pokemonDao();
        balbasaur.setPokemonName("Bulbasaur");
        balbasaur.setPokemonType("Grass/Poison");
        balbasaur.setPokemonColor("Green");
        balbasaur.setPokemonSize("Small");

        pokemonDao squirtle = new pokemonDao();
        squirtle.setPokemonName("Squirtle");
        squirtle.setPokemonType("Water");
        squirtle.setPokemonColor("Blue");
        squirtle.setPokemonSize("Small");


        if (pName.equals("pikachu")) {
            return ResponseEntity.ok(pikachu);
        }
        if (pName.equals("charizard")) {
            return ResponseEntity.ok(charizard);
        }
        if (pName.equals("bulbasaur")) {
            return ResponseEntity.ok(balbasaur);
        }
        if (pName.equals("squirtle")) {
            return ResponseEntity.ok(squirtle);
        }
        return ResponseEntity.notFound().build();
    }
}
