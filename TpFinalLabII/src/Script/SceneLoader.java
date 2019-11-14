package Script;

import javafx.application.Platform;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.InputEvent;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Esta clase se encarga de cargar todas las ventanas en la interface grafica
 * @autor: Franco Daniel , Gonzalez Luis , Patania Luciano , Zeniquel Ivan
 * @Version: 1.0
 */
public class SceneLoader {
   //Atributos de clase
    public static java.util.List <String> ComboBoxTipo = new ArrayList<>();
   public static java.util.List <String> ComboBoxEstiloAuto = new ArrayList<>();
   public static java.util.List <String> ComboBoxEstiloMoto = new ArrayList<>();

    /**
     * Inicia la ventana de Login
     * @throws IOException
     */
    public void LoadLogInScene() throws IOException{ // Inicia la pantalla de login
        // ((Node) (event.getSource())).getScene().getWindow().hide();
            Parent parent = FXMLLoader.load(getClass().getResource("/sample/sample.fxml"));
            Stage stage = new Stage();
            Scene scene = new Scene(parent);
            stage.setScene(scene);
            stage.setTitle("Log In");
            stage.show();
    }

    /**
     * Inicia la ventana del Menu Principal
     * @throws IOException
     */
    public void LoadMainMenuScene(MouseEvent event) throws IOException {// inicia la pantalla de menu principal
            ((Node)(event.getSource())).getScene().getWindow().hide();
            Parent parent = FXMLLoader.load(getClass().getResource("/sample/MenuPrincipal.fxml"));
            Stage stage = new Stage();
            Scene scene = new Scene(parent);
            stage.setScene(scene);
            stage.setTitle("MENU PRINCIPAL");
            stage.show();
        }

    /**
     * Inicia la ventana para cargar un nuevo vehiculo
     * @throws IOException
     */
    public void LoadCargaStock() throws IOException {// inicia la pantalla de menu principal
       // ((Node)(event.getSource())).getScene().getWindow().hide();
        Parent parent = FXMLLoader.load(getClass().getResource("/sample/CargaStockScene.fxml"));
        Stage stage = new Stage();
        Scene scene = new Scene(parent);
        stage.setScene(scene);
        stage.setTitle("Carga Stock");
        stage.show();
    }

    /**
     * Inicia la ventana para realizar una venta
     * @throws IOException
     */
    public void LoadVenta() throws IOException{
        Parent parent = FXMLLoader.load(getClass().getResource("/sample/Ventas.fxml"));
        Stage stage = new Stage();
        Scene scene = new Scene(parent);
        stage.setScene(scene);
        stage.setTitle("VENTAS");
        stage.show();
    }

    /**
     * Inicia la ventana de compra
     * @throws IOException
     */
    public void LoadCompra() throws IOException{
        Parent parent = FXMLLoader.load(getClass().getResource("/sample/CompraVehiculo.fxml"));
        Stage stage = new Stage();
        Scene scene = new Scene(parent);
        stage.setScene(scene);
        stage.setTitle("COMPRA");
        stage.show();
    }

    /**
     * Inicia la ventana de Registros de ventas
     * @throws IOException
     */
    public void LoadRegistroVentas() throws IOException{
        Parent parent = FXMLLoader.load(getClass().getResource("/sample/VentasRegistroWindow.fxml"));
        Stage stage = new Stage();
        Scene scene = new Scene(parent);
        stage.setScene(scene);
        stage.setTitle("Registros Ventas");
        stage.show();
    }

    /**
     * Inicia la ventana de registros de compra
     */
    public void LoadComprasRegistro () throws IOException{
        Parent parent = FXMLLoader.load(getClass().getResource("/sample/ComprasRegistros.fxml"));
        Stage stage = new Stage();
        Scene scene = new Scene(parent);
        stage.setScene(scene);
        stage.setTitle("Registros Compra");
        stage.show();
    }

    /**
     * Inicia la ventana de vista detallada
     */
    public void LoadVistaDetallada() throws IOException{
        Parent parent = FXMLLoader.load(getClass().getResource("/sample/MostrarVehiculo.fxml"));
        Stage stage = new Stage();
        Scene scene = new Scene(parent);
        stage.setScene(scene);
        stage.setTitle("FICHA TECNICA");
        stage.show();
    }
}

