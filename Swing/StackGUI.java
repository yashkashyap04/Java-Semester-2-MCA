import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StackGUI implements ActionListener {
    private JFrame frame;
    private JLabel label;
    private JButton push, pop;
    private JTextField input;
    private JLabel remarks;
    private JList<String> stackList;
    private JPanel panel;
    private DefaultListModel<String> model;
    
    public StackGUI() {
        remarks = new JLabel();

        push = new JButton("Push");
        push.setActionCommand("push");
        push.addActionListener(this);
        
        pop = new JButton("Pop");
        pop.setActionCommand("pop");
        pop.addActionListener(this);

        model = new DefaultListModel<>();
        stackList = new JList<String>(model);
        stackList.setFixedCellHeight(15);

        input = new JTextField();

        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(new GridLayout());
        panel.setSize(1000,1000);
        panel.add(input);
        panel.add(push);
        panel.add(pop);
        panel.add(remarks);
        panel.add(stackList);

        frame = new JFrame();
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Stack List");
        frame.pack();
        frame.setVisible(true);
    }

    private void push(String text) {
        model.addElement(text);
    }

    private String pop() {
        if (model.getSize() > 0) {
            String text = model.elementAt(model.getSize()-1);
            model.removeElementAt(model.getSize()-1);
            return text;
        }

        else {
            return "Underflow";
        }
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        String action = ae.getActionCommand();
        if (action.equals("push")) {
            String text = input.getText();
            push(text);
            remarks.setText("Pushed: " + text);
        }
        else if (action.equals("pop")) {
            String text = pop();
            if (text.equals("Underflow")) {
                remarks.setText("Underflow.");
            }
            else {
                remarks.setText("Popped: " + text);
            }
        }
    }

    public static void main(String args[]) {
        new StackGUI();
    }
}