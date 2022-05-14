import java.io.*;

public class SumNumbers {
    public static void main(String[] args) {
        DataInputStream dInput = new DataInputStream(System.in);
        BufferedReader buffer = new BufferedReader(new InputStreamReader(dInput));
        
        int[] array = new int[10];
        
        int sum = 0;
        
        try{
            System.out.println("Enter 10 numbers: ");
            for (int i = 0 ;i < 10; i++){
                array[i] = Integer.parseInt(buffer.readLine());
            }
            System.out.println("The numbers are: ");
            for (int i = 0 ;i < 10 ;i++){
                System.out.print(array[i] + " ");
                sum += array[i];
            }
            
            System.out.println();
            System.out.println("SUM: " + sum);
        } 
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}