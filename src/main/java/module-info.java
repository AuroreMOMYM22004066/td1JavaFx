module com.example.td1javafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.td1javafx to javafx.fxml;
    exports com.example.td1javafx;
}