class Solution {
    public int minOperations(int[] nums, int k) {
        PriorityQueue<Integer> heap = new PriorityQueue<>();

        for(int i = 0; i < nums.length; i++){
            if(nums[i] < k){
                heap.add(nums[i]);
            }
        }
        int count = 0;

        while(!heap.isEmpty()){
            
            int num1 = heap.remove();
            count++;

            if(heap.isEmpty()) return count;
            int num2 = heap.remove();

            int minNum = num1 < num2 ? num1 : num2;
            int secNum = num1 == minNum ? num2 : num1;

            int newNum = (2* minNum) + secNum;
            

            if( newNum > 0 && newNum < k) heap.add(newNum) ;
        }

        return count;
    }
}