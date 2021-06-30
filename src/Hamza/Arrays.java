package Hamza;

public class Arrays {

    public static void main(String[] args) {

        int [] [] twoD = new int [3] [4];

        for(int i = 0; i < twoD.length; i++){
            for(int j = 0; j < twoD[i].length; j++){

                System.out.println("i = "+ i + " j = "+ j);
            }
        }
    }
}
