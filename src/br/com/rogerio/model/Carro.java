/*
* Implementação do pradrão de projeto Factory   
* Exemplo proposto pelo professor Eugênio
*
 */
package br.com.rogerio.model;

/**
 *
 * @author roger
 */

// classe abstrata Carro com seus atributos e métodos que serão usados pelas
// subclasses que a estenderem
public abstract class Carro {

    protected String opcionais;
    protected float preco;
    protected String modelo;
    protected String marca;
    protected float potenciaMotor;
    protected int quantDePortas;

    public String getOpcionais() {
        return opcionais;
    }

    public float getPreco() {
        return preco;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public float getPotenciaMotor() {
        return potenciaMotor;
    }

    public int getQuantDePortas() {
        return quantDePortas;
    }
}
