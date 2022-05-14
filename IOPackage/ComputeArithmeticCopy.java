import java.io.*;

public class ComputeArithmeticCopy {
    public static void main(String[] args) throws IOException {
        String file = args[0];
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        int n = Integer.parseInt(buffer.readLine());
        for (int i = 0; i < n; i++) {
            String evalString = buffer.readLine();
            String [] evalArray = evalString.split(" ", 3);
            int o1 = Integer.parseInt(evalArray[1]); 
            int o2 = Integer.parseInt(evalArray[2]);
            char operator = evalArray[0].charAt(0);
            switch (operator) {
                case '*' : {
                    System.out.println(o1 * o2); 
                    break;
                }
                case '-' : {
                    System.out.println(o1 - o2); 
                    break;
                }
                case '+' : {
                    System.out.println(o1 + o2); 
                    break;
                }
                case '/' : {
                    System.out.println(o1 / o2); 
                    break;
                }
            }
        }
        buffer.close();
    }
}