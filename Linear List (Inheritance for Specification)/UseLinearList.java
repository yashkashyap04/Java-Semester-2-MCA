import java.util.Scanner;

public class UseLinearList {
    public static int getSum(LinearList list) {
        int S = 0;
        for (int i = 0; i < list.size(); i++) {
            S += list.get(i);
        }
        return S;
    }

    public static void main (String args[]) {
        ArrayLinearList arrayLL = new ArrayLinearList();
        
        Scanner scanner = new Scanner(System.in);

        // Taking 6 values from user.
        for (int i = 0; i < 6; i++) {
            System.out.println("Enter the value at index for Array: " + i);
            int value = scanner.nextInt();
            arrayLL.add(i, value);
        }

        System.out.println();
        System.out.println("Sum SLLLinearList: " + getSum(arrayLL));

        SLLLinearList linkedLL = new SLLLinearList();

        // Taking 6 values from user.
        for (int i = 0; i < 6; i++) {
            System.out.println("Enter the value at index for SLL: " + i);
            int value = scanner.nextInt();
            linkedLL.add(i, value);
        }

        System.out.println();
        System.out.println("Sum ArrayLinearList: " + getSum(linkedLL));
    }
}