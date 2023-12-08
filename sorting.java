public class sorting {
    public static void bubbleSort(int[] args) {
        for (int i = 0; i < args.length-1; i++) {
            for (int j = 0; j < (args.length-1-i); j++) {
                if(args[j]>args[j+1]){
                    int temp = args[j];
                    args[j] = args[j+1];
                    args[j+1] = temp;
                }
            }
        }
        
    }

    public static void selectionSort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int minP = i;
            for (int j = i+1; j < nums.length; j++) {
                if(nums[j]<nums[minP]){
                    minP = j;
                }
                
            }
            int temp = nums[i];
            nums[i] = nums[minP];
            nums[minP] = temp;
        }
    }

    public static void insertionSort(int[] nums) {   
        for (int i = 1; i < nums.length; i++) {
            int curr = nums[i];
            int prv = i-1;
            while (prv >= 0 && nums[prv] > curr) {
                nums[prv+1] = nums[prv];
                prv--;
                
            }
            nums[prv+1] = curr;
        }
    }


    public static void printArr(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] +  " ");
        }
    }

    public static void main(String[] args) {
        int nums[] = {2,4,6,7,11,3,2};
        insertionSort(nums);
        printArr(nums);

    }
}


