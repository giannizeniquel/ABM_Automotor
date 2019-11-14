package sample;

import Script.*;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.MenuItem;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import javax.swing.*;
import java.awt.*;
import java.awt.TextField;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;


public class Controller implements Initializable {
     @FXML
     private JFXTextField loguserbox;
    @FXML private JFXPasswordField logpasswordbox;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }

    public void ExitButtonLog(MouseEvent event){
        Platform.exit();
        System.exit(0);
    }

    public void VerificacionUsuPassController(MouseEvent event) throws Exception {
        boolean verifi = Login.VerificacionUsuaPassw(loguserbox.getText(),logpasswordbox.getText());
        if(verifi){
            SceneLoader loader = new SceneLoader();
           loader.LoadMainMenuScene(event);
        }else{
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null,"ERROR: Usuario/Contraseña INCORRECTO");
        }
    }
}
