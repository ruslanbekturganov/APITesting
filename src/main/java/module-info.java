module com.example.apitesting {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.apitesting to javafx.fxml;
    exports com.example.apitesting;
}