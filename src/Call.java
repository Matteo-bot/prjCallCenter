public class Call {

    private int id;
    private String number;

    Call(int id, String number){
        this.id = id;
        this.number = number;
    }

    public int getId(){
        return id;
    }
    public String getNumber(){
        return number;
    }

    public String toString(){
        return "The call has the id '" + id + "' and it's from " + number + " phone number";
    }

}
