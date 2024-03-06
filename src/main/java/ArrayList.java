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


}