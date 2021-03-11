public class TestaCondicional {

    public static void main(String[] args) {

        System.out.println("testando condicionais com java");

        int idade = 16;
        int quantidadePEsosas = 3;

        if (idade >= 18) {

            System.out.println("Você tem mais de 18 anos");
        } else {
            if (quantidadePEsosas >= 2) {

                System.out.println("Você não tem 18 mas pode entrar, mas você está acompanhado de " + quantidadePEsosas
                        + " pessoas.");
            }

            System.out.println("Infelizmente você não pode entrar");
        }

    }
}
