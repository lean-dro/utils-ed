public class Search {
    public static int simple(int[] vetor, int valor){
        int indiceEncontrado = -1;
        for (int i = 0; i < vetor.length; i++) {
            if(vetor[i] == valor){
                indiceEncontrado = i;
            }
        }
        return indiceEncontrado;
    }
    public static int binary(int[] vetor, int valor){
        int indiceSuperior = vetor.length-1;
        int indiceInferior = 0;


        while(indiceInferior <= indiceSuperior){
            int meio = (indiceInferior+indiceSuperior)/2;
            if(vetor[meio] == valor){
                return meio;
            }else if(vetor[meio] > valor){
                indiceSuperior = meio-1;
            }else{
                indiceInferior = meio+1;
            }
        }
        return -1;
    }


}
