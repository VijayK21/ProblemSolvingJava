package Array;

import java.util.Arrays;

public class MissingNum {

	public static void main(String[] args) {
		int[] nums= {3,0,1};  //[0,1] = 2 , [9,6,4,2,3,5,7,0,1] = 8
		int len= nums.length;
        Arrays.sort(nums);
        int missed = -1;
        for(int i=0 ; i<len ; i++){
            if(nums[i]==i){
                continue;
            }
            else{
                missed = i;
                break;
            }
        }
        int res=(missed!=-1)?missed:len;
        System.out.println("Missed number is "+res);
	}

}
