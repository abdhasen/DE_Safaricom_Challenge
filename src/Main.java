import java.util.Scanner;

public class Main {
    static int number, digit, sum;

    public static void main(String[] args) {
        //

        String str = "entoto";
        char[] strChar = str.toCharArray();
        for(int i = strChar.length - 1; i >= 0; i--)
        {
            System.out.print(strChar[i]);
        }
        // accept number from user
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number: ");
        number = sc.nextInt();
        // call the majicNumber function with number
        int step1 = MajicNumber(number);
        System.out.println(step1);
        int step2 = MajicNumber(step1);
        System.out.println(step2);
        if(step2 == 1) {
            System.out.println("The Number" + step2 + "is Majic Number");
        }
        else
            System.out.println("The Number is not Majic Number");
    }

    public static int MajicNumber(int n){
        try {
            sum = 0;
            while (n > 0) {
                // separate the digits
                digit = n % 10;
                // add the digits to the sum
                sum += digit;

                n = n / 10;
            }
            return sum;
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}