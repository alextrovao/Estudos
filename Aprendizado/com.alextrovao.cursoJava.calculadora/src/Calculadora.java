import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("-----Calculadora em Java-------");
        System.out.println("Digite o primeiro número: ");
        double n1 =scanner.nextDouble();

        System.out.println("Digite o segundo número: ");
        double n2 = scanner.nextDouble();

        System.out.println("\nEscolha a operação:");
        System.out.println("1 - Soma (+)");
        System.out.println("2 - Subtração (-)");
        System.out.println("1 - Multiplicação (*)");
        System.out.println("1 - Divisão (/)");
        int escolha = scanner.nextInt();

        System.out.println("Vai comecar a operacao\n");
        Operacao operacao = null;

        switch (escolha) {10
            case 1 -> operacao = new Soma();
            case 2 -> operacao = new Subtracao();
            case 3 -> operacao = new Multiplicacao();
            case 4 -> operacao = new Divisao();
            default ->  System.out.println("Opção Inválida!");
        }
        System.out.println("Executou o calculo\n");

        if (operacao != null) {
            try {
                double resultado = operacao.calcular(n1, n2);
                System.out.println("\nResultado: " + resultado);
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            }
         }

        scanner.close();
    }
}