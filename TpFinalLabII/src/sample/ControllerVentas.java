package sample;

import Script.BaseDatosListas;
import Script.Contenedora;
import Script.Vehiculo;
import Script.Venta;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.text.Text;

import javax.swing.*;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ControllerVentas implements Initializable {

    @FXML Text MarcaText;
    @FXML Text ModeloText;
    @FXML Text ColorText;
    @FXML Text NumMotorText;
    @FXML Text NumChasisText;
    @FXML Text AnioFabText;
    @FXML TextField GarantiaTField;
    @FXML TextField PrecioTField;
    @FXML TextField NombreTfield;
    @FXML TextField ApellidoTField;
    @FXML TextField DniTField;
    @FXML TextField EmailTField;
    @FXML TextField TelefonoTField;
    @FXML TextField DireccionTField;
    @FXML TextField FechaTField;
    @FXML ComboBox<String> MetPagoComboBox;
    private boolean willConsume;
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        DniTField.addEventFilter(KeyEvent.ANY,handlerLetters);
        GarantiaTField.addEventFilter(KeyEvent.ANY,handlerLetters);
        PrecioTField.addEventFilter(KeyEvent.ANY,handlerLetters);
        TelefonoTField.addEventFilter(KeyEvent.ANY,handlerLetters);
        IniciaVentanaVenta();
    }
    ObservableList<String> comboMetodoPago = FXCollections.observableArrayList(
            "Efectivo",
            "Tarjeta de credito",
            "Financiacion DON PEPE AUTOMOTORES"
    );

    public void IniciaVentanaVenta(){
        MetPagoComboBox.setItems(comboMetodoPago);
        Vehiculo v = Contenedora.vehiculoBusquedas;
        MarcaText.setText(v.getMarca());
        ModeloText.setText(v.getModelo());
        ColorText.setText(v.getColor());
        NumMotorText.setText(v.getNumMotor());
        NumChasisText.setText(v.getNumChasis());
        AnioFabText.setText(v.getAnioFabricacion());
    }

    public void CrearVenta() throws Exception {
        if(FechaTField.getText().isEmpty() && GarantiaTField.getText().isEmpty() && MetPagoComboBox.getValue().isEmpty() && NombreTfield.getText().isEmpty() &&
                ApellidoTField.getText().isEmpty() && DniTField.getText().isEmpty() && DireccionTField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null,"ERROR: FALTA RELLENAR CAMPOS");
        }else{
            float precio = Float.parseFloat(PrecioTField.getText());
            if (EmailTField.getText().isEmpty()) {
                Venta nuevaVenta = new Venta(Contenedora.vehiculoBusquedas, FechaTField.getText(), GarantiaTField.getText(), MetPagoComboBox.getValue(),
                        NombreTfield.getText(), ApellidoTField.getText(),
                        DniTField.getText(), DireccionTField.getText(),
                        TelefonoTField.getText(), precio);
                        Contenedora.Ventas.add(nuevaVenta);
                        nuevaVenta.getVehiVenta().setEstado(false);
                        BaseDatosListas.EscribirArchVentas();
                        BaseDatosListas.LeerArchVentas();
                        Contenedora.AltaBaja(nuevaVenta.getVehiVenta().getIdVehiculo(),1);
                        BaseDatosListas.EscribirArchAltas();
                        BaseDatosListas.EscribirArchBajas();
                        JOptionPane.showMessageDialog(null,"Exito al guardar");
            } else {
                Venta nuevaVenta = new Venta(Contenedora.vehiculoBusquedas, FechaTField.getText(), GarantiaTField.getText(), MetPagoComboBox.getValue(),
                        NombreTfield.getText(), ApellidoTField.getText(),
                        DniTField.getText(), DireccionTField.getText(), EmailTField.getText(),
                        TelefonoTField.getText(), precio);
                        Contenedora.Ventas.add(nuevaVenta);
                        nuevaVenta.getVehiVenta().setEstado(false);
                        BaseDatosListas.EscribirArchVentas();
                        BaseDatosListas.LeerArchVentas();
                        Contenedora.AltaBaja(nuevaVenta.getVehiVenta().getIdVehiculo(),1);
                        BaseDatosListas.EscribirArchAltas();
                        BaseDatosListas.EscribirArchBajas();
                        JOptionPane.showMessageDialog(null,"Exito al guardar");
            }
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
