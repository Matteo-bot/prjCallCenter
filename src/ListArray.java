public class ListArray<T> implements List<T> {

    private T[] elements;
    private int dl;

    ListArray(int size){
        dl = 0;
        elements = (T[]) new Object[ size ];
    }

    @Override
    public void addAtPosition(T element, int position) throws Exception {
        if( elements[position] != null ){
            elements[ position ] = element;
            dl++;
        }
        else{
            throw new Exception("La posizione è già occupata da un altro elemento!");
        }
    }

    @Override
    public void addElement(T element) {
        if( dl<=0 || dl>elements.length ){
            doubleArray();
        }
        elements[ dl-1 ] = element;
        dl++;
    }

    private void doubleArray(){
        T[] newArray = (T[]) new Object[ elements.length*2 ];
        for(int i=0; i<elements.length; i++){
            newArray[i] = elements[i];
        }
        elements = newArray;
    }

    @Override
    public void removeElementAtPosition(int position) throws Exception {
        if( elements[position] != null ){
            elements[position] = null;
            dl--;
        }
        else{
            throw new Exception("Alla posizione " + position + " non è presente alcun elemento da rimuovere!");
        }
    }

    @Override
    public void removeElement(T element) throws Exception {
        boolean found = false;
        int index=0;
        while( index<elements.length && !found ){
            if( elements[index] == element ){
                elements[index]= null;
                dl--;
                found = true;
            }
            else{
                index++;
            }
        }
        if( !found ){
            throw new Exception("Non è stato trovato l'elemento da rimuovere!");
        }
    }

    @Override
    public void modifyElement(T newElement, int position) {
        if( elements[position] == null ){
            dl++;
        }
        elements[position]= newElement;
    }

    @Override
    public T readElement(int position) throws Exception {
        if( elements[position] != null ){
            return elements[position];
        }
        else{
            throw new Exception("Alla posizione " + position + " non è stato trovato alcun elemento");
        }
    }

    @Override
    public int count() {
        return dl;
    }
}
