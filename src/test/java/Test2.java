import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Test2 {
   private static Method2 method2;

    @Before
    public void before(){
             System.out.println("@Before");
             method2 = new Method2();
    }

    @After
    public void after(){
        System.out.println("@After");
    }
    @Test
    public void test1(){
        Assert.assertTrue(method2.checkNumbers(new int[]{1, 1, 1, 4, 4, 1, 4, 4}));
    }

    @Test
    public void test2(){
       Assert.assertFalse(method2.checkNumbers(new int[]{1, 1, 1, 1, 1, 1}));
    }

    @Test
    public void test3(){
       Assert.assertFalse(method2.checkNumbers(new int[]{4, 4, 4, 4}));
    }

    @Test
    public void test4(){
      Assert.assertFalse(method2.checkNumbers(new int[]{1, 4, 4, 1, 1, 4, 3}));
    }
}
