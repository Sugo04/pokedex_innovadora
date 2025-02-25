package psp.examen_servicios.hmarort.pokedex_innovadora.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import psp.examen_servicios.hmarort.pokedex_innovadora.models.Pokemon;
import psp.examen_servicios.hmarort.pokedex_innovadora.services.PokeService;

@RestController
@RequestMapping("/api")
public class PokeController {

    private final PokeService pokeService;

    public PokeController(PokeService pokeService){
        this.pokeService=pokeService;
    }

    /**
     * FindAll de los pokemon de la base de datos
     * @return -> Devolvemos un Map de todos los pokemons
     */
    @GetMapping("/pokemons")
    public Map<String, List<Pokemon>> getAllPokes(){
        Map<String, List<Pokemon>> json = new HashMap<>();
        json.put("Pokemons: ", null);
        return json;
    }

    /**
     * 
     * @return
     */
    @GetMapping("/algo")
    public Map<String, List<Pokemon>> getPoke(){
        Map<String, List<Pokemon>> json = new HashMap<>();
        json.put("Pokes: ", null);
        return json;
    }

    @PutMapping("/save")
    public ResponseEntity<Pokemon> savePoke(@RequestParam Long id){
        // if (!body.containsKey("level")) {
        //     return ResponseEntity.badRequest().build();
        // }
        // int level = body.get("level");
        // Pokemon updated = pokemonService.updatePokemonLevel(id, level);
        // if (updated == null) {
        //     return ResponseEntity.notFound().build();
        // }
        // return ResponseEntity.ok(updated);
        return null;
    }

    @PostMapping("/post")
    public ResponseEntity<Pokemon> createPokemon(@RequestBody Pokemon pokemon) {
        //Pokemon created = pokemonService.createPokemon(pokemon);
        Pokemon created = new Pokemon();
        return new ResponseEntity<>(created, HttpStatus.CREATED);
    }

    @DeleteMapping("/pokemons/{id}")
    public ResponseEntity<Void> deletePokemon(@PathVariable Long id) {
        if (true) {
            //pokemonService.deletePokemon(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }


}
