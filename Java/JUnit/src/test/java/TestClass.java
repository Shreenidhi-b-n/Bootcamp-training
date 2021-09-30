import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestClass {

    @Test
    public void test(){
        int val1=15;
        int val2=20;

        assertTrue(val1<val2);
        assertFalse(val1<val2);

        String s1="hello";
        String s2="hello";
        assertSame(s1,s2);

        String[] arr1={"one","two","three"};
        String[] arr2={"one","two","three"};

        assertArrayEquals(arr1,arr2);

        assertEquals(s1,s2);

    }
}
