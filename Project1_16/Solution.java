class Solution {
    public String intToRoman(int num) {
        int[] numArray=new int[]{1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] romaArray=new String[]{"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        StringBuffer sb=new StringBuffer();

        if(num<0||num>3999)
            return null;
        for(int i=0;i<numArray.length;i++)
        {
            int temp=num/numArray[i];
            while(temp>0)
            {
                sb.append(romaArray[i]);
                temp--;
            }
            num=num%numArray[i];
        }
        return sb.toString();
    }
}