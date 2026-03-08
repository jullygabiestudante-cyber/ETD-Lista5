import  java.util.Scanner;

public class Question2 {

    public static void main(String[] args) {
        int[] vetor = new int[2];
        int numero = 0, i;
        String opcao;
        int quantidade = 0;
        Scanner sc = new Scanner(System.in);
        do {

            if (quantidade == vetor.length) {
                System.out.println("O Vetor está cheio");
                vetor = DobrarVetor(vetor);
            }

            System.out.println("Deseja inserir um numero [s/n]");

            opcao = sc.next();

            if (opcao.equalsIgnoreCase("s")) {
                System.out.println("Digite um numero para inserir :");
                numero = sc.nextInt();
                vetor[quantidade] = numero;
                quantidade++;

                if (quantidade < vetor.length) {
                    for (i = 0; i < vetor.length; i++) {

                        System.out.println("Numero  que ocupa a posicão :" +i + " do Vetor :" + vetor[i]);

                    }
                }
            }


            if (opcao.equalsIgnoreCase("n")) {
                break;

            }

        } while (opcao.equalsIgnoreCase("s"));
        sc.close();

    }

    public static int[] DobrarVetor(int[] vetor) {

        int i;
        int[] vetor2 = new int[vetor.length * 2];

        for (i = 0; i < vetor.length; i++) {
            vetor2[i] = vetor[i];
            System.out.println("Numero  que ocupa a posicão :" +i + " do Vetor :" + vetor2[i]);

        }
        return vetor2;
    }

}
