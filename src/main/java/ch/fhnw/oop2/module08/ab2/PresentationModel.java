package ch.fhnw.oop2.module08.ab2;

import javafx.beans.property.*;


public class PresentationModel {
    public enum ButtonState {
        ON(true, "On"), OFF(false, "Off");

        public boolean value;
        public String label;

        private ButtonState(final boolean value, final String label) {
            this.value = value;
            this.label = label;
        }
    }

    public final StringProperty applicationName = new SimpleStringProperty("Arbeitsblatt (1)");

    public final ObjectProperty<ButtonState> buttonState = new SimpleObjectProperty<>(ButtonState.OFF);

    public void toggle() {
        if (buttonState.getValue().equals(ButtonState.ON)) {
            buttonState.setValue(ButtonState.OFF);
        } else {
            buttonState.setValue(ButtonState.ON);
        }
    }
}