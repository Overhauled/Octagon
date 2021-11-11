class Solution {
    public String solution(int a, int b) {

        String[] day = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        int[] plus = {5, 1, 2, 5, 0, 3, 5, 1, 4, 6, 2, 4};
        int realPlus = plus[a-1];
        int sum = (realPlus + b) % 7;

        String answer = "";

        if (sum == 0) {
            answer = "SAT";
        }
        else answer = day[sum - 1];

        return answer;

    }
}