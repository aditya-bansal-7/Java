import java.util.ArrayList;
// import java.util.Stack;

public class Stacks {

    public class Stack<T> {
        private int top;
        private ArrayList<T> arr;

        public Stack() {
            this.top = -1;
            this.arr = new ArrayList<>();
        }

        public boolean empty() {
            return top < 0; 
        }

        public void push(T data) {
            arr.add(++top, data);
        }

        public T pop() throws Exception {
            if (empty()) {
                throw new Exception("Stack Underflow");
            }
            return arr.remove(top--);
        }

        public T peek() throws Exception {
            if (empty()) {
                throw new Exception("Stack is empty");
            }
            return arr.get(top);
        }
    }


    public static String simplifyPath(String path) {
        Stack<String> s = new Stack<>();

        String[] ars = path.split("/");

        for (int i = 0; i < ars.length; i++) {
            if(ars[i].isEmpty()) continue;
            if (ars[i].equals("."))
                continue;
            if (ars[i].equals("..")) {
                if (s.empty()) {
                    continue;
                } else {
                    s.pop();
                }
            } else {
                s.push(ars[i]);
            }
        }
        Stack<String> st1 = new Stack<>();
        while (!s.empty()) {
            st1.push(s.pop());
        }
        StringBuilder str = new StringBuilder("");
        while (!st1.empty()) {
            String newS = st1.pop();
            if (!newS.isEmpty()) {
                str.append("/");
                str.append(newS);
            }
        }
        if (str.toString().isEmpty()){ return "/";}
        return str.toString();
    }

    public class MinStack {

        public void push(int val) {
        
        }
        
        public void pop() {
            
        }
        
        public int top() {
            return 0;
        }
        
        public int getMin() {
            return 0;
        }

        public static void main(String[] args) {
            
        }
    }
    

    public int evalRPN(String[] tokens) {
        Stack<Integer> s = new Stack<>();

        for(int i = 0 ; i < tokens.length ; i++){
            if (tokens[i].equals("+")){
                int num1 = s.pop();
                int num2 = s.pop();
                s.push(num2 + num1);
                continue;
            }
            if (tokens[i].equals("-")){
                int num1 = s.pop();
                int num2 = s.pop();
                s.push(num2 - num1);
                continue;
            }
            if (tokens[i].equals("*")){
                int num1 = s.pop();
                int num2 = s.pop();
                s.push(num2 * num1);
                continue;
            }
            if (tokens[i].equals("/")){
                int num1 = s.pop();
                int num2 = s.pop();
                s.push(num2 / num1);
                continue;
            }
            s.push(Integer.parseInt(tokens[i]));


        }
        return s.peek();

    }
    
    public static void main(String[] args) {
        String s = "/home/";
        
        System.out.println(simplifyPath(s));
    }
}
