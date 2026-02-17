public class QueueArray<T> implements Queue<T> {

    private T[] queue;
    private int size, dl, head, tail;

    QueueArray(int size){
        this.size = size;
        dl = 0;
        head = 0;
        tail = -1;
        queue = (T[]) new Object[ this.size ];
    }

    @Override
    public void enqueue(T element) {
        if( (tail == size -1  &&  head==0 )  ||  ( tail == head-1 ) ){
            doubleArray();
        }
        tail = (tail+1) % size;
        queue[ tail ] = element;
        dl++;
    }

    private void doubleArray(){
        T[] newArray = (T[]) new Object[ queue.length*2 ];
        int index = 0;
        while( index <= tail ){
            newArray[index]= queue[index];
            index++;
        }
        if( head > tail ){
            index = size+index;
            head = index;
            while( index<size ){
                newArray[index]= queue[index];
                index++;
            }
        }
        size = size * 2;
        queue = newArray;
    }

    @Override
    public T dequeue() throws Exception {
        T ris;
        if( dl>0 ){
            ris = queue[ head ];
            queue[ head ] = null;
            head = (head+1) % size;
            dl--;
        }
        else{
            throw new Exception("The queue is empty!");
        }
        return ris;
    }

    @Override
    public int count() {
        return dl;
    }

    @Override
    public String show() {
        String str = "Queue: ";
        int count = 0;
        for(int i=head; count<dl; count++){
            if( i==size-1 ){
                i = 0;
            }
            str += "\n   " + queue[ i].toString();
        }
        return str;
    }
}
