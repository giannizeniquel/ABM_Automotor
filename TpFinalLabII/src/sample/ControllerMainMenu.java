package sample;

import Script.*;
import javafx.application.Platform;
import javafx.beans.property.ReadOnlyStringWrapper;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;

import javax.swing.*;
import javax.swing.plaf.synth.SynthTextAreaUI;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URL;
import java.time.temporal.ValueRange;
import java.util.ResourceBundle;

public class ControllerMainMenu implements Initializable {
    @FXML
    public static int IdVehiculosBusqueda;
    @FXML private TableView<Vehiculo> Table;
    @FXML private TableColumn<Vehiculo,String> vehiculo;
    @FXML private TableColumn<Vehiculo,String> marca;
    @FXML private TableColumn<Vehiculo,String> modelo;
    @FXML private TableColumn<Vehiculo,String> color;
    @FXML private TableColumn<Vehiculo,String> cilindrada;
    @FXML private TableColumn<Vehiculo,String> transmicion;
    @FXML private TableColumn<Vehiculo,String> kilometraje;
    @FXML private TableColumn<Vehiculo,String> precio;
    SceneLoader loader = new SceneLoader();
    /**
     * Meotodo sobre escrito de la interface Initializate -  Llama al metodo RellenarListaIicio()
     * @param location
     * @param resources
     */
    public void initialize(URL location, ResourceBundle resources) {
       RellenarListInicio();
    }

    /**
     * Rellena la tabla del inicio con los vehiculos en Stock
     */

    public void RellenarListInicio(){
        vehiculo.setCellValueFactory(new PropertyValueFactory<Vehiculo,String>("tipoDeVehiculo"));
        marca.setCellValueFactory(new PropertyValueFactory<Vehiculo,String>("marca"));
        modelo.setCellValueFactory(new PropertyValueFactory<Vehiculo,String>("modelo"));
        color.setCellValueFactory(new PropertyValueFactory<Vehiculo,String>("color"));
        cilindrada.setCellValueFactory(new PropertyValueFactory<Vehiculo,String>("cilindrada"));
        transmicion.setCellValueFactory(new PropertyValueFactory<Vehiculo,String>("tansmision"));
        kilometraje.setCellValueFactory(new PropertyValueFactory<Vehiculo,String>("kilometraje"));
        precio.setCellValueFactory(new PropertyValueFactory<Vehiculo,String>("precioPesos"));
        ObservableList<Vehiculo> ObserList = FXCollections.observableArrayList(Contenedora.Alta);
        Table.setItems(ObserList);
    }

    /**
     * Devuelve el vehiculo seleccionado en la tabla
     */
    public void SelectVehiculoList(){
        Contenedora.vehiculoBusquedas =  Table.getSelectionModel().getSelectedItem();
    }

    /**
     * Abre la ventana para generar un nuevo vehiculo
     * @throws IOException
     */
    public void OpenCargaStock()throws IOException {
        Contenedora.vehiculoBusquedas = null;
        loader.LoadCargaStock();
    }

    public void OpenModification()throws IOException {
        if(!Table.getSelectionModel().isEmpty()) {
            SelectVehiculoList();
            loader.LoadCargaStock();
        }else{
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null,"ERROR: Seleccione un vehiculo");
        }
    }

    /**
     * Abre la ventana de compra
     * @throws IOException
     */
    public void OpenCompra() throws IOException{
        loader.LoadCompra();
    }

    /**
     * Cierra la ventana del Menu y abre la ventana de LogIn
     * @throws IOException
     */
    public void LogOut() throws IOException{
        //((Node)(event.getSource())).getScene().getWindow().hide();
        loader.LoadLogInScene();
    }

    /**
     * Abre la ventana de ventas
     * @throws IOException
     */
    public void OpenVentas() throws IOException{
        if(!Table.getSelectionModel().isEmpty()) {
            SelectVehiculoList();
            loader.LoadVenta();
        }else{
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null,"ERROR: Seleccione un vehiculo");
        }
    }
    /**
     * Abre la ventana de registros de ventas
     */
    public void OpenRegistrosVenta() throws IOException{
        loader.LoadRegistroVentas();
    }

    /**
     * Abre la ventana de registros de compras
     */
    public void OpenRegistroCompra() throws IOException{
        loader.LoadComprasRegistro();
    }
    /**
     * Sale del programa
     * @throws Exception
     */
    /**
     * Abre la ventana de ficha tecnica
     * @throws IOException
     */
    public void OpenFichaTecnica()throws IOException{
        if(!Table.getSelectionModel().isEmpty()) {
            SelectVehiculoList();
            loader.LoadVistaDetallada();
        }else{
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null,"ERROR: Seleccione un vehiculo");
        }

    }
    public void ExitButtonMenu() throws Exception{
        Platform.exit();
       System.exit(0);
    }
}
