package sample;

import Script.CompraUsados;
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

public class ControllerCompraRegistro implements Initializable {

    @FXML
    private TableView<CompraUsados> TableVentas;
    @FXML private TableColumn<CompraUsados,String> vehiCompra;
    @FXML private TableColumn<CompraUsados,String> fechaCompra;
    @FXML private TableColumn<CompraUsados,String> nombreVendedor;
    @FXML private TableColumn<CompraUsados,String> apellidoVendedor;
    @FXML private TableColumn<CompraUsados,String> dniVendedor;
    @FXML private TableColumn<CompraUsados,String> direccVendedor;
    @FXML private TableColumn<CompraUsados,String> telVendedor;
    @FXML private TableColumn<CompraUsados,String> precioCompra;

    public void initialize(URL location, ResourceBundle resources) {
        vehiCompra.setCellValueFactory(new PropertyValueFactory<CompraUsados,String>("vehiCompra"));
        nombreVendedor.setCellValueFactory(new PropertyValueFactory<CompraUsados,String>("nombreVendedor"));
        apellidoVendedor.setCellValueFactory(new PropertyValueFactory<CompraUsados,String>("apellidoVendedor"));
        dniVendedor.setCellValueFactory(new PropertyValueFactory<CompraUsados,String>("dniVendedor"));
        direccVendedor.setCellValueFactory(new PropertyValueFactory<CompraUsados,String>("direccVendedor"));
        telVendedor.setCellValueFactory(new PropertyValueFactory<CompraUsados,String>("telVendedor"));
        fechaCompra.setCellValueFactory(new PropertyValueFactory<CompraUsados,String>("fechaCompra"));
        precioCompra.setCellValueFactory(new PropertyValueFactory<CompraUsados,String>("precioCompra"));
        ObservableList<CompraUsados> ObserList2 = FXCollections.observableArrayList(Contenedora.Compras);
        TableVentas.setItems(ObserList2);
    }
}
