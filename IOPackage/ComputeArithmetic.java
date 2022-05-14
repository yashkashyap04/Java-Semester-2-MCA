import java.io.*;

public class ComputeArithmetic {
    public static void main(String[] args) throws IOException {
        String filename = args[0];

        BufferedReader br = new BufferedReader(new FileReader(filename));

        int numLines = Integer.parseInt(br.readLine());

        for (int i = 0; i < numLines; i++) {
            String operation = br.readLine();

            String [] array = operation.split(" ", 3);
            int operand1 = Integer.parseInt(array[1]); 
            int operand2 = Integer.parseInt(array[2]);
            
            switch (array[0].charAt(0)) {
                case '+' : System.out.println(operand1 + operand2); break;
                case '-' : System.out.println(operand1 - operand2); break;
                case '/' : System.out.println(operand1 / operand2); break;
                case '*' : System.out.println(operand1 * operand2); break;
            }
        }
        
        br.close();
    }
}