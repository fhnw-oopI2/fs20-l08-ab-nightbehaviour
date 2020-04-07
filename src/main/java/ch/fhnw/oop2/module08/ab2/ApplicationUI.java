package ch.fhnw.oop2.module08.ab2;

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
        button.setOnAction(event -> pm.toggle());


        pm.buttonState.addListener(event -> updateButtonLabel());
        updateButtonLabel();
    }

    private void updateButtonLabel() {
        button.setText(pm.buttonState.getValue().label);
    }

    private void layoutControls() {
        setAlignment(Pos.CENTER);
        getChildren().addAll(button);
    }
}
