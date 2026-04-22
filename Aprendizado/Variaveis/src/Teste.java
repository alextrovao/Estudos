class Exemplo {
    int contadorInstancia = 0;      // Comum
    static int contadorEstatico = 0; // Estática

    Exemplo() {
        contadorInstancia++;
        contadorEstatico++;
    }
}

public class Teste {
    public static void main(String[] args) {
        Exemplo obj1 = new Exemplo();
        Exemplo obj2 = new Exemplo();
        Exemplo obj3 = new Exemplo();
        Exemplo obj4 = new Exemplo();

        // Cada objeto começou seu próprio contador do zero
        System.out.println("Obj1 Instância: " + obj1.contadorInstancia); //
        System.out.println("Obj2 Instância: " + obj2.contadorInstancia); //
        System.out.println("Obj3 Instância: " + obj3.contadorInstancia); //

        System.out.println("Contador Estático: " + Exemplo.contadorEstatico); // Imprime 3

        System.out.println("==========================="); // Imprime =


        System.out.println("Obj1 Instância: " + obj1.contadorInstancia); //
        System.out.println("Obj2 Instância: " + obj2.contadorInstancia); //
        System.out.println("Obj3 Instância: " + obj3.contadorInstancia); //

        // Todos compartilharam o mesmo contador "global" da class
        System.out.println("Contador Estático: " + Exemplo.contadorEstatico); // Imprime 3
    }
}
