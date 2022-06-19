/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package pkg21523281;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

/**
 *
 * @author Nabil
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private TextField textField ;

    @FXML
    private TextField tampilan ;

    @FXML
    private Data data = new Data();

    @FXML
    private String operator ;

    @FXML
    private boolean bil1Sdh = false ;

    @FXML
    private boolean bil2Sdh = false ;

    @FXML
    private boolean sdhMin = false ;

    @FXML
    private void handleButton1(ActionEvent event) {
        String hasilString = data.getOperasi() + "1";
        data.tambahStr("1");
        data.setOperasi(hasilString);
        textField.setText(data.getOperasi());
        tampilan.setText(data.getTampilanStr());
    }
    @FXML
    private void handleButton2(ActionEvent event) {
        String hasilString = data.getOperasi() + "2";
        data.tambahStr("2");
        data.setOperasi(hasilString);
        textField.setText(data.getOperasi());
        tampilan.setText(data.getTampilanStr());

    }
    @FXML
    private void handleButton3(ActionEvent event) {
        String hasilString = data.getOperasi() + "3";
        data.tambahStr("3");
        data.setOperasi(hasilString);
        textField.setText(data.getOperasi());
        tampilan.setText(data.getTampilanStr());
    }
    @FXML
    private void handleButton4(ActionEvent event) {
        String hasilString = data.getOperasi() + "4";
        data.tambahStr("4");
        data.setOperasi(hasilString);
        textField.setText(data.getOperasi());
        tampilan.setText(data.getTampilanStr());
    }
    @FXML
    private void handleButton5(ActionEvent event) {
        String hasilString = data.getOperasi() + "5";
        data.tambahStr("5");
        data.setOperasi(hasilString);
        textField.setText(data.getOperasi());
        tampilan.setText(data.getTampilanStr());
    }
    @FXML
    private void handleButton6(ActionEvent event) {
        String hasilString = data.getOperasi() + "6";
        data.tambahStr("6");
        data.setOperasi(hasilString);
        textField.setText(data.getOperasi());
        tampilan.setText(data.getTampilanStr());
    }
    @FXML
    private void handleButton7(ActionEvent event) {
        String hasilString = data.getOperasi() + "7";
        data.tambahStr("7");
        data.setOperasi(hasilString);
        textField.setText(data.getOperasi());
        tampilan.setText(data.getTampilanStr());
    }
    @FXML
    private void handleButton8(ActionEvent event) {
        String hasilString = data.getOperasi() + "8";
        data.tambahStr("8");
        data.setOperasi(hasilString);
        textField.setText(data.getOperasi());
        tampilan.setText(data.getTampilanStr());
    }
    @FXML
    private void handleButton9(ActionEvent event) {
        String hasilString = data.getOperasi() + "9";
        data.tambahStr("9");
        data.setOperasi(hasilString);
        textField.setText(data.getOperasi());
        tampilan.setText(data.getTampilanStr());
    }
    @FXML
    private void handleButton0(ActionEvent event) {
        String hasilString = data.getOperasi() + "0";
        data.tambahStr("0");
        data.setOperasi(hasilString);
        textField.setText(data.getOperasi());
        tampilan.setText(data.getTampilanStr());
    }

    @FXML
    private void handleButtonHapus(ActionEvent event) {
        data.setOperasi("");
        textField.setText("");
        data.setTampilanStr("");
        tampilan.setText("");

    }

    @FXML
    private void handleButtonPlus(ActionEvent event) {
        operator = "+";
        data.setTampilanStr(data.getTampilanStr() + " " + operator);
        data.setBilangan1(Integer.parseInt(data.getOperasi()));
        data.setOperasi("");
        textField.setText("");
        tampilan.setText(data.getTampilanStr());
    }

    @FXML
    private void handleButtonKurang(ActionEvent event) {
        operator = "-";
        data.setTampilanStr(data.getTampilanStr() + " " + operator);
        data.setBilangan1(Integer.parseInt(data.getOperasi()));
        data.setOperasi("");
        textField.setText("");
        tampilan.setText(data.getTampilanStr());
    }

    @FXML
    private void handleButtonKali(ActionEvent event) {
        operator = "*";
        data.setTampilanStr(data.getTampilanStr() + " " + "x");
        data.setBilangan1(Integer.parseInt(data.getOperasi()));
        data.setOperasi("");
        textField.setText("");
        tampilan.setText(data.getTampilanStr());
    }

    @FXML
    private void handleButtonBagi(ActionEvent event) {
        operator = "/" ;
        data.setTampilanStr(data.getTampilanStr() + " " + operator);
        data.setBilangan1(Integer.parseInt(data.getOperasi()));
        data.setOperasi("");
        textField.setText("");
        tampilan.setText(data.getTampilanStr());
    }

    @FXML
    private void handleButtonSamaDengan(ActionEvent event) {
//        String.format("%.0f", data.getHasil());
        boolean apakahPembagian = false;
        data.setBilangan2(Integer.parseInt(data.getOperasi()));
        data.setOperasi("");
        data.tambahStr("=");
        tampilan.setText(data.getTampilanStr());
        switch (operator) {
            case "+" :
                data.Penjumlahan();
                break;
            case "-" :
                data.Pengurangan();
                break ;
            case "*" :
                data.Perkalian();
                break;
            case "/" :
                data.Pembagian();
                apakahPembagian = true;
                break;
            default :
                textField.setText("ERROR");

        }
        if (apakahPembagian) {
            if (data.getHasil() % 1 == 0) {
                int hasil = (int) data.getHasil();
                textField.setText(Integer.toString(hasil));
            } else {
                textField.setText(Double.toString(data.getHasil()));
            }

        } else {
            int hasilInt = (int)data.getHasil();
            textField.setText(Integer.toString(hasilInt));
        }


    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
