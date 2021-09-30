import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EvenTest {

    @Test
    public void test1(){
        EvenOddClass ob=new EvenOddClass();
        assertEquals(true,ob.isEvenNumber(12));
    }

    @Test
    public void test2(){
        EvenOddClass ob=new EvenOddClass();
        assertEquals(false,ob.isEvenNumber(17));
    }

}
