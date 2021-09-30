public class Message {
    private String msg;

    public Message(String msg) {
        this.msg = msg;
    }

    public String printMsg(){
        System.out.println(msg);
        return msg;
    }

    public String salutationMsg(){
        msg="Hi "+msg;
        System.out.println(msg);
        return msg;
    }
}
