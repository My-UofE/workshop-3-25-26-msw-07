import java.util.Scanner;

public class PrintPattern1{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter a non-negative number:");
        int number = in.nextInt();

        String sequence = "";

        System.out.println();
        for (int i = 1; i <= number; i++){
            sequence = sequence + i;
            System.out.println(sequence);
        }
    }
}