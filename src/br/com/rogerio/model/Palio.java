package br.com.rogerio.model;

/**
 *
 * @author roger
 */

// classe concreta estendendo a classe Carro (herança)
public class Palio extends Carro {

    public Palio() {
        opcionais = "Ar condicionado, direção hidraulica, vidros e travas elétricas";
        preco = (float) (32000.0);
        modelo = "Palio";
        marca = "FIAT";
        potenciaMotor = (float) (1.8);
        quantDePortas = 4;
    }
}
