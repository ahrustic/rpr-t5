package ba.unsa.etf.rpr.tutorijal05;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleLongProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    public Label display;
    @FXML public Label prom;

    private SimpleDoubleProperty fnumber = new SimpleDoubleProperty(0);

    public double getSnumber() {
        return snumber.get();
    }

    public SimpleDoubleProperty snumberProperty() {
        return snumber;
    }

    public void setSnumber(double snumber) {
        this.snumber.set(snumber);
    }

    private SimpleDoubleProperty snumber = new SimpleDoubleProperty(0);
    private String operation;

    public double getFnumber() {
        return fnumber.get();
    }

    public SimpleDoubleProperty fnumberProperty() {
        return fnumber;
    }

    public void setFnumber(double fnumber) {
        this.fnumber.set(fnumber);
    }

    public void btn0(ActionEvent actionEvent){
        String staraVrijednost = display.getText();
        if (staraVrijednost == "0"){
        String set = "0";
        display.setText(set);
        }
        else {
            String set = "0";
            display.setText(staraVrijednost + set);
        }
    }

    public void btn1(ActionEvent actionEvent){
        String staraVrijednost = display.getText();
        if(staraVrijednost == "0") {
        String set = "1";
        display.setText(set);
        }
        else {
            String set = "1";
        display.setText(set);
        }
    }

    public void btn2(ActionEvent actionEvent){
        String staraVrijednost = display.getText();
        if(staraVrijednost == "0") {
            String set = "2";
            display.setText(set);
            display.setText(staraVrijednost + set);
        }
        else {
            String set = "2";
            display.setText(staraVrijednost + set);
        }
    }

    public void btn3(ActionEvent actionEvent){
        String staraVrijednost = display.getText();
        String set = "3";
        display.setText(staraVrijednost + set);
    }

    public void btn4(ActionEvent actionEvent){
        String staraVrijednost = display.getText();
        String set = "4";
        display.setText(staraVrijednost + set);
    }

    public void btn5(ActionEvent actionEvent){
        String staraVrijednost = display.getText();
        String set = "5";
        display.setText(staraVrijednost + set);
    }

    public void btn6(ActionEvent actionEvent){
        String staraVrijednost = display.getText();
        String set = "6";
        display.setText(staraVrijednost + set);
    }

    public void btn7(ActionEvent actionEvent){
        String staraVrijednost = display.getText();
        String set = "7";
        display.setText(staraVrijednost + set);
    }

    public void btn8(ActionEvent actionEvent){
        String staraVrijednost = display.getText();
        if (staraVrijednost == "0"){
            String set = "8";
            display.setText(set);
        }
        else {
            String set = "8";
            display.setText(staraVrijednost + set);
        }
    }

    public void btn9(ActionEvent actionEvent){
        String staraVrijednost = display.getText();
        String set = "9";
        display.setText(staraVrijednost + set);
    }

    public void dotBtn(ActionEvent actionEvent){
        String staraVrijednost = display.getText();
        String set = ".";
        display.setText(staraVrijednost + set);
    }
    public void sabiranje_click(ActionEvent actionEvent){
        String value = display.getText();
        double valueNumber = Double.parseDouble(value);
        setFnumber(valueNumber);
        display.setText("");
        prom.setText(value + "+");
        operation = "+";
    }

    public void oduzimanje_click(ActionEvent actionEvent){
        String value = display.getText();
        long valueNumber = Integer.parseInt(value);
        setFnumber(valueNumber);
        display.setText("");
        prom.setText(value + "-");
        operation = "-";
    }

    public void dijeljenje_click(ActionEvent actionEvent){
        String value = display.getText();
        long valueNumber = Integer.parseInt(value);
        setFnumber(valueNumber);
        display.setText("");
        prom.setText(value + "/");
        operation = "/";
    }

    public void mnozenje_click(ActionEvent actionEvent){
        String value = display.getText();
        long valueNumber = Integer.parseInt(value);
        setFnumber(valueNumber);
        display.setText("");
        prom.setText(value + "x");
        operation = "x";
    }

    public void mod_click(ActionEvent actionEvent){
        String value = display.getText();
        long valueNumber = Integer.parseInt(value);
        setFnumber(valueNumber);
        display.setText("");
        prom.setText(value + "%");
        operation = "%";
    }

    public void jednako_click(ActionEvent actionEvent){
        switch(operation){
            case"+":
                String value = display.getText();
                double system = getFnumber() + getSnumber();
                display.setText(String.valueOf(system));
                String oldProm = prom.getText();
                prom.setText(oldProm + value);
                break;

            case"-":
                String valueOduzimanje = display.getText();
                setSnumber(Integer.parseInt(valueOduzimanje));
                double systemOduzimanje = getFnumber() + getSnumber();
                display.setText(String.valueOf(systemOduzimanje));
                String oldPromOduzimanje = prom.getText();
                prom.setText(oldPromOduzimanje + valueOduzimanje);
                break;

            case"x":
                String valueMnozenje = display.getText();
                setSnumber(Integer.parseInt(valueMnozenje));
                double systemMnozenje = getFnumber() * getSnumber();
                display.setText(String.valueOf(systemMnozenje));
                String oldPromMnozenje = prom.getText();
                prom.setText(oldPromMnozenje + valueMnozenje);
                break;

            case "/":
                String valueD = display.getText();
                setSnumber(Integer.parseInt(valueD));
                if (getSnumber() == 0) display.setText("Infinity");
                double systemD = getFnumber() / getSnumber();
                display.setText(String.valueOf(systemD));
                String oldPromD = prom.getText();
                prom.setText(oldPromD + valueD);
                break;

            case "%":
                String valueMod = display.getText();
                setSnumber(Integer.parseInt(valueMod));
                double systemMod = getFnumber() % getSnumber();
                display.setText(String.valueOf(systemMod));
                String oldPromMod = prom.getText();
                prom.setText(oldPromMod + valueMod);
                break;


        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        display.setText("0");
    }
}
