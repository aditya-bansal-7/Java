
import java.util.ArrayList;

class index {

    static class Heap {

        public ArrayList<Integer> arr;

        public void insert(int data){
            arr.add(data);
            upheap( arr.size() - 1);
           
        }

        public void upheap(int i){
            if(i == 0){
                return;
            }
            if(arr.get(i) < arr.get((i-1)/2)){
                int temp = arr.get((i-1)/2);
                arr.set((i-1)/2, arr.get(i));
                arr.set(i,temp);
                upheap((i-1)/2);
            }
        }

        public int peak(){
            return arr.get(0);
        }

        public void deletePeak(){
            arr.set(0,arr.get(arr.size() - 1));
            int i = 0;
            while( arr.get(i) > arr.get(2*i + 1) || arr.get(i) > arr.get(2*i + 2)){
                if( arr.get(i) > arr.get(2*i + 1) ){
                    int temp = arr.get(2*i + 1);
                    arr.set(2*i + 1, arr.get(i));
                    arr.set(i,temp);
                }else {
                    int temp = arr.get(2*i + 2);
                    arr.set(2*i + 2, arr.get(i));
                    arr.set(i,temp);
                }
            }
        }

        public void print(){
            for(int i = 0; i< arr.size(); i++){
                System.out.println(arr.get(i) + " ");
            }
        }
        public Heap(){
            arr = new ArrayList<>();
        }
    }
        public static void main(String[] args) {
            Heap h = new Heap();

            h.insert(10);
            h.insert(11);
            h.insert(13);
            h.insert(5);
            h.insert(2);
            h.deletePeak();

            h.print();

        }
}