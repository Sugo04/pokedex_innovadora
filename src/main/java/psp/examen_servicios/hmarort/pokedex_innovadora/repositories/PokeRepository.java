package psp.examen_servicios.hmarort.pokedex_innovadora.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import psp.examen_servicios.hmarort.pokedex_innovadora.models.Pokemon;

public interface PokeRepository extends JpaRepository<Pokemon, Long>{
    List<Pokemon> findByNameStartingWith(String name);
}
