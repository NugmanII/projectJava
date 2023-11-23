package com.example.gameRPG;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class SteamLoginController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private CheckBox loginDoSave;

    @FXML
    private Button loginLoginButton;

    @FXML
    private PasswordField loginPasswordField;

    @FXML
    private Button loginRegistrationButton;

    @FXML
    private TextField loginUsernameField;

    @FXML
    void initialize() {
        loginLoginButton.setOnAction(event -> {
            String loginTextUsername = loginUsernameField.getText().trim();
            String loginPassword = loginPasswordField.getText().trim();
            if(!loginTextUsername.equals("") && !loginPassword.equals("")) loginUser(loginTextUsername, loginPassword)
        });

        loginRegistrationButton.setOnAction(event -> {
            loginRegistrationButton.getScene().getWindow().hide();

            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/resources/com.example.gameRPG/registration-view.fxml"));
                try {
                    loader.load();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }

                Parent root = loader.getRoot();
                Stage stage = new Stage();

                stage.setScene(new Scene(root));
                stage.showAndWait();
        });
    }

}
