package sample;

import Script.Contenedora;
import Script.Venta;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class ControllerVentaRegistro implements Initializable {

    @FXML
    private TableView<Venta> TableVentas;
    @FXML private TableColumn<Venta,String> vehiVenta;
    @FXML private TableColumn<Venta,String> garantia;
    @FXML private TableColumn<Venta,String> fechaBaja;
    @FXML private TableColumn<Venta,String> nombreComprador;
    @FXML private TableColumn<Venta,String> apellidoComprador;
    @FXML private TableColumn<Venta,String> dniComprador;
    @FXML private TableColumn<Venta,String> direccComprador;
    @FXML private TableColumn<Venta,String> telComprador;
    @FXML private TableColumn<Venta,String> precioVenta;

    public void initialize(URL location, ResourceBundle resources) {
        //Contenedora.Ventas.get(1).getVehiVenta().getMarca();
        vehiVenta.setCellValueFactory(new PropertyValueFactory<Venta,String>("VehiVenta"));
        nombreComprador.setCellValueFactory(new PropertyValueFactory<Venta,String>("nombreComprador"));
        apellidoComprador.setCellValueFactory(new PropertyValueFactory<Venta,String>("apellidoComprador"));
        dniComprador.setCellValueFactory(new PropertyValueFactory<Venta,String>("dniComprador"));
        direccComprador.setCellValueFactory(new PropertyValueFactory<Venta,String>("direccComprador"));
        telComprador.setCellValueFactory(new PropertyValueFactory<Venta,String>("telComprador"));
        fechaBaja.setCellValueFactory(new PropertyValueFactory<Venta,String>("fechaBaja"));
        garantia.setCellValueFactory(new PropertyValueFactory<Venta,String>("garantia"));
        precioVenta.setCellValueFactory(new PropertyValueFactory<Venta,String>("precioVenta"));
        ObservableList<Venta> ObserList2 = FXCollections.observableArrayList(Contenedora.Ventas);
        TableVentas.setItems(ObserList2);
    }
}
