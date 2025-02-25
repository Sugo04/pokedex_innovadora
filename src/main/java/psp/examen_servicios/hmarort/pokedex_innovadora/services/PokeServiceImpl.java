package psp.examen_servicios.hmarort.pokedex_innovadora.services;

import java.util.List;

import org.springframework.stereotype.Service;

import psp.examen_servicios.hmarort.pokedex_innovadora.models.Pokemon;
import psp.examen_servicios.hmarort.pokedex_innovadora.repositories.PokeRepository;

@Service
public class PokeServiceImpl implements PokeService{

    private final PokeRepository pokemonRepository;
    
    public PokeServiceImpl(PokeRepository pokemonRepository) {
        this.pokemonRepository = pokemonRepository;
    }
    @Override
    public List<Pokemon> getAllPokes() {
        return pokemonRepository.findAll();
    }
    
}
