public class TesteCaneta {  //Metodo princiapal, ele que faz a execução
    public static void main(String[] args) {
        Caneta caneta1 = new Caneta();

        caneta1.modelo = "Esferografica";
        caneta1.cor = "Azul";
        caneta1.ponta = 0.5f; //F de float
        caneta1.carga = 90;
       /* caneta1.tampada = false;*/

        caneta1.tampar();   /* pode dar diretamente o metodo*/
        caneta1.estado();
        caneta1.rabiscar();

        System.out.println("-----------------------------------------------------");

        Caneta caneta2 = new Caneta();

        caneta2.modelo = "Hidrografica";
        caneta2.cor = "preto";
        caneta2.ponta = 0.5f; //F de float
        caneta2.carga = 60;
        /* caneta1.tampada = false;*/

        caneta2.tampar();   /* pode dar diretamente o metodo*/
        caneta2.estado();
        caneta2.rabiscar();

    }
}
