public class CalculatorController {

    private CalcLayout view;
    private CalcModel model;

    public CalculatorController(CalcLayout view, CalcModel model) {
        this.view = view;
        this.model = model;
        view.setController(this);
    }

    // onNumber
    // onOperator
    // Combine these to onInput
    public void onInput(String input){
        System.out.println(input);
        String result = model.handleInput(input);
        view.show(result);
    }

    // onCalculate


    // onClear
}
