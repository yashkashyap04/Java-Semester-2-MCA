import java.lang.*;
import java.util.*;

public class UseMyComparable {
    public static MyComparable[] sortObjects(MyComparable list[]) {
        int n = list.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                Card card1 = (Card)list[j];
				Card card2 = (Card)list[j + 1];

				if (card1.compareTo(card2) == 1) {
					Card temp = card1;
					list[j] = list[j+1];
					list[j+1] = temp;
				}
        return list;
    }
    
    public static void main (String args[]) {
        Card array[] = new Card[5];

        array[0] = new Card(1, 2);
        array[1] = new Card(2, 12);
        array[2] = new Card(3, 10);
        array[3] = new Card(4, 11);
        array[4] = new Card(1, 4);

        MyComparable sorted[] = sortObjects(array);

        for (int i = 0; i < sorted.length; i++) {
            Card object = (Card)sortedList[i];
            System.out.println(object.suit() + ", " + object.rank());
        }
    }
}