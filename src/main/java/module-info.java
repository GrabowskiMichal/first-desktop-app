module com.example.firstdesktopapp {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.firstdesktopapp to javafx.fxml;
    exports com.example.firstdesktopapp;
}