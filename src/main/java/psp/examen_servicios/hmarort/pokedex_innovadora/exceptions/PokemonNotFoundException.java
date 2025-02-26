package psp.examen_servicios.hmarort.pokedex_innovadora.exceptions;

public class PokemonNotFoundException extends RuntimeException{
    public PokemonNotFoundException (String message){
        super(message);
    }
}
