public class Main {
    public static void main(String[] args) {

        //Criando os Objetos auau
        Cachorro caramelo = new Cachorro();
        caramelo.nome = "Caramelo";
        caramelo.raça = "Vira-lata";
        caramelo.cor = "Amarelo";
        caramelo.idade = 8;
        caramelo.id = 1;
        //Print para exibir os dados
        caramelo.imprimirDados();

        Cachorro xuxa = new Cachorro();
        xuxa.nome = "Xuxa";
        xuxa.raça = "Dálmata";
        xuxa.cor = "Branca";
        xuxa.idade = 3;
        xuxa.id = 4;
        xuxa.imprimirDados();

        Cachorro lola = new Cachorro();
        lola.nome = "Lola";
        lola.raça = "Golden Retriever";
        lola.cor = "Amarela";
        lola.idade = 4;
        lola.id = 3;
        lola.imprimirDados();

        Cachorro bolinha = new Cachorro();
        bolinha.nome = "Bolinha";
        bolinha.raça = "Pinscher";
        bolinha.cor = "Preto";
        bolinha.idade = 12;
        bolinha.id = 2;
        bolinha.imprimirDados();

    }

}
