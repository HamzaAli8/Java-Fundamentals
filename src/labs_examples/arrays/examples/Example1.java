package labs_examples.arrays.examples;

// Demonstrate a one-dimensional array.
class ArrayDemo {
    public static void main(String[] args) {
        char[] alphabet = new char[28];

        char i = 'A';

        for (int x = 0; x < 28; x++, i++){
            alphabet[x] = i;
            System.out.print(alphabet[x]);
        }
    }
}