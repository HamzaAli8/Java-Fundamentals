package Hamza;

public class twoDarray {
    public static void main(String[] args) {

        int [] [] twoDArray = new int [4] [3];

        for(int i = 1; i <= twoDArray.length; i++){
            for(int j = 1; j <= twoDArray[i-1].length; j++){



                System.out.println(twoDArray[i-1][j-1]);
            }
        }
    }
}
