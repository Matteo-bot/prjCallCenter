public class CallCenter {

    private QueueArray<Call> waitingList;
    ListArray<Operator> operators;

    CallCenter(int sizeOp, int sizeWl){
        this.waitingList = new QueueArray<>(sizeWl);
        this.operators = new ListArray<>(sizeOp);
    }

    public void calls(Call call){
        //...
    }

    public String show(){
        //...
        return "";
    }

}
