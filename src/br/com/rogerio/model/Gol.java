package br.com.rogerio.model;

/**
 *
 * @author roger
 */

// classe concreta estendendo a classe Carro (herança)
public class Gol extends Carro {

    public Gol() {
        opcionais = "Ar condicionado e direção hidraulica";
        preco = (float) (28000.0);
        modelo = "Gol";
        marca = "Volkswagem";
        potenciaMotor = (float) (1.6);
        quantDePortas = 4;
    }
}
