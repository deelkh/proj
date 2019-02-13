

import java.util.Scanner;
public class PrintEvenNumber {

    
    public static void main(String[] args) {
        System.out.print(" Enter any number ");
        Scanner myVar = new Scanner(System.in);
        int x = myVar.nextInt();

       while(x > 0) {
          System.out.println(x);
          x--;
       }
    }
}
