package ba.unsa.etf.rpr.tutorijal05;

import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;

import javax.swing.*;

public class Controller {

    public JTextField input;
    public Button jedan;
    public Button dva;
    public Button tri;
    public Button cetiri;
    public Button pet;
    public Button sest;
    public Button sedam;
    public Button osam;
    public Button devet;
    public Button nula;
    public Button zarez;
    public Button oduzimanje;
    public Button sabiranje;
    public Button mnozenje;
    public Button mod;
    public Button djeljenje;
    public Button jednako;
    public Label prom;

    private long fnumber;
    private long snumber;
    private String operation;

    public void nula_click(){
        String staraVrijednost = input.getText();
        String set = "0";
        input.setText(staraVrijednost + set);
    }

    public void jedan_click(){
        String staraVrijednost = input.getText();
        String set = "1";
        input.setText(staraVrijednost + set);
    }

    public void dva_click(){
        String staraVrijednost = input.getText();
        String set = "2";
        input.setText(staraVrijednost + set);
    }

    public void tri_click(){
        String staraVrijednost = input.getText();
        String set = "3";
        input.setText(staraVrijednost + set);
    }

    public void cetiri_click(){
        String staraVrijednost = input.getText();
        String set = "4";
        input.setText(staraVrijednost + set);
    }

    public void pet_click(){
        String staraVrijednost = input.getText();
        String set = "5";
        input.setText(staraVrijednost + set);
    }

    public void sest_click(){
        String staraVrijednost = input.getText();
        String set = "6";
        input.setText(staraVrijednost + set);
    }

    public void sedam_click(){
        String staraVrijednost = input.getText();
        String set = "7";
        input.setText(staraVrijednost + set);
    }

    public void osam_click(){
        String staraVrijednost = input.getText();
        String set = "8";
        input.setText(staraVrijednost + set);
    }

    public void devet_click(){
        String staraVrijednost = input.getText();
        String set = "9";
        input.setText(staraVrijednost + set);
    }

    public void zarez_click(){
        String staraVrijednost = input.getText();
        String set = ".";
        input.setText(staraVrijednost + set);
    }
    public void sabiranje_click(){
        String value = input.getText();
        long valueNumber = Integer.parseInt(value);
        this.fnumber = valueNumber;
        input.setText("");
        prom.setText(value + "+");
        operation = "+";
    }

    public void oduzimanje_click(){
        String value = input.getText();
        long valueNumber = Integer.parseInt(value);
        this.fnumber = valueNumber;
        input.setText("");
        prom.setText(value + "-");
        operation = "-";
    }

    public void djeljenje_click(){
        String value = input.getText();
        long valueNumber = Integer.parseInt(value);
        this.fnumber = valueNumber;
        input.setText("");
        prom.setText(value + "/");
        operation = "/";
    }

    public void mnozenje_click(){
        String value = input.getText();
        long valueNumber = Integer.parseInt(value);
        this.fnumber = valueNumber;
        input.setText("");
        prom.setText(value + "x");
        operation = "x";
    }

    public void mod_click(){
        String value = input.getText();
        long valueNumber = Integer.parseInt(value);
        this.fnumber = valueNumber;
        input.setText("");
        prom.setText(value + "%");
        operation = "%";
    }

    public void jednako_click(){
        switch(operation){
            case"+":
                String value = input.getText();
                this.snumber = Integer.parseInt(value);
                long system = this.fnumber + this.snumber;
                input.setText(String.valueOf(system));
                String oldProm = prom.getText();
                prom.setText(oldProm + value);
                break;

            case"-":
                String valueOduzimanje = input.getText();
                this.snumber = Integer.parseInt(valueOduzimanje);
                long systemOduzimanje = this.fnumber + this.snumber;
                input.setText(String.valueOf(systemOduzimanje));
                String oldPromOduzimanje = prom.getText();
                prom.setText(oldPromOduzimanje + valueOduzimanje);
                break;

            case"x":
                String valueMnozenje = input.getText();
                this.snumber = Integer.parseInt(valueMnozenje);
                long systemMnozenje = this.fnumber + this.snumber;
                input.setText(String.valueOf(systemMnozenje));
                String oldPromMnozenje = prom.getText();
                prom.setText(oldPromMnozenje + valueMnozenje);
                break;

            case "/":
                String valueD = input.getText();
                this.snumber = Integer.parseInt(valueD);
                long systemD = this.fnumber + this.snumber;
                input.setText(String.valueOf(systemD));
                String oldPromD = prom.getText();
                prom.setText(oldPromD + valueD);
                break;

            case "%":
                String valueMod = input.getText();
                this.snumber = Integer.parseInt(valueMod);
                long systemMod = this.fnumber + this.snumber;
                input.setText(String.valueOf(systemMod));
                String oldPromMod = prom.getText();
                prom.setText(oldPromMod + valueMod);
                break;


        }
    }




















}
