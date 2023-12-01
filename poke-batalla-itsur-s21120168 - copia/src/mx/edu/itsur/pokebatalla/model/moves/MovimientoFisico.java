package mx.edu.itsur.pokebatalla.model.moves;

import mx.edu.itsur.pokebatalla.model.pokemons.Pokemon;

/**
 * Es una clase de movimiento con impacto físico.
 * 
* @author Jorge Osviel Alvarez Medina */
public class MovimientoFisico extends Movimiento {
    @Override
    public void utilizar(Pokemon usuario, Pokemon objetivo) {
        System.out.println("APLICANDO MOVIMIENTO FISICO");

        //Calcular el daño
        int nivelAtacante = usuario.getNivel();
        int ataqueAtacante = usuario.getAtaque();
        int poderMovimiento = this.puntosPoder; //this.getPoder();
        int defensaObjetivo = objetivo.getDefensa();
        
        //Calcular el modificador, considerando tipos.
        double modificador = 1.0; // Modificador base (sin modificaciones)       
        //if ()... POR HACER, TOMAR EN CUENTA CLASE DE MOVIMIENTO Y TIPO DE POKEMON
        
        int danio = (int) (((
                ((2 * nivelAtacante / 5 + 2) 
                        * ataqueAtacante 
                        * poderMovimiento / defensaObjetivo) 
                  / 50) + 2) * modificador);
        
        objetivo.recibirDanio(danio); 

        //Imprimir efecto del movimiento en consola
        System.out.println(
                         usuario.getClass().getSimpleName() + " aplica " + 
                         this.getClass().getSimpleName() + " a " +  
                         objetivo.getClass().getSimpleName() + " y causa danio de " +
                         danio);
         if (objetivo.getHP() <= 0) {
            objetivo.setHp(0);
        }
        System.out.println("El objetivo quedo asi: " + objetivo);  
    }    
}