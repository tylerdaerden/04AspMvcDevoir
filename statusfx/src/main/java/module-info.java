module aspmvcdevoir {
    requires javafx.controls;
    requires javafx.fxml;

    opens aspmvcdevoir to javafx.fxml;
    exports aspmvcdevoir;
}
