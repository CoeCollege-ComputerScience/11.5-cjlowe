import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalcButton extends JButton  {

    private CalculatorController controller;

    public CalcButton(String text, CalculatorController c) {
        super(text);
        controller = c;
        setFont(new Font("Arial", Font.BOLD, 28));
        setPreferredSize(new Dimension(50,50));
        if (text.equalsIgnoreCase("=")){
            addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    controller.onCalculate(getText());
                }
            });
        }
        else if (text.equalsIgnoreCase("C")){
            addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    controller.onClear();
                }
            });
        }
        else {
            addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    controller.onInput(getText());
                }
            });
        }
    }
    public void setController(CalculatorController c) {
        controller = c;
    }
}
