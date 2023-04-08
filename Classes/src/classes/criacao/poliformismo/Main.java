package classes.criacao.poliformismo;

public class Main {
    public static void main(String[] args) {

        //Veiculo caminhao = new Caminhao(); // Upcast da Classe Caminhão -> Veículo
        //Caminhao carreta = (Caminhao) new Veiculo(); // Fazendo downcast de Veiculo para caminhão (tomar cuidado)
        ClasseMae objetoMae = new ClasseMae();
        ClasseMae objetoFilho1 = new ClasseFilha1();
        ClasseMae objetoFilho2 = new ClasseFilha2();

        objetoMae.metodo1();
        objetoFilho1.metodo1();
        objetoFilho2.metodo1();

        objetoMae.metodo2();
        objetoFilho1.metodo2();
        objetoFilho2.metodo2();



    }
}
