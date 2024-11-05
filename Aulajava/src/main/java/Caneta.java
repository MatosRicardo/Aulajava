public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    void rabiscar() {
        if(tampada == true) {
            System.out.println("Erro!! A caneta está tampada");  //Printar na tela
        } else {
            System.out.println("Pode rabiscar à vontade");
        }
    }

    void tampar() {
        tampada = true;
    }

    void destampar() {
        tampada = false;
    }


    void estado() {
        System.out.println("Essa caneta é do modelo: " + modelo);
        System.out.println("A cor a caneta é:  " + cor);
        System.out.println("O número da ponta é: " + ponta);
        System.out.println("A quantidade de carga atual é: " + carga + "%");
        System.out.println("A caneta está tampada?: " + tampada);
    }
}
