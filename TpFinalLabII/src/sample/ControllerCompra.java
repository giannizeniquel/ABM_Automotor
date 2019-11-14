package sample;

import Script.*;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ControllerCompra implements Initializable {
    @FXML private TextField NumMotorTField;
    @FXML private TextField nombre;
    @FXML private TextField apellido;
    @FXML private TextField dni;
    @FXML private TextField direccion;
    @FXML private TextField email;
    @FXML private TextField telefono;
    @FXML private TextField fecha;
    @FXML private TextField precio;
    @FXML private TextField modoPago;
    @FXML private Button Confirmar;
    @FXML private Button Aceptar;
    private boolean willConsume;
    public void initialize(URL location, ResourceBundle resources) {
        Confirmar.setVisible(false);
        dni.addEventFilter(KeyEvent.ANY, handlerLetters);
        telefono.addEventFilter(KeyEvent.ANY, handlerLetters);
        precio.addEventFilter(KeyEvent.ANY, handlerLetters);
    }
    /**
     * Verifica si el vehiculo que se va a comprar lo vendio la consecinaria para reciclar datos
     * @throws IOException
     */
    public void CompraVehculoVerificacion() throws IOException {
        if (!NumMotorTField.getText().isEmpty()) {
            String motor = NumMotorTField.getText();
            if (modoPago.getText().isEmpty() || nombre.getText().isEmpty() || apellido.getText().isEmpty() || dni.getText().isEmpty() || direccion.getText().isEmpty() ||
                    telefono.getText().isEmpty() || fecha.getText().isEmpty() || precio.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null,"ERROR: Verifique los datos");
            }else  {
                Vehiculo v;
                v = Contenedora.BusquedaEnBajaComprar(motor);
                if (v == null) {
                    Contenedora.vehiculoBusquedas = null;
                    SceneLoader loader = new SceneLoader();
                    loader.LoadCargaStock();
                    Aceptar.setVisible(false);
                    Confirmar.setVisible(true);
                } else {
                    Contenedora.vehiculoBusquedas = v;
                    Contenedora.AltaBaja(Contenedora.vehiculoBusquedas.getIdVehiculo(),2);
                    SceneLoader loader = new SceneLoader();
                    loader.LoadCargaStock();
                    Aceptar.setVisible(false);
                    Confirmar.setVisible(true);
                }
            }
        }else{
            JOptionPane.showMessageDialog(null,"ERROR: Verifique los datos");
        }
    }

    public void ConfirmarCompra() throws Exception{
        Vehiculo v = Contenedora.Alta.get(Contenedora.Alta.size()-1);
        float pre = Float.parseFloat(precio.getText());
        if(email.getText().isEmpty()) {
            CompraUsados nuevaCompra = new CompraUsados(v,fecha.getText(),modoPago.getText(),nombre.getText(),apellido.getText(),dni.getText(),direccion.getText(),telefono.getText(),pre);
            nuevaCompra.getVehiCompra().setEstado(true);
            Contenedora.Compras.add(nuevaCompra);
            BaseDatosListas.EscribirArchCompras();
            BaseDatosListas.LeerArchCompras();
            JOptionPane.showMessageDialog(null,"Compra Exitosa");
        }else {
            CompraUsados nuevaCompra = new CompraUsados(v,fecha.getText(),modoPago.getText(),nombre.getText(),apellido.getText(),dni.getText(),direccion.getText(),email.getText(),telefono.getText(),pre);
            Contenedora.AltaBaja(nuevaCompra.getVehiCompra().getIdVehiculo(),2);
            nuevaCompra.getVehiCompra().setEstado(true);
            Contenedora.Compras.add(nuevaCompra);
            BaseDatosListas.EscribirArchCompras();
            BaseDatosListas.LeerArchCompras();
            JOptionPane.showMessageDialog(null,"Compra Exitosa");
        }
    }

    EventHandler<KeyEvent> handlerLetters = new EventHandler<KeyEvent>() {
        @Override
        public void handle(KeyEvent event) {
            if (willConsume) {
                event.consume();
            }
            if(!event.getText().matches("[\\d.]") && event.getCode() != KeyCode.BACK_SPACE){
                if(event.getEventType() == KeyEvent.KEY_PRESSED){
                    willConsume = true;
                }else if(event.getEventType() == KeyEvent.KEY_RELEASED){
                    willConsume = false;
                }
            }
        }
    };
}
