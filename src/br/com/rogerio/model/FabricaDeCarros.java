package br.com.rogerio.model;

import javax.swing.JOptionPane;

/**
 *
 * @author roger
 */
public class FabricaDeCarros {

    private static FabricaDeCarros instance = null;

    private FabricaDeCarros() {
    }

    public static FabricaDeCarros getInstance() {
        if (instance == null) {
            instance = new FabricaDeCarros();
        }
        return instance;
    }

    public static Carro getCarro(String tipoDeCarro) throws Exception {
        Carro objeto = null;
        if (tipoDeCarro.equalsIgnoreCase("gol")) {
            objeto = new Gol();
        } else if (tipoDeCarro.equalsIgnoreCase("celta")) {
            objeto = new Celta();
        } else if (tipoDeCarro.equalsIgnoreCase("palio")) {
            objeto = new Palio();
        } else {
            throw new Exception("O veículo selecionado ainda está "
                    + "em produção!\n");
        }
        return objeto;
    }

    public String imprimir(Carro objeto) {
        String saida = "Marca: " + objeto.getMarca() + "\n"
                + "Modelo: " + objeto.getModelo() + "\n"
                + "Potência do Motor: " + objeto.getPotenciaMotor() + "\n"
                + "Quantidade de Portas: " + objeto.getQuantDePortas() + "\n"
                + "Lista de Opcionais: " + objeto.getOpcionais() + "\n"
                + "Preço: " + objeto.getPreco();
        return saida;
    }
}
