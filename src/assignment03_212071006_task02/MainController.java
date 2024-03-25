/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package assignment03_212071006_task02;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

/**
 * FXML Controller class
 *
 * @author samiul
 */

public class MainController implements Initializable {

    @FXML
    private TextField usernamefield;
    @FXML
    private PasswordField passwordfield;
    @FXML
    private RadioButton malefield;
    @FXML
    private ToggleGroup Gender;
    @FXML
    private RadioButton femalefield;
    @FXML
    private RadioButton otherfield;
    @FXML
    private Button submitbutton;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

    @FXML
    private void UserNameAction(ActionEvent event) {
    }

    @FXML
    private void PasswordAction(ActionEvent event) {
    }

    @FXML
    private void MaleAction(ActionEvent event) {
    }

    @FXML
    private void FemaleAction(ActionEvent event) {
    }

    @FXML
    private void OtherAction(ActionEvent event) {
    }

    @FXML
    private void SubmitAction(ActionEvent event) {
        String userId = usernamefield.getText();
        String password = passwordfield.getText();
        String gender = "";
        if (malefield.isSelected()) {
            gender = "Male";
        } else if (femalefield.isSelected()) {
            gender = "Female";
        } else if (otherfield.isSelected()) {
            gender = "Other";
        }

        System.out.println("User ID: " + userId);
        System.out.println("Password: " + password);
        System.out.println("Gender: " + gender);
    }

}
