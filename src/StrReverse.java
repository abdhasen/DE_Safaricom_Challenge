
public class StrReverse {

   public static void main(String[] args) {
        //
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        StringReverse(str);
    }

    public static void StringReverse(String str) {

        char[] strChar = str.toCharArray();
        for (int i = strChar.length - 1; i >= 0; i--) {
            System.out.print(strChar[i]);
        }
    }
}
