import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Test2 {
    String msg="Challenging star";
    Message m=new Message(msg);

    @Test
    public void Test(){
        System.out.println("Inside Test1 testing salutationMsg method");
        msg="hi "+msg;
        assertEquals(msg,m.salutationMsg());
    }
}
