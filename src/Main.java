public class Main {

    public static void main(String[] args) {
        System.out.println(numberToWords(15));
    }

    public static String numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid value");
        }
        String word = null;
        while (number > 0) {
            int divider = number % 10; // uzima zadnju cifru
            switch (divider) {
                case 1:
                    word = "One";
                    break;
                case 2:
                    word = "Two";
                    break;
                case 3:
                    word = "Three";
                    break;
                case 4:
                    word = "Four";
                    break;
                case 5:
                    word = "Five";
                    break;
                case 6:
                    word = "Six";
                    break;
                case 7:
                    word = "Seven";
                    break;
                case 8:
                    word = "Eight";
                    break;
                case 9:
                    word = "Nine";
                    break;
                case 0:
                    word = "Zero";
                    continue;
                number = number / 10 ;
            }return word;



        } return " + ";
    }
}
