package ba.unsa.etf.rpr.tutorijal05;

/*import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;*/

import javafx.beans.property.SimpleLongProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller{

    @FXML
    public TextField input;
    @FXML public Button btn1;
    @FXML public Button btn2;
    @FXML public Button btn3;
    @FXML public Button btn4;
    @FXML public Button btn5;
    @FXML public Button btn6;
    @FXML public Button btn7;
    @FXML public Button btn8;
    @FXML public Button btn9;
    @FXML public Button btn0;
    @FXML public Button zarez;
    @FXML public Button oduzimanje;
    @FXML public Button plusBtn;
    @FXML public Button mnozenje;
    @FXML public Button mod;
    @FXML public Button dijeljenje;
    @FXML public Button equalsBtn;
    @FXML public Label prom;

    private SimpleLongProperty fnumber;

    public long getSnumber() {
        return snumber.get();
    }

    public SimpleLongProperty snumberProperty() {
        return snumber;
    }

    public void setSnumber(long snumber) {
        this.snumber.set(snumber);
    }

    private SimpleLongProperty snumber;
    private String operation;

    public long getFnumber() {
        return fnumber.get();
    }

    public SimpleLongProperty fnumberProperty() {
        return fnumber;
    }

    public void setFnumber(long fnumber) {
        this.fnumber.set(fnumber);
    }

    public void btn00(ActionEvent actionEvent){
        String staraVrijednost = input.getText();
        String set = "0";
        input.setText(staraVrijednost + set);
    }

    public void btn11(ActionEvent actionEvent){
        String staraVrijednost = input.getText();
        String set = "1";
        input.setText(staraVrijednost + set);
    }

    public void btn22(ActionEvent actionEvent){
        String staraVrijednost = input.getText();
        String set = "2";
        input.setText(staraVrijednost + set);
    }

    public void btn33(ActionEvent actionEvent){
        String staraVrijednost = input.getText();
        String set = "3";
        input.setText(staraVrijednost + set);
    }

    public void btn44(ActionEvent actionEvent){
        String staraVrijednost = input.getText();
        String set = "4";
        input.setText(staraVrijednost + set);
    }

    public void btn55(ActionEvent actionEvent){
        String staraVrijednost = input.getText();
        String set = "5";
        input.setText(staraVrijednost + set);
    }

    public void btn66(ActionEvent actionEvent){
        String staraVrijednost = input.getText();
        String set = "6";
        input.setText(staraVrijednost + set);
    }

    public void btn77(ActionEvent actionEvent){
        String staraVrijednost = input.getText();
        String set = "7";
        input.setText(staraVrijednost + set);
    }

    public void btn88(ActionEvent actionEvent){
        String staraVrijednost = input.getText();
        String set = "8";
        input.setText(staraVrijednost + set);
    }

    public void btn99(ActionEvent actionEvent){
        String staraVrijednost = input.getText();
        String set = "9";
        input.setText(staraVrijednost + set);
    }

    public void zarez_click(ActionEvent actionEvent){
        String staraVrijednost = input.getText();
        String set = ".";
        input.setText(staraVrijednost + set);
    }
    public void sabiranje_click(ActionEvent actionEvent){
        String value = input.getText();
        long valueNumber = Integer.parseInt(value);
        setFnumber(valueNumber);
        input.setText("");
        prom.setText(value + "+");
        operation = "+";
    }

    public void oduzimanje_click(ActionEvent actionEvent){
        String value = input.getText();
        long valueNumber = Integer.parseInt(value);
        setFnumber(valueNumber);
        input.setText("");
        prom.setText(value + "-");
        operation = "-";
    }

    public void dijeljenje_click(ActionEvent actionEvent){
        String value = input.getText();
        long valueNumber = Integer.parseInt(value);
        setFnumber(valueNumber);
        input.setText("");
        prom.setText(value + "/");
        operation = "/";
    }

    public void mnozenje_click(ActionEvent actionEvent){
        String value = input.getText();
        long valueNumber = Integer.parseInt(value);
        setFnumber(valueNumber);
        input.setText("");
        prom.setText(value + "x");
        operation = "x";
    }

    public void mod_click(ActionEvent actionEvent){
        String value = input.getText();
        long valueNumber = Integer.parseInt(value);
        setFnumber(valueNumber);
        input.setText("");
        prom.setText(value + "%");
        operation = "%";
    }

    public void jednako_click(ActionEvent actionEvent){
        switch(operation){
            case"+":
                String value = input.getText();
                long system =getFnumber() + getSnumber();
                input.setText(String.valueOf(system));
                String oldProm = prom.getText();
                prom.setText(oldProm + value);
                break;

            case"-":
                String valueOduzimanje = input.getText();
                setSnumber(Integer.parseInt(valueOduzimanje));
                long systemOduzimanje = getFnumber() + getSnumber();
                input.setText(String.valueOf(systemOduzimanje));
                String oldPromOduzimanje = prom.getText();
                prom.setText(oldPromOduzimanje + valueOduzimanje);
                break;

            case"x":
                String valueMnozenje = input.getText();
                setSnumber(Integer.parseInt(valueMnozenje));
                long systemMnozenje = getFnumber() * getSnumber();
                input.setText(String.valueOf(systemMnozenje));
                String oldPromMnozenje = prom.getText();
                prom.setText(oldPromMnozenje + valueMnozenje);
                break;

            case "/":
                String valueD = input.getText();
                setSnumber(Integer.parseInt(valueD));
                long systemD = getFnumber() / getSnumber();
                input.setText(String.valueOf(systemD));
                String oldPromD = prom.getText();
                prom.setText(oldPromD + valueD);
                break;

            case "%":
                String valueMod = input.getText();
                setSnumber(Integer.parseInt(valueMod));
                long systemMod = getFnumber() % getSnumber();
                input.setText(String.valueOf(systemMod));
                String oldPromMod = prom.getText();
                prom.setText(oldPromMod + valueMod);
                break;


        }
    }

}
