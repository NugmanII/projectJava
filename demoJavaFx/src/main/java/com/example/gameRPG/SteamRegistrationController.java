package com.example.gameRPG;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class SteamRegistrationController {

    @FXML
    private CheckBox isApproved;

    @FXML
    private TextField regEmail;

    @FXML
    private PasswordField regPassword;

    @FXML
    private PasswordField regUsername;

    @FXML
    private Button registrationButton;

    void initialize() {
        registrationButton.setOnAction(event -> {
            registrationButton.getScene().getWindow().hide();

            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/resources/com.example.gameRPG/steamLibrary.fxml"));
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
