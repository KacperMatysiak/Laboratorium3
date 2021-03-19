package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.sql.SQLOutput;

public class Controller {
    public Button btnMain;
    public TextField txtLicznik;
    int ClickCounter = 0;

    public void onBtnAction(ActionEvent actionEvent) {
        System.out.println("Kliknięcie nr " + ++ClickCounter);
        txtLicznik.setText(String.valueOf(ClickCounter));
    }

}