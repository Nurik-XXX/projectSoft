module com.example.bekouml {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.bekouml to javafx.fxml;
    exports com.example.bekouml;
}