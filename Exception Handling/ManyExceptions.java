import java.util.*;

public class ManyExceptions{
    public void sayHello(){
        System.out.println("Hello");
    }
    
    public static void main(String[] args){
        try {
            System.out.println("The third argument is " + args[2]);
        }
        catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Index 2 Out of Bounds.");
        }

        Scanner sc = new Scanner(System.in);
        
        try {
            System.out.println("Enter a number");
            int a = sc.nextInt();
            System.out.println("Enter another number");
            int b = sc.nextInt();
            
            int c = a/b;
            
            System.out.println("The result of the division is " + c);
        }
        catch (ArithmeticException exception) {
            System.out.println("Cannot divide by 0.");
        }
        catch (InputMismatchException exception) {
            System.out.println("Integer expected, String found.");
        }

        sc.close();
        
        try {
            int d = sc.nextInt();
        }
        catch (IllegalStateException exception) {
            System.out.println("Scanner is closed. Cannot take input anymore.");
        }
        
        ManyExceptions me = new ManyExceptions();
        me = null;

        try {
            me.sayHello();
        }
        catch (NullPointerException exception) {
            System.out.println("Object is null. Cannot access sayHello() using it.");
        }

        System.out.println("Successful Execution!");
    }
}