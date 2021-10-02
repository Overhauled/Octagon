import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Solution {
    public long solution(long n) {
        long answer = 0;

        int[] arr = Stream.of(String.valueOf(n).split("")).mapToInt(Integer::parseInt).toArray();
        Integer[] arr2 = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Arrays.sort(arr2, Collections.reverseOrder());
        int[] arr3 = Arrays.stream(arr2).mapToInt(Integer::intValue).toArray();

        answer = Long.parseLong(Arrays.stream(arr3)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining()));

        return answer;

    }
}