package com.calculator.mycalculator;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {

    Calculator calc = new Calculator();

    @FXML
    private TextField inputField;

    @FXML
    protected void onButtonPlusClick(){
        calc.setOperator('+');
        String val = inputField.getText();
        double d = Double.parseDouble(val);
        calc.setOp1(d);
        inputField.setText("");
    }
    @FXML
    protected void onButtonMnusClick(){
        calc.setOperator('-');
        String val = inputField.getText();
        double d = Double.parseDouble(val);
        calc.setOp1(d);
        inputField.setText("");
    }
    @FXML
    protected void onButtonMultiClick(){
        calc.setOperator('*');
        String val = inputField.getText();
        double d = Double.parseDouble(val);
        calc.setOp1(d);
        inputField.setText("");
    }
    @FXML
    protected void onButtonDivideClick(){
        calc.setOperator('/');
        String val = inputField.getText();
        double d = Double.parseDouble(val);
        calc.setOp1(d);
        inputField.setText("");
    }

    @FXML
    protected void onButtonClearClick(){
        inputField.setText("");
    }

    @FXML
    protected void onButtonEqualClick(){
        String val = inputField.getText();
        double d = Double.parseDouble(val);
        calc.setOp2(d);
        calc.calculate();
        d = calc.getResult();
        inputField.setText(Double.toString(d));
    }

    @FXML
    protected void onButtonOneClick(){
        String val = inputField.getText();
        if(val.equals("0")) val="";
        inputField.setText( val + "1" );
    }

    @FXML
    protected void onButtonTwoClick(){
        String val = inputField.getText();
        if(val.equals("0")) val="";
        inputField.setText( val + "2" );
    }
    @FXMLa
    protected void onButtonThreeClick(){
        String val = inputField.getText();
        if(val.equals("0")) val="";
        inputField.setText( val + "3" );
    }
    @FXML
    protected void onButtonFourClick(){
        String val = inputField.getText();
        if(val.equals("0")) val="";
        inputField.setText( val + "4" );
    }
    @FXML
    protected void onButtonFiveClick(){
        String val = inputField.getText();
        if(val.equals("0")) val="";
        inputField.setText( val + "5" );
    }
    @FXML
    protected void onButtonSixClick(){
        String val = inputField.getText();
        if(val.equals("0")) val="";
        inputField.setText( val + "6" );
    }
    @FXML
    protected void onButtonSevenClick(){
        String val = inputField.getText();
        if(val.equals("0")) val="";
        inputField.setText( val + "7" );
    }
    @FXML
    protected void onButtonEightClick(){
        String val = inputField.getText();
        if(val.equals("0")) val="";
        inputField.setText( val + "8" );
    }
    @FXML
    protected void onButtonNineClick(){
        String val = inputField.getText();
        if(val.equals("0")) val="";
        inputField.setText( val + "9" );
    }
    @FXML
    protected void onButtonZeroClick(){
        String val = inputField.getText();
        if(val.equals("0")) val="";
        inputField.setText( val + "0" );
    }

    @FXML
    private TextField yourTextField;

    @FXML
    private void handleDigitButton() {
        // This method will be called when the "onAction" event occurs on the TextField
        System.out.println("handleDigitButton called");
    }

    @FXML
    private void handleOperatorButton() {
        // This method will be called when the "onMouseClicked" event occurs on the TextField
        System.out.println("handleOperatorButton called");
    }


}