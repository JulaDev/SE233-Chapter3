module se233.chapter3 {
    requires javafx.controls;
    requires javafx.fxml;
    requires pdfbox.app;


    opens se233.chapter3 to javafx.fxml;
    exports se233.chapter3;
    opens se233.chapter3.controller;
    exports se233.chapter3.controller;
}