
public class LeetCode88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int j=0;
        for(int i=m;i<m+n;i++){
            nums1[i]=nums2[j];
            j++;
        }
        for(int q=0;q<nums1.length;q++){
         for(int g=q+1;g<nums1.length;g++){
             if(nums1[q]>nums1[g]){
                 int t=nums1[q];
                 nums1[q]=nums1[g];
                 nums1[g]=t;
             }
         }
        }
    }
}
