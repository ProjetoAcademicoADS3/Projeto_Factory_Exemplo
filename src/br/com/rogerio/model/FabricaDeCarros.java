package br.com.rogerio.model;

/**
 *
 * @author roger
 */
public class FabricaDeCarros {
    
    private static FabricaDeCarros instance = null;
    
    private FabricaDeCarros(){
    }
    
    public static FabricaDeCarros getInstance(){
        if (instance == null) {
            instance = new FabricaDeCarros();
        }
        return instance;
    }

    public static Carro getCarro(String tipoDeCarro) {
        Carro objeto = null;

        if (tipoDeCarro.equalsIgnoreCase("gol")) {
            objeto = new Gol();
        } else if (tipoDeCarro.equalsIgnoreCase("celta")) {
            objeto = new Celta();
        }else if(tipoDeCarro.equalsIgnoreCase("palio")){
            objeto = new Palio();
        }
        return objeto;
    }
    
     public String imprimir(Carro objeto){
        String saida = "Marca: " + objeto.getMarca() + "\n"
                + "Modelo: " + objeto.getModelo() + "\n"
                + "Potência do Motor: " + objeto.getPotenciaMotor() + "\n"
                + "Quantidade de Portas: " + objeto.getQuantDePortas() + "\n"
                + "Lista de Opcionais: " + objeto.getOpcionais() + "\n"
                + "Preço: " + objeto.getPreco();
        return saida;
    }
}
