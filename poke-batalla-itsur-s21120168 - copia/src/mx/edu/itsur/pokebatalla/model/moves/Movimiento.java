package mx.edu.itsur.pokebatalla.model.moves;

import mx.edu.itsur.pokebatalla.model.pokemons.Pokemon;

/**
 * Esta clase representa nn movimiento o ataque 

* @author Jorge Osviel Alvarez Medina */
public abstract class Movimiento {

    enum TiposDeMovimiento {
        //Primera Generación
        AGUA,
        BICHO,
        DRAGON,
        ELECTRICO,
        FANTASMA,
        FUEGO,
        HIELO,
        LUCHA,
        NORMAL,
        PLANTA,
        PSIQUICO,
        ROCA,
        SINIESTRO,
        TIERRA,
        VENENO,
        VOLADOR
        //Segunda Generación
        //...        
    }

    //Atributos
    protected TiposDeMovimiento tipo;
    protected int potencia;
    protected int precision;
    protected int puntosPoder;

    //Métodos
    public abstract void utilizar(Pokemon usuario, Pokemon objetivo);
}