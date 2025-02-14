class ProductOfNumbers {

    public ArrayList<Integer> arr;
    public int size;
    public int lastIndex;

    public ProductOfNumbers() {
        arr = new ArrayList<>();
        size = 0;
        lastIndex = -1;
    }
    
    public void add(int num) {
        arr.add(num);
        size++;
        if(num == 0){
            lastIndex = size - 1;
        }
        
    }
    
    public int getProduct(int k) {
        if(size - k <= lastIndex){
            return 0;
        }else {
            int product = 1;
            for(int i = size-k ; i<arr.size() ; i++ ){
                product *= arr.get(i);
            }
            return product;
        }
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */