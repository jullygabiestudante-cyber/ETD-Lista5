import java.util.Scanner;

public class Question4 {


    public static void main(String[] args) {
        int i, j;
        int[] vetor = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite  os elementos do vetor:");
        for ( i =0; i < vetor.length; i++){
           vetor[i] = sc.nextInt();
        }

        VerificarDistintos(vetor);

    }
    public static void VerificarDistintos(int[] vetor) {
        int i, j, quantidade = 0;
        // Novo vetor para amargenar somente os distintos
        int[] vetor2 = new int[5];
        Scanner sc = new Scanner(System.in);

        for (i = 0; i < vetor.length; i++) {
            // Declaro o bollean dentro do for para sempre atualizar a cada vez que passar

            boolean verificardistintos = false;

            for (j = i + 1; j < vetor.length; j++) {

                //Comparação do vetor na posição i com i+ 1
                if (vetor[i] == vetor[j]) {
                   verificardistintos = true;
                }
            }

            if(!verificardistintos){
                vetor2[quantidade]= vetor[i];
                quantidade++;
            }
        }
        System.out.print("Novo Vetor Ordenado : ");
        //Aqui ele imprime até a quantidade que foi prenchido no novo vetor
            for (i = 0; i < quantidade; i++) {
                System.out.print("[" +vetor2[i]);
                System.out.print("]");
            }


        }
    }



