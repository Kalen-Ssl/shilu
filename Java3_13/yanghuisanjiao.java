package LeetCode;


import java.util.ArrayList;
import java.util.List;

public class yanghuisanjiao {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ret = new ArrayList<>();
        if (numRows== 0) {
            return ret;
        }
        ret.add(new ArrayList());
        ret.get(0).add(1);
        for(int i=1;i<numRows;i++){
            List<Integer> curRow=new ArrayList<>();
            curRow.add(1);
            List<Integer> prevRow=ret.get(i-1);
            for(int j=1;j<i;j++){
                int num=prevRow.get(j)+prevRow.get(j-1);
                curRow.add(num);
            }
            curRow.add(1);
            ret.add(curRow);
        }
        return ret;+6
    }
}