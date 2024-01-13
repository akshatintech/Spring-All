package string;

public class String2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {4,1,5};
		int max = 100;
	
	
		
		
		

	}
	
	static void selectionsort(int[] nums) {
		int[] solution = new int[nums.length];
		
			int min = Integer.MAX_VALUE;
			for(int i = 0;i<nums.length-1;i++) {
				int minPos = i;
				for(int j=i+1;j<nums.length-1;j++) {
					if(nums[minPos] > nums[j] ) {
						minPos = j;
					}
				}
				
			
		}
	}
	

        
	

}
