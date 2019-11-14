package sample;

import Script.*;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.initStyle(StageStyle.TRANSPARENT);
        primaryStage.setTitle("Automotor Don Pepe");
        primaryStage.setScene(new Scene(root, 400, 400));
        primaryStage.show();
        BaseDatosListas.LeerArchBajas();
        BaseDatosListas.LeerId();
        BaseDatosListas.LeerArchCompras();
        BaseDatosListas.LeerArchVentas();
        BaseDatosListas.LeerArchAlta();
        BaseDatosListas.LeerUser();
        BaseDatosListas.LeerPass();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
