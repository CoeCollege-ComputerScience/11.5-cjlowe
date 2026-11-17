public class CalcModel {

    String inputString;

    public CalcModel() {
        inputString = "";
    }

    String handleInput(String input) {
        inputString += input;
        return inputString;
    }

    String handleCompute(String input){
     return "42";
}
    String handleClear(){
        return "0";
    }

}
