public class sortcolors {
    public void sortColors(int[] nums) {
        int n=nums.length;
        int a=0;
        int b=n-1;
        for (int i = 0; i <= b; i++) {
            if (nums[i] == 0) {
                int temp = nums[a];
                nums[a] = nums[i];
                nums[i] = temp;
                a++;
            }
            if (nums[i] == 2) {
                int temp = nums[b];
                nums[b] = nums[i];
                nums[i] = temp;
                b--;
                i--; 
            }
        }
        
        
    }
    
}
