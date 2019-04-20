package cn.nxnil.test.charpter1;

import cn.nxnil.test.utils.GenerateUtils;
import com.google.common.base.Joiner;
import org.junit.Test;

import java.util.Arrays;
import java.util.function.DoubleConsumer;

import static org.junit.Assert.*;

/**
 * Created by liuyangsheng on 2019/4/20.
 *
 * @Description:
 * @Modified By:
 */
public class SimpleHandlerForArrayTest {

    /**
     * find max in a array
     *
     * @throws Exception
     */
    @Test
    public void findMaxValueInArray() throws Exception {

        final int[] ints = generateArray();
        // final String toString = Arrays.stream(ints).boxed().map(String::valueOf).reduce("", (a, b) -> a + "," + b);
        System.out.println(Arrays.toString(ints));
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < ints.length; i++) {
            final int positionInt = ints[i];
            if (positionInt > max) {
                max = positionInt;
            }
        }
        System.out.println("max is :" + max);
    }

    /**
     * @throws Exception
     */
    @Test
    public void averageArray() throws Exception {

        final int[] ints = generateArray();
        int sum = Integer.valueOf(0);
        for (int i = 0; i < ints.length; i++) {
            final int positionInt = ints[i];
            sum += positionInt;
        }
        System.out.println("average is :" + (sum + 0d) / ints.length);
        Arrays.stream(ints).average().ifPresent(p -> System.out.println("Actual average is :" + p));
    }


    @Test
    public void revert() throws Exception {
        final int[] ints = generateArray();
        for (int i = 0; i < ints.length / 2; i++) {
            int temp = ints[i];
            ints[i] = ints[ints.length - i - 1];
            ints[ints.length - i - 1] = temp;
        }
        System.out.println("reversed array is: " + Arrays.toString(ints));

    }

    private int[] generateArray() {
        final int[] ints = GenerateUtils.generateIntArray(1, 10, 5);
        System.out.println("origin array: " + Arrays.toString(ints));
        return ints;
    }


}