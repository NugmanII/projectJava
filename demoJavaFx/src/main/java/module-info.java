module com.example.demojavafx {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.gameRPG to javafx.fxml;
    exports com.example.gameRPG;
}