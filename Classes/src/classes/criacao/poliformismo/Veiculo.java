package classes.criacao.poliformismo;

public class Veiculo {

    String cor;
    String modelo;
    int capacidadeTanque;

    Veiculo(){};

    // Sobrecarregando a classe
    Veiculo(String cor, String modelo, int capacidadeTanque){
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;
    };
    //gettes and setters

    //getter e setter cor
    void setCor(String cor){
        this.cor = cor;
    }
    String getCor(){
        return this.cor;
    }

    // getter e setter modelo
    void setModelo(String modelo){
        this.modelo = modelo;
    }
    String getModelo(){
        return modelo;
    }

    // getter e setter capacidade do tanque
    void setCapacidadeTanque(int capacidadeTanque){
        this.capacidadeTanque = capacidadeTanque;
    }

    int getCapacidadeTanque(){
        return capacidadeTanque;
    }

    // metodo para encher o tanque

    public double totalValorTanque(double valorCombustivel ){
        return capacidadeTanque*valorCombustivel;
    }
}
