package ch.fhnw.oop2.module08.ab1;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;

public class ApplicationUI extends VBox {
    private final PresentationModel pm;

    private Button button;

    public ApplicationUI(PresentationModel pm) {
        this.pm = pm;
        initializeControls();
        layoutControls();
    }

    private void initializeControls() {
        button = new Button();
        button.textProperty().bind(pm.buttonLabel);
    }

    private void layoutControls() {
        setAlignment(Pos.CENTER);
        getChildren().addAll(button);
    }
}
