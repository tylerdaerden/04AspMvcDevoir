package aspmvcdevoir.Controller;

import java.io.IOException;

import aspmvcdevoir.App;
import javafx.fxml.FXML;

public class PrimaryController {

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
}
