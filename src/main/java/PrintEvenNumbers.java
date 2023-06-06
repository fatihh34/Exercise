import java.util.ArrayList;
import java.util.List;

public class PrintEvenNumbers {
    public static void main(String[] args) {
        //Create a new list and print only even numbers
        List<Integer> numbers = new ArrayList<>(List.of(1, 2, 5, 7));
        for (int w:numbers) {
            if (w%2==0){
                System.out.println(w);
            }
            System.out.println("----------------");

        }
        //--------IKINCI YOL-------------------------------------------------------
        int n =10; //0 ile 10 arasında yer alan çift sayıları yazdır
        for (int i = 9; i >0 ; i--) {
            if (i%2==0){
                System.out.print(i);
            }
        }


    }
}
