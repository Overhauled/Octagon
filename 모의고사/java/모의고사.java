import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] answers) {

        int[] student1 = {1, 2, 3, 4, 5,};
        int[] student2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] student3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] answer = {0, 0, 0};

        for(int i=0; i < answers.length; i++) {
            if (student1[i%student1.length] == answers[i]) answer[0]++;
            if (student2[i%student2.length] == answers[i]) answer[1]++;
            if (student3[i%student3.length] == answers[i]) answer[2]++;
        }

        int max = Arrays.stream(answer).max().getAsInt();

        ArrayList<Integer> list = new ArrayList<Integer>();

        if(max==answer[0]) list.add(1);
        if(max==answer[1]) list.add(2);
        if(max==answer[2]) list.add(3);
        
        int[] winner = new int[list.size()];
        for (int i=0; i < winner.length; i++)
        {
            winner[i] = list.get(i).intValue();
        }
        
        return winner;       
    }
}