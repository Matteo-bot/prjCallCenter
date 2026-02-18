public class CallCenter {

    private QueueArray<Call> waitingList;
    ListArray<Operator> operators;

    CallCenter(ListArray<Operator> operators, int sizeCall) {
       this.waitingList = new QueueArray<Call>(sizeCall);
       this.operators = operators;
   }


   void calls(Call temp) {
           boolean bool = false;


           for (int i = 0; i < operators.count(); i++) {
               if (!bool && operators.readElement(i).getAveilable()) {
                   operators.readElement(i).addCall(temp);
                   operators.readElement(i).setAveilable(false);
                   bool = true;
               }
           }
           if (!bool) {
               waitingList.enqueue(temp);
           }
       }




   public String toString() {
       String str = " ";
       str += "Opeatori: " + operators.toString();
       str += "\n Waiting List: " + waitingList.toString();
       return str;
   }


}
