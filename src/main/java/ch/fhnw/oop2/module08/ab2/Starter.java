package ch.fhnw.oop2.module08.ab2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public final class Starter extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        PresentationModel pm = new PresentationModel();

        final Scene scene = new Scene(new ApplicationUI(pm), 400, 400);

        stage.setScene(scene);
        stage.setResizable(true);
        stage.titleProperty().bindBidirectional(pm.applicationName);
        stage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
