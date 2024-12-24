module aspmvcstatus {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;

    opens aspmvcstatus to javafx.fxml;
    exports aspmvcstatus;
}
