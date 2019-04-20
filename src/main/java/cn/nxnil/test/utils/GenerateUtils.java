package cn.nxnil.test.utils;

import com.google.common.primitives.Ints;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Hello world!
 */
public class GenerateUtils {

    public static int[] generateIntArray(int min, int max, int length) {
        final List<Integer> list = Ints.asList(IntStream.rangeClosed(min, max).toArray());
        Collections.shuffle(list);
        return Ints.toArray(list.stream().limit(length).collect(Collectors.toList()));
    }
}
