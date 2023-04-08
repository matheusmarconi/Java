package classes.criacao.poliformismo;

public class Caminhao extends Veiculo {

    // A classe caminhao herda atributos e métodos da classe mãe "Veículos"
    int ano, eixos;
    String carga;

    Caminhao(){};

    Caminhao(int ano, int eixos, String carga){
        this.ano = ano;
        this.eixos = eixos;
        this.carga = carga;
    }

    void setAno(int ano){
        this.ano = ano;
    }

    int getAno(){
        return ano;
    }

    void setEixos(int eixos){
        this.eixos = eixos;
    }

    int getEixos(){
        return eixos;
    }

    void setCarga(String carga){
        this.carga = carga;
    }

    String getCarga(){
        return carga;
    }
}

