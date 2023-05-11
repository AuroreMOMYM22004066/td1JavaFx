module com.example.td1javafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.td1javafx to javafx.fxml;
    exports com.example.td1javafx;
    exports com.example.partie1_1;
    exports com.example.partie1_2;
    exports com.example.partie1_3;
    exports com.example.partie2_1;

}