import java.util.Scanner;

public class Question3 {

    public  static void main (String[] args) {
        int i;
        int posicao = 0, tam = 0;

        System.out.println("Digite o Tamanho do vetor : "); //Digitar  o numero de elementos que será preenchido
        Scanner sc = new Scanner(System.in);
        tam = sc.nextInt();
        int[] vetor = new int[tam];

        System.out.println("Digite os elementos do vetor : ");
        for (i = 0; i < tam ; i++){
            vetor[i] = sc.nextInt();
        }

        System.out.println("Digite a posição do numero que deseja excluir : ");
        posicao= sc.nextInt();

        calculo(posicao,vetor,tam);

        for (i = 0; i < tam - 1; i++) {
            System.out.println("Novo Vetor: " + vetor[i]);

        }
    }
    public static void calculo( int posicao, int  [] vetor, int tam){
        int i;
        for (i  = posicao; i < tam - 1;  i++){
            vetor[i] = vetor [i + 1];

        }
    }


}

