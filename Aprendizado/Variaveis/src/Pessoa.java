 public class Pessoa {
     private String nome;
     //Bloco statico
     static {
         System.out.println("Bloco  estático executado.");

     }
    // Bloco não estático
    {
     System.out.println("Bloco não estático executado.");
        nome = "Nome padrão";
     }

     public Pessoa(String nome) {
        this.nome = nome;
     }
     public String getNome() {
     return nome;
     }


     public static void main(String[] args) {
       Pessoa joao = new Pessoa ("João");
       System.out.println("Nome: " + joao.getNome());
       Pessoa maria = new Pessoa("Maria");
       System.out.println("Nome: " + maria.getNome());
     }
}
