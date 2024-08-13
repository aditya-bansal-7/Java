import java.util.Stack;

public class Stacks {

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

    

    public static void main(String[] args) {
        String s = "/home/";
        
        System.out.println(simplifyPath(s));
    }
}
