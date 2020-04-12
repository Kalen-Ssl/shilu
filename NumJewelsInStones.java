package LeetCode;


import java.util.HashSet;
import java.util.Set;

public class NumJewelsInStones{
        public int numJewelsInStones(String J, String S) {
            Set<Character> set = new HashSet<>();
            int count = 0;
            for (char j: J.toCharArray()) {
                set.add(j);
            }
            for (char s:S.toCharArray()) {
                if(set.contains(s)){
                    count++;
                }
            }
//            //1、把J中的字符 存放到集合set当中
//            for(int i=0;i<J.length();i++){
//                char ch=J.charAt(i);
//                set.add(ch);
//            }
//            for(int j=0;j<S.length();j++){
//                if(set.contains(S.charAt(j))){
//                    count++;
//                }
//            }
//            //2、遍历字符串S，判断每一个字符是否存在于集合当中
//              //存在 就让count++;
            return count;
       }
}
