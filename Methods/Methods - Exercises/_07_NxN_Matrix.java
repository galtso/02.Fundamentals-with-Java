package Methods_Exercises;

import java.util.Scanner;

public class _07_NxN_Matrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        printTheMatrix(n);
    }
    private static void printTheMatrix(int a){
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print(a + " ");
            }
            System.out.println();
        }
    }
}
