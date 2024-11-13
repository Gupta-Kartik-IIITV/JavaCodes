package DSA;

public class SubsetSum {

    public static void main(String[] args) {
        String[][] board = {{".",".","." ,".","5","." , ".","1","."},
                            {".","4","." ,"3",".","." , ".",".","."},
                            {".",".","." ,".",".","3" , ".",".","1"},

                            {"8",".","." ,".",".","." , ".","2","."},
                            {".",".","2" ,".","7","." , ".",".","."},
                            {".","1","5" ,".",".","." , ".",".","."},

                            {".",".","." ,".",".","2" , ".",".","."},
                            {".","2","." ,"9",".","." , ".",".","."},
                            {".",".","4" ,".",".","." , ".",".","."}};


        for(int m = 0;m<9;m+=3)
            for(int k=0;k<9;k+=3){
                for(int i=m;i<m+3;i++){
//                    unordered_map<char,int> mp;
                    for(int j =k;j<k+3;j++){
                        System.out.print(board[i][j]);
                    }
                    System.out.println();
                }
                System.out.println();
            }
//        System.out.print(subsets(new int{}{9, 7, 0, 3, 9, 8, 6, 5, 7, 6},0,10,31));
    }


}
