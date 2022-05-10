import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GuessTheNumber implements ActionListener{

    private JFrame frame;
    private JPanel panel;
    private JLabel label;
    private JTextField tf;
    private int numGuesses = 0;
    private int randomNumber;
    
    GuessTheNumber(){
        tf = new JTextField();

        JButton submitGuess = new JButton("Submit Guess");
        submitGuess.addActionListener(this);

        label = new JLabel();

        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(new GridLayout(0, 1));
        panel.setSize(1000,1000);
        panel.add(tf);
        panel.add(submitGuess);
        panel.add(label);

        frame = new JFrame();
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Guess the Number");
        frame.pack();
        frame.setVisible(true);

        randomNumber = (int)(Math.random() * (100 - 1 + 1) + 1); 
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        numGuesses++;

        int guess = Integer.parseInt(tf.getText());
        if (guess > randomNumber) {
            label.setText("Your guess was wrong. The number is smaller than your guess. Try Again.");
        }
        else if (guess < randomNumber) {
            label.setText("Your guess was wrong. The number is greater than your guess. Try Again.");
        }
        else {
            System.out.println("Bingo! You made the right guess: " + randomNumber + ".\nNumber of guesses: " + numGuesses);
            label.setText("Bingo! You made the right guess. Number of guesses: " + numGuesses);
            frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
        }
    }
    
    public static void main(String[] args){
        new GuessTheNumber();
    }
}