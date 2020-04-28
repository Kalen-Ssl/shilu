package LeetCode;

public class LeetCode185 {
    public int compareVersion(String version1,String version2){
        String[] version1s = version1.split("\\." );
        String[] version2s = version2.split("\\.");
        int size=Math.max(version1.length(),version2.length());
        for(int i=0;i<size;i++){
            int num1=0;
            int num2=0;
            if(i<version1s.length){
                num1=Integer.parseInt(version1s[i]);
            }
            if(i<version2s.length){
                num2=Integer.parseInt(version2s[i]);
            }
            if(num1>num2){
                return 1;
            }else if(num1<num2){
                return -1;
            }
        }
        return 0;
    }
}
