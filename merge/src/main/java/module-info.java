module org.example.merge {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.merge to javafx.fxml;
    exports org.example.merge;
}