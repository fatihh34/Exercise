public class PrintStringInReverse {
    public static void main(String[] args) {
        //Print "hello world" in reverse

        String metin ="hello world";
        String reverse =" ";

        for (int i = metin.length()-1; i >=0 ; i--) {
            reverse= reverse+metin.charAt(i);
        }
        System.out.println("reverse = " + reverse);
    }
}
