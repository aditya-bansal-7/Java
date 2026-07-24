class Solution {

    public class LazyHeap{
        int size=0;
        PriorityQueue<Integer> heap;
        Map<Integer,Integer> removed;
        public LazyHeap(Comparator<Integer> c){
            heap=new PriorityQueue<>(c);
            removed=new HashMap<>();
        }
        public int size(){return size;}
        public int poll(){
            int v=peek();
            remove(v);
            return v;
        }
        public int peek(){
            while(removed.getOrDefault(heap.peek(),0)>0){
                int r=heap.poll();
                removed.put(r,removed.get(r)-1);
            }
            return heap.peek();
        }
        public void add(int num){
            size++;
            heap.add(num);
        }
        public void remove(int num){
            size--;
            removed.put(num,removed.getOrDefault(num,0)+1);
        }
        
    }


    LazyHeap minHeap=new LazyHeap(Comparator.naturalOrder());
    LazyHeap maxHeap=new LazyHeap(Collections.reverseOrder());
    int k,n;



    public double[] medianSlidingWindow(int[] nums, int k) {
        n=nums.length;
        this.k=k;
        double[] ans=new double[n-k+1];

        int left=0;
        int right=0;
        while(right<k){
            add(nums[right++]);
        }
        ans[left++]=median();

        while(left<n-k+1){
         
            remove(nums[left-1]);
            add(nums[right++]);
            ans[left++]=median();
        }
        
        return ans;
    }
    public void add(int num){
        minHeap.add(num);
        if(minHeap.size()>maxHeap.size()){
            maxHeap.add(minHeap.poll());
        }
        balance();
    }
    public void remove(int num){
        if(num<minHeap.peek()){
            maxHeap.remove(num);
        }else{
            minHeap.remove(num);
        }
        balance();
    }
    public void balance(){
        while(minHeap.size()>maxHeap.size()+1){
            maxHeap.add(minHeap.poll());
        }
        while(maxHeap.size()>minHeap.size()){
            minHeap.add(maxHeap.poll());
        }
    }
    public double median(){
        return k%2==1?minHeap.peek():((double)minHeap.peek()+(double)maxHeap.peek())/2.0;
    }
}