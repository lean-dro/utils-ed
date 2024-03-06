import java.util.Arrays;

public class ArrayList<T>{
    private Object array[];

    public ArrayList(){
        array = new Object[0];
    }

    public void add(T valor){
        Object arrayNovo[] = new Object[array.length+1];

        for (int i = 0; i < array.length; i++) {
            arrayNovo[i] = this.array[i];
        }
        arrayNovo[arrayNovo.length-1] = valor;
        this.array = arrayNovo;
    }
    
    public Integer size(){
        return this.array.length;
    }

    public void remove(int indice){
        validaIndiceInformado(indice);
        Object arrayNovo[] = new Object[array.length-1];
        int contadorArrayNovo = 0;
        for (int i = 0; i < array.length; i++) {

            if(i!=indice) {
                arrayNovo[contadorArrayNovo] = this.array[i];
                contadorArrayNovo++;
            }

        }
        this.array = arrayNovo;
    }
    public void set(int indice, T valor){
        validaIndiceInformado(indice);

        this.array[indice] = valor;
    }

    public void show(){
        Arrays.stream(this.array).forEach(v->{
            System.out.print(v);
            if(v==this.array[size()-1]) System.out.print("");
            else System.out.print(", ");
        });
    }

    private void validaIndiceInformado(int indice){
        if(indice < 0 || indice >= this.array.length){
            throw  new ArrayIndexOutOfBoundsException("Indice informado é maior ou menor que a quantidade de posições no vetor");
        }


    }





}