import java.util.*;  
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
      Scanner myObj = new Scanner(System.in);
    System.out.println("Enter a number");
    int number = myObj.nextInt();  // Read user input
    List<Integer> a= new ArrayList();
    for (int i = 1; i <= number; i++) {
        if (number%i==0){
            a.add(i);
        }
    }  
    System.out.println(a);
    
  }
}
