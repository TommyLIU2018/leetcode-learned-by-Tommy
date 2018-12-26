/**
	 * ClassName £ºTwo_Sum_001
	 *	 Author  £ºTommyLIU2018
	 *	 Date    £º2018-12-09 16:46:43 Sunday
	 */
public class Two_Sum_001 {
	public static void main(String[] args) {
		int[] nums = {2, 7, 11, 15};
		int target = 13;
		int[] export = twoSum(nums,target);
    	System.out.println("["+export[0]+","+export[1]+"]");

	}
    private static int[] twoSum(int[] nums, int target) {
        int i,j;
        int len =nums.length;
        int[] exprt=new int[2];
        for (i=0;i<len;i++) {
            for (j=i+1;j<len;j++){
                if (nums[i]+nums[j] == target) {
                	exprt[0] = nums[i];
                	exprt[1] = nums[j];
                	return exprt;
                }
            }
        }
        return exprt;
    }
}

