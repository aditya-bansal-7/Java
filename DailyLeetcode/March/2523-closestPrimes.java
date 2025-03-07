class Solution {
    public int[] closestPrimes(int left, int right) {
        ArrayList<Integer> arr = allPrime(left,right);

        int min = Integer.MAX_VALUE;

        int[] res = new int[2];
        res[0] = -1;
        res[1] = -1;

        for(int i = 1; i< arr.size(); i++){
            if(arr.get(i) - arr.get(i-1) < min){
                min = arr.get(i) - arr.get(i-1);
                res[0] = arr.get(i-1);
                res[1] = arr.get(i);
            }
        }
        return res;
    }

    public ArrayList<Integer> allPrime(int left, int right){
        boolean[] arr = new boolean[right+1];
        Arrays.fill(arr,true);
        arr[0] = arr[1] = false;

        for(int i = 2; i * i <= right; i++){
            if(arr[i]){
                for(int j = i*i; j <= right; j += i){
                    arr[j] = false;
                }
            }
        }

        ArrayList<Integer> prime = new ArrayList<>();

        for(int i = left ; i <= right; i++){
            if(arr[i]){
                prime.add(i);
            }
        }
        return prime;
    }
}