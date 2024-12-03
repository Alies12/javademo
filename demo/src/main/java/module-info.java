module hexlet.code.demo {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires java.sql;

    opens hexlet.code.demo to javafx.fxml;
    exports hexlet.code.demo;
}