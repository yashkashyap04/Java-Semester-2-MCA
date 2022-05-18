import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ConnectFour implements ActionListener{

    Board matrix;
    Player playerA;
    Player playerB;

    private int numMoves = 0;

    private JFrame frame;

    private JPanel boardPanel;
    private JTextField[][] board = new JTextField[8][8];
    private JButton[] pushButtons = new JButton[8];

    private JPanel infoPanel;
    private JButton submitA, submitB;
    private JLabel userLabelA, colorLabelA, userLabelB, colorLabelB;
    private JTextField usernameA, usernameB;
    private String colors[] = {"Red", "Blue"};
    private JComboBox<String> colorA, colorB;
    private JLabel remark;

    public ConnectFour() {

        matrix = new Board();
        playerA = new Player();
        playerB = new Player();

        infoPanel = new JPanel();
        infoPanel.setBorder(BorderFactory.createEmptyBorder(30, 200, 200, 200));
        infoPanel.setLayout(null);

        userLabelA = new JLabel("Username (Player A): ");
        userLabelA.setBounds(100, 100, 150, 20);
        usernameA = new JTextField(10);
        usernameA.setBounds(260, 100, 130, 20);

        userLabelB = new JLabel("Username (Player B): ");
        userLabelB.setBounds(490, 100, 150, 20);
        usernameB = new JTextField(10);
        usernameB.setBounds(650, 100, 130, 20);
        usernameB.setEnabled(false);
        
        colorLabelA = new JLabel("Color (Player A): ");
        colorLabelA.setBounds(100, 130, 150, 20);
        colorA = new JComboBox<>(colors);
        colorA.setBounds(260, 130, 130, 20);
        
        colorLabelB = new JLabel("Color (Player B: ");
        colorLabelB.setBounds(490, 130, 150, 20);
        colorB = new JComboBox<>(colors);
        colorB.setBounds(650, 130, 130, 20);
        colorB.setEnabled(false);

        submitA = new JButton("Submit");
        submitA.setActionCommand("Submit A");
        submitA.addActionListener(this);
        submitA.setBounds(200, 170, 100, 20);

        submitB = new JButton("Submit");
        submitB.setActionCommand("Submit B");
        submitB.addActionListener(this);
        submitB.setBounds(590, 170, 100, 20);
        submitB.setEnabled(false);

        remark = new JLabel("", JLabel.CENTER);
        remark.setBounds(100, 200, 680, 50);
        remark.setFont(new Font("Verdana", Font.BOLD, 18));

        infoPanel.add(userLabelA);
        infoPanel.add(usernameA);
        
        infoPanel.add(colorLabelA);
        infoPanel.add(colorA);

        infoPanel.add(submitA);

        infoPanel.add(userLabelB);
        infoPanel.add(usernameB);

        infoPanel.add(colorLabelB);
        infoPanel.add(colorB);

        infoPanel.add(submitB);

        infoPanel.add(remark);

        boardPanel = new JPanel();

        boardPanel.setBorder(BorderFactory.createEmptyBorder(10, 150, 10, 150));
        boardPanel.setLayout (new GridLayout(9, 8, 10, 10));

        for (int i = 0; i < 8; i++) {
            pushButtons[i] = new JButton("PUSH");
            pushButtons[i].setActionCommand("Push" + (i + 1));
            pushButtons[i].addActionListener(this);
            pushButtons[i].setEnabled(false);
            boardPanel.add(pushButtons[i]);
        }

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                board[i][j] = new JTextField();
                board[i][j].setEnabled(false);
                Color color = matrix.getBoard()[i][j] == "Red" ? Color.RED : matrix.getBoard()[i][j] == "Blue" ? Color.BLUE : Color.GRAY;
                board[i][j].setBackground(color);
                board[i][j].setText(matrix.getBoard()[i][j]);
                boardPanel.add(board[i][j]);
            }
        }

        frame = new JFrame ("Connect Four Game");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(2, 1, 5, 5));
        frame.add(infoPanel, BorderLayout.CENTER);
        frame.add(boardPanel, BorderLayout.CENTER);
        frame.pack();
        frame.setResizable(false);
        frame.setVisible (true);
    }

    public static void main (String[] args) {
        new ConnectFour();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String actionCommand = e.getActionCommand();

        if (actionCommand.equals("Submit A")) {
            playerA.setUsername(usernameA.getText());
            usernameA.setEnabled(false);
            playerA.setColor(colorA.getSelectedItem().toString());
            colorA.setEnabled(false);
            submitA.setEnabled(false);

            String color_b = colorA.getSelectedItem().toString().equals("Red") ? "Blue" : "Red";

            usernameB.setEnabled(true);
            submitB.setEnabled(true);
            colorB.setSelectedItem(color_b);
        }

        else if (actionCommand.equals("Submit B")) {
            playerB.setUsername(usernameB.getText());
            usernameB.setEnabled(false);
            playerB.setColor(colorB.getSelectedItem().toString());
            submitB.setEnabled(false);

            for (JButton button : pushButtons) {
                button.setEnabled(true);
            }

            remark.setText(playerA.getUsername() + " to move");
        }

        else {
            String action = e.getActionCommand();
            int column = action.charAt(4) - '0';

            numMoves++;

            if (numMoves % 2 != 0) {
                matrix.pushMove(playerA.getColor(), column);
                for (int i = 0; i < 8; i++) {
                    for (int j = 0; j < 8; j++) {
                        Color color = matrix.getBoard()[i][j].equals("Red") ? Color.RED : matrix.getBoard()[i][j].equals("Blue") ? Color.BLUE : Color.GRAY;
                        board[i][j].setBackground(color);
                    }
                }

                if (matrix.getResult() != 0) {
                    if (matrix.getResult() == 1) {
                        remark.setText(playerA.getUsername() + " WINS!");
                        for (JButton button : pushButtons) {
                            button.setEnabled(false);
                        }
                    }
                    else {
                        remark.setText("NO RESULT :(");
                        for (JButton button : pushButtons) {
                            button.setEnabled(false);
                        }
                    }
                }
                else {
                    remark.setText(playerB.getUsername() + " to move");
                }
            }

            else {
                matrix.pushMove(playerB.getColor(), column);
                for (int i = 0; i < 8; i++) {
                    for (int j = 0; j < 8; j++) {
                        Color color = matrix.getBoard()[i][j].equals("Red") ? Color.RED : matrix.getBoard()[i][j].equals("Blue") ? Color.BLUE : Color.GRAY;
                        board[i][j].setBackground(color);
                    }
                }

                if (matrix.getResult() != 0) {
                    if (matrix.getResult() == 1) {
                        remark.setText(playerB.getUsername() + " WINS!");
                        for (JButton button : pushButtons) {
                            button.setEnabled(false);
                        }
                    }
                    else {
                        remark.setText("NO RESULT :(");
                        for (JButton button : pushButtons) {
                            button.setEnabled(false);
                        }
                    }
                }
                else {
                    remark.setText(playerA.getUsername() + " to move");
                }
            }
        }
    }
}
