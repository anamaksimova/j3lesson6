import java.util.Arrays;
import java.util.logging.Logger;

public class Method1 {
    private static final Logger logger = Logger.getLogger(Method1.class.getName());
    static int[] arrOut;
    public static void main(String[] args) {

        int [] arr1 = {1,2, 4, 4, 2, 3, 4, 1,7};
        int [] arr2 = {1,2, 4, 4, 2, 3, 2, 1,4};
        int [] arr = {1, 5, 3};
        int [] arr5 = {};
      try{
          method1(arr5);
          System.out.println(Arrays.toString(method1(arr1)));
          method1(arr);
          System.out.println(Arrays.toString(method1(arr2)));
          method1(arr2);

    }
      catch (RuntimeException e) {
          System.out.println("Число 4 отсутствует ");
      }
    }

    public static int[]  method1 (int[] arrIn) {
        int a = 0;
        if(arrIn.length == 0) {
            logger.info("Массив пуст");
            return arrIn;
        }
        int x=4;
        int [] copyArrIn = Arrays.copyOf(arrIn, arrIn.length);
        Arrays.sort(copyArrIn);
        int index = Arrays.binarySearch(copyArrIn,x);
        if (index>=0) {
            for (int i = arrIn.length-1; i >0 ; i--) {

            if (arrIn[i]==4) {
                a=i;
                System.out.println("Исходный массив " + Arrays.toString(arrIn));
                break;
            }
        }

        return arrOut= Arrays.copyOfRange(arrIn, a+1,arrIn.length);
        } else {
            throw new RuntimeException("Число 4 отсутствует");}
        }

    }

