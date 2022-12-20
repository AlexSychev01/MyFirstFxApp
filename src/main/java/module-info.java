module com.example.myfirstfxapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.myfirstfxapp to javafx.fxml;
    exports com.example.myfirstfxapp;
}