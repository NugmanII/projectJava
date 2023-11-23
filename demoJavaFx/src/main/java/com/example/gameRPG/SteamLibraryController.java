package com.example.gameRPG;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class SteamLibraryController {

    @FXML
    private Label communtiyButton;

    @FXML
    private Button faqButton;

    @FXML
    private Button friendsButton;

    @FXML
    private Button gamesButton;

    @FXML
    private Label libraryButton;

    @FXML
    private Button loginSignUpButton121;

    @FXML
    private Button playButton;

    @FXML
    private Button playDDDButton;

    @FXML
    private Button playDotaButton;

    @FXML
    private Button playETIButton;

    @FXML
    private Button playTATSButton;

    @FXML
    private Label profileButton;

    @FXML
    private Label shopButton;

    @FXML
    private Button showButton;

    @FXML
    private Button steamButton;

    @FXML
    private Button viewButton;

    void initialize() {
        playButton.setOnAction(event -> {
            playButton.getScene().getWindow().hide();

            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/resources/com.example.gameRPG/!!!.fxml"));
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
