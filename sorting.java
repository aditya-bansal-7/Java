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

    public static void mergeSort(int arr[], int si , int ei ){
        if (si >= ei) {
            return;
        }
        int mid = si + (ei-si)/2;
        
        mergeSort(arr, si, mid);
        mergeSort(arr, mid+1, ei);
        merge(arr,si , mid ,ei);
    }

    public static void merge(int arr[], int si , int mid , int ei){
        int temp[] = new int[ei-si + 1];

        int i = si;
        int j = mid+1;
        int k = 0;

        while (i <=mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            }else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        while (i<=mid) {
            temp[k++] = arr[i++];
        }
        while (j<=ei) {
            temp[k++] = arr[j++];
        }

        for (k = 0 , i=si ; k<temp.length; i++,k++){
            arr[i] = temp[k];
        }

    }


    public static void printArr(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] +  " ");
        }
    }

    public static void main(String[] args) {
        int nums[] = {2,4,6,7,11,3,2,-1};
        mergeSort(nums , 0 , nums.length-1);
        printArr(nums);
    }
}


