public class SwapNumbers {
    public static void main(String[] args) {

        //-----CREATE 2 variables and swap them
        int number1 =12;
        int number2 =30;

        int degisken;
        System.out.println(number1+"..."+number2+"...");

        degisken = number1;
        number1= number2;
        number2= degisken;

        System.out.println(number1+"**"+number2);
    }
}
