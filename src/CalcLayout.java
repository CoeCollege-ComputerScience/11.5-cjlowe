import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalcLayout extends JPanel{

    CalculatorController controller;

    JTextField display;
    CalcButton[] numButtons;
    CalcButton[] opButtons;
    CalcButton equalButton;
    String[] ops = {"+","-","*","/"};

    public CalcLayout( ) {
        initializeComponents();
    }

    private void initializeComponents(){
        setLayout(new BorderLayout());

        display = new JTextField();
        display.setFont(new Font("Arial", Font.BOLD, 24));
        add(display, BorderLayout.NORTH);

        JPanel bp = new JPanel();
        bp.setLayout(new GridLayout(0,3));
        numButtons = new CalcButton[11];
        //TO DO:  Fix the order of the buttons
        for (int i = 0; i < 10; i ++){
            numButtons[i] = new CalcButton(Integer.toString(i), controller);
            bp.add(numButtons[i]);
        }
        numButtons[10] = new CalcButton("C", controller);
        bp.add(numButtons[10]);
        add(bp, BorderLayout.CENTER);

        JPanel op = new JPanel();
        op.setLayout(new GridLayout(0,1));
        opButtons = new CalcButton[4];
        for (int i = 0; i < 4; i ++){
            opButtons[i] = new CalcButton(ops[i], controller);
            op.add(opButtons[i]);
        }
        add(op, BorderLayout.EAST);
        equalButton = new CalcButton("=", controller);
        equalButton.addActionListener(new EqButtonListener());
        add(equalButton, BorderLayout.SOUTH);
    }

    public void setController(CalculatorController controller) {
        this.controller = controller;
        //Added this to update the controller into each of the buttons.
        //This avoids the controller being null like we saw in class.
        for(CalcButton b:numButtons){
            b.setController(controller);
        }
        for (CalcButton op:opButtons){
            op.setController(controller);
        }
        equalButton.setController(controller);
    }

    public void show(String txt){
        display.setText(txt);
    }

    private class EqButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton b = (JButton) e.getSource();
            System.out.println("Call a function to compute");

             System.out.println(display.getText());
            System.out.println("But for now, the Ans wer is 42!");
            display.setText("42");
        }
    }

    public static void main(String[] args) {
        CalcLayout calcPanel = new CalcLayout();
        JFrame frame  = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(calcPanel);
        frame.pack();
        frame.setVisible(true);
    }
}