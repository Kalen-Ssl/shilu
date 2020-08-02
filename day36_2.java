package days;

import java.util.ArrayList;
import java.util.Collections;


//最小的K个数
public class day36_2 {
    public static void main(String[] args) {

    }

    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> res = new ArrayList();
        if(input.length < k || k <= 0) {
            return res;
        }
        for(int i = 0; i < input.length; i++) {
            if(res.size() < k) {
                res.add(input[i]);
            }
            else {
                int max = Collections.max(res);
                if(max > input[i]) {
                    res.set(res.indexOf(max), input[i]);
                }
            }
        }
        return res;
    }

}
