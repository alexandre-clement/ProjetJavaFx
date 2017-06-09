package fr.polytech.ihm;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main extends Application
{

    private static final Logger log = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) throws Exception
    {
        launch(args);
    }

    public void start(Stage stage) throws Exception
    {

        log.info("Lancement de l'application");

        String fxmlFile = "/fxml/home.fxml";
        log.debug("Loading FXML for main view from: {}", fxmlFile);
        FXMLLoader loader = new FXMLLoader();
        Parent rootNode = loader.load(getClass().getResourceAsStream(fxmlFile));

        log.debug("Showing JFX scene");
        Scene scene = new Scene(rootNode, 1366, 716);

        stage.setTitle("To Be or to have");
        stage.setScene(scene);
        stage.show();
    }
}
