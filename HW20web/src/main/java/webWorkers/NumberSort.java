package webWorkers;

import java.util.Arrays;

public class NumberSort {
    public String sortArray(String numbers)  {
        int[] numArray = Arrays.stream(numbers.split(",")).mapToInt(Integer::parseInt).sorted().toArray();
        Arrays.stream(numArray).close();
        return Arrays.toString(numArray);
    }
}
