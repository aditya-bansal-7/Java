import java.util.*;

public class backtracking {


    
    public static void findAllsub(String s , String ans , int i){
        if (i == s.length()) {
            System.out.println(ans);
            return;
        }
        
        findAllsub(s, ans+s.charAt(i), i+1);
        findAllsub(s, ans, i+1);
    }

    public static void findAllpurmutaion(String str , String ans){
        if(str.length()==0){
            System.err.println(ans);
            return;
        }
        for(int i=0 ; i < str.length(); i++){
            
            char curr = str.charAt(i);
            String newString = str.substring(0, i) + str.substring(i+1);
            findAllpurmutaion(newString, ans+curr);
        }
    }

    public static boolean is_board_safe(char board[][], int col , int row){
        //for upward direaction 
        for (int i = row-1; i >=0; i--) {
            if (board[i][col]=='Q') {
                return false;
            }
        }
        for (int i = row-1,j=col-1; i >= 0 && j>=0; i--,j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        for (int i = row-1 , j = col + 1; j < board.length && i >= 0; i--,j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }

    public static void print_chess_board(char board[][]) {
        System.out.println("<------ chess board ------>");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void nQueen(char board[][] , int row){
        if (row == board.length) {
            print_chess_board(board);
            return;
        }
        for (int i = 0; i < board.length; i++) {
            if (is_board_safe(board, i, row)){
                board[row][i] = 'Q';
                nQueen(board, row+1);
                board[row][i] = '.';
        }
    }
    }

    public static List<List<Integer>> subsets(int[] nums) {
        
        List<List<Integer>> list = new ArrayList<>();

        List<Integer> l1 = new ArrayList<>();
        
        backSubset(list, l1, nums, 0);

        return list;
    }

    public static void backSubset(List<List<Integer>>  ml , List<Integer> ol , int[] nums ,  int start) {

        if (start == nums.length){
            ml.add(new ArrayList<>(ol));
            return;
        }

        backSubset(ml, ol, nums, start+1);
        ol.add(nums[start]);
        backSubset(ml, ol, nums, start+1);
        ol.remove(ol.size() - 1);
    }

    public static void main(String[] args) {
        String ad = "";
        int a = 1,b=3;
        ad = ad + String.valueOf(a);
        findAllpurmutaion(ad, "");
    }
}
