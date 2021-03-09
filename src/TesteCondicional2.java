public class TesteCondicional2 {

    public static void main(String[] args) {

        System.out.println("testando condicionais");

        int idade = 24;
        int quantidadePessoas = 3;
        boolean acompanhado = quantidadePessoas >= 2;

        if (idade >= 18 && acompanhado == true) {

            System.out.println("Seja Bem Vindo");
        } else {
            System.out.println("Infelizmente você não pode entrar");
        }

    }
}
