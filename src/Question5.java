public class Question5 {


     public static void main(String[] args) {
            int [] vetor1 = {1,3,5,7,9};
            int [] vetor2 = {0,2,4,8};
            int [] vetor3 = new int [9];
            fusaoVetor(vetor1,vetor2,vetor3);
        }
        public static void fusaoVetor(int[] vetor1, int [] vetor2, int []vetor3){
            int i = 0, j = 0, k = 0;

            while(i < vetor1.length && j < vetor2.length){

                if(vetor1[i] < vetor2[j]){
                    vetor3[k] = vetor1[i];

                    i++;

                }else {
                    vetor3[k] = vetor2[j];

                    j++;
                }

                k++;

            }
            //Caso ainda existam elementos no vetor1
            while (i < vetor1.length) {
                vetor3[k] = vetor1[i];
                i++;
                k++;
            }

            //Caso ainda existam elementos no vetor2
            while (j < vetor2.length) {
                vetor3[k] = vetor2[j];
                j++;
                k++;
            }
            System.out.println("Vetor Ordenado :");

            for( i = 0; i < vetor3.length; i++){
                System.out.println(vetor3[i]);
            }

        }
    }

