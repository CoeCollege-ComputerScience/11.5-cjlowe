public class CalcModel {

    String inputString;

    public CalcModel() {
        inputString = "";
    }

    String handleInput(String input) {
        inputString += input;
        return inputString;
    }

    //String handleCompute()
    // Maybe this returns "42"

    //String handleClear()
    // Maybe this returns "42"

}
