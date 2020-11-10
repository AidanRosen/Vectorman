package vector_calc;

import passwordManager.ColoredWindow;

import javax.swing.*;

public class VectorControl {

    VectorData model;
    VectorCalculatorUI view;

    public VectorControl() {
        this.model = new VectorData();
        this.view = new VectorCalculatorUI(this);
        view.setVisible(true);
    }


    public void clearMath (){
        model.clear();
        view.clearCalculator();

    }

    public void saveValueOfArg1(JTextField textfield) { // method to store 1st value in calculation (arg1)
        model.setArg1(Double.parseDouble((textfield.getText())));


    }

    public void saveValueOfArg2(JTextField textfield) { // method to store 2nd value in calculation (arg2)
        model.setArg2(Double.parseDouble((textfield.getText())));

        }

    public void calculateProperties(){
        model.calculations();
        double direction = model.getDirection();
        double magnitude = model.getMag();
        view.calculateAnswer(magnitude, direction);
    }

    public static void prettyWindow (String pass){
        ColoredWindow window = new ColoredWindow(pass);
    }

}



