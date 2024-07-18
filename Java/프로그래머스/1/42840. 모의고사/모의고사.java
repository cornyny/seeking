import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] answers) {
        int[] answer = new int[3];
        List<Integer> list = new ArrayList<>();
        int max = 0;
                
        int [] p1 = {1, 2, 3, 4, 5};
        int [] p2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int [] p3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        for (int i =0; i < answers.length; i++){
            if(answers[i] == p1[i%5]) answer[0]++;
            if(answers[i] == p2[i%8]) answer[1]++;
            if(answers[i] == p3[i%10]) answer[2]++;
        }
        // git 궁금
        max = Math.max(answer[0], Math.max(answer[1],answer[2]));
        
        if(max==0) {
            list.add(0);
        }
        else {
            if (max==answer[0])
                    list.add(1);
             if (max==answer[1])
                    list.add(2);
             if (max==answer[2])
                    list.add(3);
       
        }
        
        Collections.sort(list);
        
        return list.stream().mapToInt(i->i).toArray();
    }
}