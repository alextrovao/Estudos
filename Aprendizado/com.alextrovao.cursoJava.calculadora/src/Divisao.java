public class Divisao implements Operacao {
    @Override
    public double calcular(double a, double b) {

        if (b == 0) {
            throw new ArithmeticException("Erro: Divisão por zero");
        }
        return a / b;
    }
}
