public class Sorts {
    public static void selectSort(int[] vetor){
        for(int i = 0; i < vetor.length; i++){
            int indiceMenor = i;
            for(int j = i+1; j < vetor.length; j++){
                if(vetor[j] < vetor[indiceMenor]){
                    indiceMenor = j;
                }
            }
            int aux = vetor[i];
            vetor[i] = vetor[indiceMenor];
            vetor[indiceMenor] = aux;
        }
    }
    public static void bubbleSort(int[] vetor){
        for (int i = 0; i < vetor.length-1; i++) {
            for (int j = 1; j < vetor.length-i; j++) {
                if(vetor[j-1] > vetor[j]){
                    int aux = vetor[j];
                    vetor[j] = vetor[j-1];
                    vetor[j-1] = aux;
                }
            }
        }
    }
}
