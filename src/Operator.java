public class Operator {

    private boolean available;
    private String name;
    private Call call;

    Operator(String name){
        this.name = name;
        available = true;
        call = null;
    }

    public void addCall(Call call) throws Exception {
        if( available ){
            this.call = call;
            available = false;
        }
        else{
            throw new Exception("The operator is not available!");
        }
    }

    public void setAvailable(boolean available){
        this.available = available;
    }

    public boolean getAvailable(){
        return available;
    }
    public String getName(){
        return name;
    }
    public Call getCall(){
        return call;
    }

    public String toString(){
        String str = "The operator " + name;
        if( available ){
            str += " is available";
        }
        else{
            str += " is not available, because he is busy with the call " + call.toString();
        }
        return str;
    }

}
