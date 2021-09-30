import static junit.framework.Assert.assertEquals;
import org.junit.Test;

public class Test1 {
    String msg="DBoss";
    Message m=new Message(msg);

    @Test
    public void Test(){
        System.out.println("Inside Test1 testing printMsg method");
        assertEquals(msg,m.printMsg());
    }

}
