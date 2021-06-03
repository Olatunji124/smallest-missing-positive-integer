public class SmallestMissingPositiveInteger {

        public static void main(String[] args) {
            System.out.println("======= Smallest Missing Positive Number =======");
            //initialize test values for the array
            int arr[] = { -1, 1, 2, 4, 3, 75 };

            //call the function and  put in a variable
            int smallestNumber = firstMissingPositive(arr);

            //print the result
            System.out.println("The smallest missing positive number = "+smallestNumber);
        }

        //function to calculate smallest positive integer
        public static int firstMissingPositive(int[] nums) {

            //initialize a new array
            int[] arr=new int[nums.length+1];

            //loop through the old array and eliminate -ve integers
            for(int i=0;i<nums.length;i++){
                if(nums[i]>0 && nums[i]<arr.length)
                    arr[nums[i]-1]++;
            }

            //loop through the new array and return 1 when the smallest equals zero
            for(int i=0;i<arr.length;i++){
                if(arr[i]==0){
                    return i+1;
                }
            }
            return 0;
        }


}
