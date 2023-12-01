/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.itsur.pokebatalla.model.moves;

/**
 *
* @author Jorge Osviel Alvarez Medina */
public class Malicioso extends MovimientoEstado {

    public Malicioso() {
        this.tipo = Movimiento.TiposDeMovimiento.ELECTRICO;
        this.potencia = 0;
        this.precision = 100;
        this.puntosPoder = 30;

    }
}
