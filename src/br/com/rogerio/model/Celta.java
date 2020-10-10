package br.com.rogerio.model;

/**
 *
 * @author roger
 */

// classe concreta estendendo a classe Carro (herança)
public class Celta extends Carro{

    public Celta() {
        opcionais = "Ar Condicionado, direção hidraulica, vidros e travas elétricas";
        preco = (float)(28000.89);
        modelo = "Celta";
        marca = "Chevrolet";
        potenciaMotor = (float)(1.4);
        quantDePortas = 2;
    }
}
