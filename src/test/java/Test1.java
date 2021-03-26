import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.logging.Logger;

@RunWith(Parameterized.class)
public class Test1 {
    private static final Logger logger = Logger.getLogger(Method1.class.getName());
    private static Method1 method1;
    private int[] arrIn;
    private int[] arrOut;
    public Test1(int[] arrIn, int[] arrOut) {
        this.arrIn = arrIn;
        this.arrOut = arrOut;
    }
    @BeforeClass
    public static void init() {
        method1 = new Method1();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new int[]{1,2, 4, 4, 2, 3, 4, 1,7}, new int[]{1, 7}},
                {new int[]{1, 2, 3, 4}, new int[]{}},
                {new int[]{1, 2, 3,4,4,4,1}, new int[]{1}},
                {new int[]{1, 2, 4, 7}, new int[]{7}}
        });
    }

    @Test
    public void test() {
        Assert.assertArrayEquals(arrOut, Method1.method1(arrIn));
    }
    @Test(expected = RuntimeException.class)
    public void testExc(){
        logger.info("RuntimeException");
        Method1.method1(new int[]{1,2,1});
    }

}
