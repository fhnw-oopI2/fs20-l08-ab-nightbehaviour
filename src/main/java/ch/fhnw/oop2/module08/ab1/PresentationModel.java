package ch.fhnw.oop2.module08.ab1;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class PresentationModel {
    public final StringProperty applicationName = new SimpleStringProperty("Arbeitsblatt (1)");
    public final StringProperty buttonLabel = new SimpleStringProperty("Hello World!");
}