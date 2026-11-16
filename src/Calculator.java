import javax.swing.*;

public class Calculator {

    public static void main(String[] args) {
        CalcLayout view  = new CalcLayout();
        CalcModel model = new CalcModel();
        CalculatorController controller = new CalculatorController(view, model);
        //Note the controller tells the view about itself.

        JFrame frame  = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(view);
        frame.pack();
        frame.setVisible(true);
    }


}
