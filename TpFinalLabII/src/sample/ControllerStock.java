package sample;

import Script.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ComboBoxBase;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;

import javax.swing.*;
import java.awt.*;
import java.beans.IntrospectionException;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ControllerStock implements Initializable {
    private boolean willConsume = false;
    @FXML
    private ComboBox<String> TipoVehiCombBox;
    @FXML private ComboBox<String> EstiloAutoCombBox;
    @FXML private ComboBox<String> EstiloMotoCombBox;
    @FXML private TextField TFieldMarca;
    @FXML private TextField TFieldModelo;
    @FXML private TextField TFieldFecha;
    @FXML private TextField TFieldNumMotor;
    @FXML private TextField TFieldNumChasis;
    @FXML private TextField TFieldKilometro;
    @FXML private CheckBox CheckABS;
    @FXML private CheckBox CheckUsado;
    @FXML private CheckBox CheckAireAcon;
    @FXML private CheckBox CheckCierreCentra;
    @FXML private CheckBox CheckGPS;
    @FXML private CheckBox CheckMp3;
    @FXML private CheckBox CheckCamTrasera;
    @FXML private CheckBox CheckVeloCruce;
    @FXML private CheckBox CheckCristElectico;
    @FXML private CheckBox CheckBloqPuerta;
    @FXML private CheckBox CheckBluetooth;
    @FXML private CheckBox CheckUSB;
    @FXML private CheckBox CheckTecSolar;
    @FXML private CheckBox CheckTableroElect;
    @FXML private CheckBox CheckBaul;
    @FXML private CheckBox CheckPatada;
    @FXML private CheckBox CheckEncendElectrico;
    @FXML private Text TextConfort;
    @FXML private ComboBox<String> comboTransmi;
    @FXML private ComboBox<String> comboEmicion;
    @FXML private TextField TfieldColor;
    @FXML private TextField TfieldOrigen;
    @FXML private TextField TfieldCombustible;
    @FXML private TextField TfieldTraccion;
    @FXML private TextField TfieldFrenoDelantero;
    @FXML private TextField TfieldFrenoTracero;
    @FXML private TextField TfieldLlantas;
    @FXML private TextField TfieldCilindrada;
    @FXML private TextField TfieldRodado;
    @FXML private TextField TfieldValvulas;
    @FXML private TextField TfieldCFuerza;
    @FXML private TextField Tfield0100;
    @FXML private TextField TfieldVelocidadMaxima;
    @FXML private TextField TfieldCapTanque;
    @FXML private TextField TfieldConsumoCiudad;
    @FXML private TextField TfieldConsumoRuta;
    @FXML private TextField TfieldLargo;
    @FXML private TextField TfieldAncho;
    @FXML private TextField TfieldAlto;
    @FXML private TextField TfieldPrecioDolares;
    @FXML private TextField PrecioPesos;
    @FXML private TextField TfieldDireccion;
    @FXML private TextField TfieldCantPuertas;
    @FXML private Button ButtonConfirm;
    @FXML private Button ButonGuardar;
    private int count;
    ObservableList<String> comboVehiculosCont = FXCollections.observableArrayList(
            "Auto",
            "Camioneta",
            "Camion",
            "Moto"
    );
    ObservableList<String> comboEstiloAuto = FXCollections.observableArrayList(
            "MiniBand",
            "Coupe",
            "Deportivo",
            "Utilitario"
    );
    ObservableList<String> comboEstiloMoto = FXCollections.observableArrayList(
            "Chopper",
            "Street",
            "Utilitario"
    );
    ObservableList<String> comboTransmision = FXCollections.observableArrayList(
            "Manual",
            "SemiAutomatico",
            "Automatico"
    );
    ObservableList<String> comboEmicionObser = FXCollections.observableArrayList(
            "Inyeccion",
            "Carburacion"
    );
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        count=0;
        TipoVehiCombBox.setItems(comboVehiculosCont);
        EstiloAutoCombBox.setItems(comboEstiloAuto);
        EstiloMotoCombBox.setItems(comboEstiloMoto);
        comboEmicion.setItems(comboEmicionObser);
        comboTransmi.setItems(comboTransmision);
        if(Contenedora.vehiculoBusquedas == null) {
            ButtonConfirm.setVisible(false);
            //Hace que no pueda ingresar letras en esos campos
            TFieldKilometro.addEventFilter(KeyEvent.ANY, handlerLetters);
            TfieldCilindrada.addEventFilter(KeyEvent.ANY, handlerLetters);
            TfieldRodado.addEventFilter(KeyEvent.ANY, handlerLetters);
            TfieldValvulas.addEventFilter(KeyEvent.ANY, handlerLetters);
            TfieldCFuerza.addEventFilter(KeyEvent.ANY, handlerLetters);
            Tfield0100.addEventFilter(KeyEvent.ANY, handlerLetters);
            TfieldVelocidadMaxima.addEventFilter(KeyEvent.ANY, handlerLetters);
            TfieldCapTanque.addEventFilter(KeyEvent.ANY, handlerLetters);
            TfieldConsumoCiudad.addEventFilter(KeyEvent.ANY, handlerLetters);
            TfieldConsumoRuta.addEventFilter(KeyEvent.ANY, handlerLetters);
            TfieldLargo.addEventFilter(KeyEvent.ANY, handlerLetters);
            TfieldAncho.addEventFilter(KeyEvent.ANY, handlerLetters);
            TfieldAlto.addEventFilter(KeyEvent.ANY, handlerLetters);
            TfieldPrecioDolares.addEventFilter(KeyEvent.ANY, handlerLetters);
            PrecioPesos.addEventFilter(KeyEvent.ANY, handlerLetters);
            TfieldCantPuertas.addEventFilter(KeyEvent.ANY, handlerLetters);
            //////////////////////////////////////////////////////////////
            TFieldKilometro.setVisible(false);
            // Seteo las opciones en falso para que no se vean al menos que sea la opcion que elijio
            TextConfort.setVisible(false);
            EstiloMotoCombBox.setVisible(false);
            EstiloAutoCombBox.setVisible(false);
            CheckAireAcon.setVisible(false);
            CheckCierreCentra.setVisible(false);
            CheckGPS.setVisible(false);
            CheckMp3.setVisible(false);
            CheckCamTrasera.setVisible(false);
            CheckVeloCruce.setVisible(false);
            CheckCristElectico.setVisible(false);
            CheckBloqPuerta.setVisible(false);
            CheckBluetooth.setVisible(false);
            CheckUSB.setVisible(false);
            CheckTecSolar.setVisible(false);
            CheckTableroElect.setVisible(false);
            CheckBaul.setVisible(false);
            CheckPatada.setVisible(false);
            CheckEncendElectrico.setVisible(false);
        }else {
            MostrarAtributosModificacion();
        }
    }

    /**
     * llamada a las modificaciones
     */
    public void MofificacionesButton(MouseEvent event){
        Vehiculo v = Contenedora.vehiculoBusquedas;
        ModifVehiculo(v);
        ((Node)(event.getSource())).getScene().getWindow().hide();
    }
    public void MostrarAtributosModificacion(){
        ButonGuardar.setVisible(false);
        Vehiculo v = Contenedora.vehiculoBusquedas;
        if(count < 1) {
            if (v.isUsados()) {
                CheckUsado.fire();
                count++;
            }
        }
        TFieldMarca.setText(v.getMarca());
        TFieldModelo.setText(v.getModelo());
        TFieldNumChasis.setText(v.getNumChasis());
        TFieldNumMotor.setText(v.getNumMotor());
        TipoVehiCombBox.setVisible(false);
     /*   if (v.getTipoDeVehiculo() == null){
            tipoDeVehiculoV.setText("N/A");
        }else{
            tipoDeVehiculoV.setText(v.getTipoDeVehiculo());
        }*/
        if (v.getTansmision() != null){comboTransmi.setValue(v.getTansmision()); }
        if (v.getInyeccionCarburacion() != null ){comboEmicion.setValue(v.getInyeccionCarburacion()); }
        if (v.getColor() != null){ TfieldColor.setText(v.getColor()); }
        if (v.getPais() != null){ TfieldOrigen.setText(v.getPais()); }
        if (v.getTipoCombust() != null){TfieldCombustible.setText(v.getTipoCombust()); }
        if (v.getTraccion() != null){ TfieldTraccion.setText(v.getTraccion()); }
        if (v.getFrenoDelant() != null){TfieldFrenoDelantero.setText(v.getFrenoDelant()); }
        if (v.getFrenoTras() != null){  TfieldFrenoTracero.setText(v.getFrenoTras()); }
        if (v.getLlantas() != null){TfieldLlantas.setText(v.getLlantas()); }
        if (v.getAnioFabricacion() != null){TFieldFecha.setText(v.getAnioFabricacion()); }
        if (v.getCilindrada() != 0){TfieldCilindrada.setText(String.valueOf(v.getCilindrada())); }
        if (v.getRodado() != 0){TfieldRodado.setText(String.valueOf(v.getRodado())); }
        if (v.getCantValvulas() != 0){TfieldValvulas.setText(String.valueOf(v.getCantValvulas())); }
        if (v.getCaballoFuerza() != 0){TfieldCFuerza.setText(String.valueOf(v.getCaballoFuerza())); }
        if (v.getVelocMax() != 0){TfieldVelocidadMaxima.setText(String.valueOf(v.getVelocMax())); }
        if (v.getKilometraje() != 0){TFieldKilometro.setText(String.valueOf(v.getKilometraje()));}
        if (v.getListrosTanque() != 0){TfieldCapTanque.setText(String.valueOf(v.getListrosTanque()));}
        if (v.getAceleracionSegundos() != 0.0f){Tfield0100.setText(String.valueOf(v.getAceleracionSegundos()));}
        if (v.getConsumoCiudad() != 0.0f){TfieldConsumoCiudad.setText(String.valueOf(v.getConsumoCiudad())); }
        if (v.getConsumoCiudad() != 0.0f){TfieldConsumoRuta.setText(String.valueOf(v.getConsumoRuta())); }
        if (v.getLargo() != 0.0f){TfieldLargo.setText(String.valueOf(v.getLargo()));}
        if (v.getAncho() != 0.0f){TfieldAncho.setText(String.valueOf(v.getAncho()));}
        if (v.getAlto() != 0.0f){TfieldAlto.setText(String.valueOf(v.getAlto()));}
        if (v.getPrecioDolares() != 0.0f){TfieldPrecioDolares.setText(String.valueOf(v.getPrecioDolares()));}
        if (v.getPrecioPesos() != 0.0f){PrecioPesos.setText(String.valueOf(v.getPrecioPesos()));}

        if(v.getIdTipo() == 1 || v.getIdTipo() == 2 || v.getIdTipo() == 3){
            if (((CuatroRuedas) v).isAbs()){CheckABS.fire();}
            if (v.getTipo() != null){ EstiloAutoCombBox.setValue(v.getTipo()); }
            if (((CuatroRuedas) v).isCierreCentralizado()){CheckCierreCentra.fire();  }
            if (((CuatroRuedas) v).isAireAcondic()){CheckAireAcon.fire(); }
            if (((CuatroRuedas) v).isCristalesElectronicos()){ CheckCristElectico.fire(); }
            if (((CuatroRuedas) v).isBluetooth()){CheckBluetooth.fire();}
            if (((CuatroRuedas) v).isUsb()){ CheckUSB.fire();}
            if (((CuatroRuedas) v).isMp3()){ CheckMp3.fire();}
            if (((CuatroRuedas) v).isGps()){CheckGPS.fire();}
            if (((CuatroRuedas) v).isCamTras()){CheckCamTrasera.fire();}
            if (((CuatroRuedas) v).isVelocCrucero()){CheckVeloCruce.fire();}
            if (((CuatroRuedas) v).isTechoSolar()){CheckTecSolar.fire();}
            if (((CuatroRuedas) v).isAutobloqueoPuertas()){CheckBloqPuerta.fire();}
            if (((CuatroRuedas) v).getTipoDireccion() != null){TfieldDireccion.setText("N/A");}
            if (((CuatroRuedas) v).getCantPuertas() != 0){TfieldCantPuertas.setText(String.valueOf(((CuatroRuedas) v).getCantPuertas()));}
            EstiloAutoCombBox.setVisible(true);
            CheckAireAcon.setVisible(true);
            CheckCierreCentra.setVisible(true);
            CheckGPS.setVisible(true);
            CheckMp3.setVisible(true);
            CheckCamTrasera.setVisible(true);
            CheckVeloCruce.setVisible(true);
            CheckCristElectico.setVisible(true);
            CheckBloqPuerta.setVisible(true);
            CheckBluetooth.setVisible(true);
            CheckUSB.setVisible(true);
            CheckTecSolar.setVisible(true);
            CheckTableroElect.setVisible(false);
            CheckBaul.setVisible(false);
            CheckPatada.setVisible(false);
            CheckEncendElectrico.setVisible(false);
            EstiloMotoCombBox.setVisible(false);
        }else {
            if (((Moto) v).isTipoTablero()){ CheckTableroElect.fire(); }
            if (v.getTipo() != null){ EstiloMotoCombBox.setValue(v.getTipo()); }
            if (((Moto) v).isBaul()){ CheckBaul.fire();}
            if (((Moto) v).isPatada()){ CheckPatada.fire(); }
            if (((Moto) v).isEncendidoElectrico()){ CheckEncendElectrico.fire(); }
            EstiloMotoCombBox.setVisible(true);
            CheckTableroElect.setVisible(true);
            CheckBaul.setVisible(true);
            CheckPatada.setVisible(true);
            CheckEncendElectrico.setVisible(true);
            EstiloAutoCombBox.setVisible(false);
            CheckAireAcon.setVisible(false);
            CheckCierreCentra.setVisible(false);
            CheckGPS.setVisible(false);
            CheckMp3.setVisible(false);
            CheckCamTrasera.setVisible(false);
            CheckVeloCruce.setVisible(false);
            CheckCristElectico.setVisible(false);
            CheckBloqPuerta.setVisible(false);
            CheckBluetooth.setVisible(false);
            CheckUSB.setVisible(false);
            CheckTecSolar.setVisible(false);
        }
    }
    public void SetVisibleKilometro(){
        if(CheckUsado.isSelected()){
            TFieldKilometro.setVisible(true);
        }else{
            TFieldKilometro.setVisible(false);
        }

    }
    public void SetearVisibles(){
        TextConfort.setVisible(true);
        if(TipoVehiCombBox.getValue().equals("Auto") || TipoVehiCombBox.getValue().equals("Camioneta") || TipoVehiCombBox.getValue().equals("Camion")){
            EstiloAutoCombBox.setVisible(true);
            CheckAireAcon.setVisible(true);
            CheckCierreCentra.setVisible(true);
            CheckGPS.setVisible(true);
            CheckMp3.setVisible(true);
            CheckCamTrasera.setVisible(true);
            CheckVeloCruce.setVisible(true);
            CheckCristElectico.setVisible(true);
            CheckBloqPuerta.setVisible(true);
            CheckBluetooth.setVisible(true);
            CheckUSB.setVisible(true);
            CheckTecSolar.setVisible(true);
            CheckTableroElect.setVisible(false);
            CheckBaul.setVisible(false);
            CheckPatada.setVisible(false);
            CheckEncendElectrico.setVisible(false);
            EstiloMotoCombBox.setVisible(false);
        }else if(TipoVehiCombBox.getValue().equals("Moto")){
            EstiloMotoCombBox.setVisible(true);
            CheckTableroElect.setVisible(true);
            CheckBaul.setVisible(true);
            CheckPatada.setVisible(true);
            CheckEncendElectrico.setVisible(true);
            EstiloAutoCombBox.setVisible(false);
            CheckAireAcon.setVisible(false);
            CheckCierreCentra.setVisible(false);
            CheckGPS.setVisible(false);
            CheckMp3.setVisible(false);
            CheckCamTrasera.setVisible(false);
            CheckVeloCruce.setVisible(false);
            CheckCristElectico.setVisible(false);
            CheckBloqPuerta.setVisible(false);
            CheckBluetooth.setVisible(false);
            CheckUSB.setVisible(false);
            CheckTecSolar.setVisible(false);
        }
    }

    public void SetearAtributosVehiculos(Vehiculo v){
        v.setAnioFabricacion(TFieldFecha.getText());
        if(!TfieldColor.getText().isEmpty()){v.setColor(TfieldColor.getText());}
        if(!TfieldOrigen.getText().isEmpty()){v.setPais(TfieldOrigen.getText());}
        if(!TfieldCombustible.getText().isEmpty()){v.setTipoCombust(TfieldCombustible.getText());}
        if(!TfieldTraccion.getText().isEmpty()){v.setTraccion(TfieldTraccion.getText());}
        if(!TfieldFrenoDelantero.getText().isEmpty()){v.setFrenoDelant(TfieldFrenoDelantero.getText());}
        if(!TfieldFrenoTracero.getText().isEmpty()){v.setFrenoTras(TfieldFrenoTracero.getText());}
        if(!TfieldLlantas.getText().isEmpty()){v.setLlantas(TfieldLlantas.getText());}
        if(!TfieldCilindrada.getText().isEmpty()){v.setCilindrada(Integer.parseInt(TfieldCilindrada.getText()));}
        if(!TfieldRodado.getText().isEmpty()){v.setRodado(Integer.parseInt(TfieldRodado.getText()));}
        if(!TfieldValvulas.getText().isEmpty()){v.setCantValvulas(Integer.parseInt(TfieldValvulas.getText()));}
        if(!TfieldCFuerza.getText().isEmpty()){v.setCaballoFuerza(Integer.parseInt(TfieldCFuerza.getText()));}
        if(!Tfield0100.getText().isEmpty()){v.setAceleracionSegundos(Integer.parseInt( Tfield0100.getText()));}
        if(!TfieldVelocidadMaxima.getText().isEmpty()){v.setVelocMax(Integer.parseInt(TfieldVelocidadMaxima.getText()));}
        if(!TfieldCapTanque.getText().isEmpty()){v.setListrosTanque(Integer.parseInt(TfieldCapTanque.getText()));}
        if(!TfieldConsumoCiudad.getText().isEmpty()){v.setConsumoCiudad(Integer.parseInt(TfieldConsumoCiudad.getText()));}
        if(!TfieldConsumoRuta.getText().isEmpty()){v.setConsumoRuta(Integer.parseInt(TfieldConsumoRuta.getText()));}
        if(!TfieldLargo.getText().isEmpty()){v.setLargo(Integer.parseInt(TfieldLargo.getText()));}
        if(!TfieldAncho.getText().isEmpty()){v.setAncho(Integer.parseInt(TfieldAncho.getText()));}
        if(!TfieldAlto.getText().isEmpty()){v.setAlto(Integer.parseInt(TfieldAlto.getText()));}
        if(!TfieldPrecioDolares.getText().isEmpty()){v.setPrecioDolares(Float.parseFloat(TfieldPrecioDolares.getText()));}
        if(!PrecioPesos.getText().isEmpty()){v.setPrecioPesos(Float.parseFloat(PrecioPesos.getText()));}
        v.setTansmision(comboTransmi.getValue());
        v.setTansmision(EstiloMotoCombBox.getValue());
        v.setTansmision(EstiloAutoCombBox.getValue());
        v.setTansmision(comboEmicion.getValue());
    }

    public void SetearAtributosCuatroRuedas(CuatroRuedas v){
        if(!TfieldDireccion.getText().isEmpty()){v.setTipoDireccion(TfieldDireccion.getText());}
        if(!TfieldCantPuertas.getText().isEmpty()){v.setCantPuertas(Integer.parseInt(TfieldCantPuertas.getText()));}
        if(CheckAireAcon.isSelected()){v.setAireAcondic(true);}
        if(CheckCierreCentra.isSelected()){v.setCierreCentralizado(true);}
        if(CheckGPS.isSelected()){v.setGps(true);}
        if(CheckMp3.isSelected()){v.setMp3(true);}
        if(CheckCamTrasera.isSelected()){v.setCamTras(true);}
        if(CheckVeloCruce.isSelected()){v.setVelocCrucero(true);}
        if(CheckCristElectico.isSelected()){v.setCristalesElectronicos(true);}
        if(CheckBloqPuerta.isSelected()){v.setAutobloqueoPuertas(true);}
        if(CheckBluetooth.isSelected()){v.setBluetooth(true);}
        if(CheckUSB.isSelected()){v.setUsb(true);}
        if(CheckTecSolar.isSelected()){v.setTechoSolar(true);}
        if(CheckABS.isSelected()){v.setAbs(true);}
    }
    public void setearAtributosMoto(Moto v){
        if(CheckTableroElect.isSelected()){v.setTipoTablero(true);}
        if(CheckBaul.isSelected()){v.setBaul(true);}
        if(CheckPatada.isSelected()){v.setPatada(true);}
        if(CheckEncendElectrico.isSelected()){v.setEncendidoElectrico(true);}
    }

    // Ivan
    public void ModifVehiculo(Vehiculo v){
        if(!TFieldMarca.getText().equals(v.getMarca()) || !TFieldModelo.getText().equals(v.getModelo()) || !TFieldFecha.getText().equals(v.getAnioFabricacion())
                || !TFieldNumMotor.getText().equals(v.getNumMotor()) || !TFieldNumChasis.getText().equals(v.getNumChasis()) ){
            MostrarAtributosModificacion();
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null,"No tiene autorizacion para realizar los siguientes cambios: \n MARCA \n MODELO \n Numero de motor \n Numero de chasis\n " +
                    "Los valores se resetearan por defecto");
        }else{
            if(CheckUsado.isSelected()){v.setUsados(true);}
            if (!TfieldColor.getText().equals(v.getColor())){v.setColor(TfieldColor.getText());}
            if (!TfieldCombustible.getText().equals(v.getTipoCombust())){v.setTipoCombust(TfieldCombustible.getText());}
            if (!TfieldTraccion.getText().equals(v.getTraccion())){v.setTraccion(TfieldTraccion.getText());}
            if (!TfieldFrenoDelantero.getText().equals(v.getFrenoDelant())){v.setFrenoDelant(TfieldFrenoDelantero.getText());}
            if (!TfieldFrenoTracero.getText().equals(v.getFrenoTras())){v.setFrenoTras(TfieldFrenoTracero.getText());}
            if (!TfieldLlantas.getText().equals(v.getLlantas())){v.setLlantas(TfieldLlantas.getText());}
           if(!TfieldCilindrada.getText().isEmpty()){
                if (Integer.parseInt(TfieldCilindrada.getText()) != v.getCilindrada()){v.setCilindrada(Integer.parseInt(TfieldCilindrada.getText()));}
           }
           if(!TfieldRodado.getText().isEmpty()){
               if (Integer.parseInt(TfieldRodado.getText()) != v.getRodado()){v.setRodado(Integer.parseInt(TfieldRodado.getText()));}
           }
            if(!TfieldValvulas.getText().isEmpty()){
                if (Integer.parseInt(TfieldValvulas.getText()) != v.getCantValvulas()){v.setCantValvulas(Integer.parseInt(TfieldValvulas.getText()));}
            }
            if(!TfieldCFuerza.getText().isEmpty()){
                if (Integer.parseInt(TfieldCFuerza.getText()) != v.getCaballoFuerza()){v.setCaballoFuerza(Integer.parseInt(TfieldCFuerza.getText()));}
            }
            if(!TfieldVelocidadMaxima.getText().isEmpty()){
                if (Integer.parseInt(TfieldVelocidadMaxima.getText()) != v.getVelocMax()){v.setVelocMax(Integer.parseInt(TfieldVelocidadMaxima.getText()));}
            }
            if(!TFieldKilometro.getText().isEmpty()){
                if (Integer.parseInt(TFieldKilometro.getText()) != v.getKilometraje()){v.setKilometraje(Integer.parseInt(TFieldKilometro.getText()));}
            }
            if(!TfieldCapTanque.getText().isEmpty()){
                if (Integer.parseInt(TfieldCapTanque.getText()) != v.getListrosTanque()){v.setListrosTanque(Integer.parseInt(TfieldCapTanque.getText()));}
            }
            if(!Tfield0100.getText().isEmpty()){
                if (Float.parseFloat(Tfield0100.getText()) != v.getAceleracionSegundos()){v.setAceleracionSegundos(Float.parseFloat(Tfield0100.getText()));}
            }
            if(!TfieldConsumoCiudad.getText().isEmpty()){
                if (Float.parseFloat(TfieldConsumoCiudad.getText()) != v.getConsumoCiudad()){v.setConsumoCiudad(Float.parseFloat(TfieldConsumoCiudad.getText()));}
            }
            if(!TfieldConsumoRuta.getText().isEmpty()){
                if (Float.parseFloat(TfieldConsumoRuta.getText()) != v.getConsumoRuta()){v.setConsumoRuta(Float.parseFloat(TfieldConsumoRuta.getText()));}
            }
            if(!TfieldLargo.getText().isEmpty()){
                if (Float.parseFloat(TfieldLargo.getText()) != v.getLargo()){v.setLargo(Float.parseFloat(TfieldLargo.getText()));}
            }
            if(!TfieldAncho.getText().isEmpty()){
                if (Float.parseFloat(TfieldAncho.getText()) != v.getAncho()){v.setAncho(Float.parseFloat(TfieldAncho.getText()));}
            }
            if(!TfieldAlto.getText().isEmpty()){
                if (Float.parseFloat(TfieldAlto.getText()) != v.getAlto()){v.setAlto(Float.parseFloat(TfieldAlto.getText()));}
            }
            if(!TfieldPrecioDolares.getText().isEmpty()){
                if (Float.parseFloat(TfieldPrecioDolares.getText()) != v.getPrecioDolares()){v.setPrecioDolares(Float.parseFloat(TfieldPrecioDolares.getText()));}
            }
            if(!PrecioPesos.getText().isEmpty()){
                if (Float.parseFloat(PrecioPesos.getText()) != v.getPrecioPesos()){v.setPrecioPesos(Float.parseFloat(PrecioPesos.getText()));}
            }
            v.setTansmision(comboTransmi.getValue());
            v.setInyeccionCarburacion(comboEmicion.getValue());
            if(v.getIdTipo() == 1 || v.getIdTipo() == 2 || v.getIdTipo() == 3){
                v.setTipoDeVehiculo(EstiloAutoCombBox.getValue());
                ModifCuatroRuedas((CuatroRuedas) v);
            }else{
                v.setTipoDeVehiculo(EstiloMotoCombBox.getValue());
                ModifMoto((Moto) v);
            }
            JOptionPane.showMessageDialog(null,"Cambios guardados exitosamente");
        }

    }

    public void ModifCuatroRuedas(CuatroRuedas v){
        if (CheckABS.isSelected() != v.isAbs()){v.setAbs(CheckABS.isSelected());}
        if (CheckCierreCentra.isSelected() != v.isCierreCentralizado()){v.setCierreCentralizado(CheckCierreCentra.isSelected());}
        if (CheckAireAcon.isSelected() != v.isAireAcondic()){v.setAireAcondic(CheckAireAcon.isSelected());}
        if (CheckCristElectico.isSelected() != v.isCristalesElectronicos()){v.setCristalesElectronicos(CheckCristElectico.isSelected());}
        if (CheckBluetooth.isSelected() != v.isBluetooth()){v.setBluetooth(CheckBluetooth.isSelected());}
        if (CheckUSB.isSelected() != v.isUsb()){v.setUsb(CheckUSB.isSelected());}
        if (CheckMp3.isSelected() != v.isMp3()){v.setMp3(CheckMp3.isSelected());}
        if (CheckGPS.isSelected() != v.isGps()){v.setGps(CheckGPS.isSelected());}
        if (CheckCamTrasera.isSelected() != v.isCamTras()){v.setCamTras(CheckCamTrasera.isSelected());}
        if (CheckVeloCruce.isSelected() != v.isVelocCrucero()){v.setVelocCrucero(CheckVeloCruce.isSelected());}
        if (CheckTecSolar.isSelected() != v.isTechoSolar()){v.setTechoSolar(CheckTecSolar.isSelected());}
        if (!TfieldDireccion.getText().equals(v.getTipoDireccion())){v.setTipoDireccion(TfieldDireccion.getText());}
       // if (!TipoVehiCombBox.getValue().equals(v.getTipoVehiculo())){v.setTipoVehiculo(TipoVehiCombBox.getValue());}
        if(!TfieldCantPuertas.getText().isEmpty()){
            if (Integer.parseInt(TfieldCantPuertas.getText()) != v.getCantPuertas()){v.setCantPuertas(Integer.parseInt(TfieldCantPuertas.getText()));}
        }
    }

    public void ModifMoto(Moto v){
        if (CheckTableroElect.isSelected() != v.isTipoTablero()){v.setTipoTablero(CheckTableroElect.isSelected()); }
        if (CheckBaul.isSelected() != v.isBaul()){v.setBaul(CheckBaul.isSelected());}
        if (CheckPatada.isSelected() != v.isPatada()){v.setPatada(CheckPatada.isSelected());}
        if (CheckEncendElectrico.isSelected() != v.isEncendidoElectrico()){v.setEncendidoElectrico(CheckEncendElectrico.isSelected());}
    }
    //Ivan

    public void AddAndWriteVehiculo(Vehiculo nuevoVehiculo,MouseEvent event) throws Exception{
        SetearAtributosVehiculos(nuevoVehiculo);
        BaseDatosListas.LeerId();
        nuevoVehiculo.setIdVehiculo(Contenedora.getIdContenedora());
        Contenedora.setIdContenedora(Contenedora.getIdContenedora()+1);
        BaseDatosListas.EscribirId();
        Contenedora.Alta.add(nuevoVehiculo);
        BaseDatosListas.EscribirArchAltas();
        JOptionPane.showMessageDialog(null,"Vehiculo  " + nuevoVehiculo.getModelo() + "  Guardado exitosamente");
        ((Node)(event.getSource())).getScene().getWindow().hide();
    }

    public void NuevoVehiculo(MouseEvent event) throws Exception{
        if(TFieldMarca.getText().isEmpty() || TFieldModelo.getText().isEmpty() || TFieldNumChasis.getText().isEmpty() || TFieldNumMotor.getText().isEmpty() || TFieldFecha.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"ERROR: Falta campos obligatorios");
        }else {
            if(CheckUsado.isSelected()){
                if(TFieldKilometro.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null,"ERROR: Falta campos obligatorios");
                }else {
                    if(TipoVehiCombBox.getValue().equals("Auto")){
                        CuatroRuedas nuevoVehiculo = new CuatroRuedas(true,TFieldMarca.getText(),TFieldModelo.getText(),TFieldNumMotor.getText(),TFieldNumChasis.getText(),1);
                        nuevoVehiculo.setKilometraje(Integer.parseInt(TFieldKilometro.getText()));
                        nuevoVehiculo.setTipoDeVehiculo("Auto");
                        SetearAtributosCuatroRuedas(nuevoVehiculo);
                        AddAndWriteVehiculo(nuevoVehiculo,event);
                    }else if(TipoVehiCombBox.getValue().equals("Camioneta")){
                        CuatroRuedas nuevoVehiculo = new CuatroRuedas(true,TFieldMarca.getText(),TFieldModelo.getText(),TFieldNumMotor.getText(),TFieldNumChasis.getText(),2);
                        nuevoVehiculo.setKilometraje(Integer.parseInt(TFieldKilometro.getText()));
                        nuevoVehiculo.setTipoDeVehiculo("Camioneta");
                        SetearAtributosCuatroRuedas(nuevoVehiculo);
                        AddAndWriteVehiculo(nuevoVehiculo,event);
                    }else if(TipoVehiCombBox.getValue().equals("Camion")){
                        CuatroRuedas nuevoVehiculo = new CuatroRuedas(true,TFieldMarca.getText(),TFieldModelo.getText(),TFieldNumMotor.getText(),TFieldNumChasis.getText(),3);
                        nuevoVehiculo.setKilometraje(Integer.parseInt(TFieldKilometro.getText()));
                        nuevoVehiculo.setTipoDeVehiculo("Camion");
                        SetearAtributosCuatroRuedas(nuevoVehiculo);
                        AddAndWriteVehiculo(nuevoVehiculo,event);
                    }else if(TipoVehiCombBox.getValue().equals("Moto")){
                        Moto nuevoVehiculo = new Moto(true,TFieldMarca.getText(),TFieldModelo.getText(),TFieldNumMotor.getText(),TFieldNumChasis.getText(),4);
                        nuevoVehiculo.setKilometraje(Integer.parseInt(TFieldKilometro.getText()));
                        nuevoVehiculo.setTipoDeVehiculo("Moto");
                        setearAtributosMoto(nuevoVehiculo);
                        AddAndWriteVehiculo(nuevoVehiculo,event);
                    }
                }
            }else{
                if(TipoVehiCombBox.getValue().equals("Auto")){
                    CuatroRuedas nuevoVehiculo = new CuatroRuedas(false,TFieldMarca.getText(),TFieldModelo.getText(),TFieldNumMotor.getText(),TFieldNumChasis.getText(),1);
                    nuevoVehiculo.setTipoDeVehiculo("Auto");
                    SetearAtributosCuatroRuedas(nuevoVehiculo);
                    AddAndWriteVehiculo(nuevoVehiculo,event);
                }else if(TipoVehiCombBox.getValue().equals("Camioneta")){
                    CuatroRuedas nuevoVehiculo = new CuatroRuedas(false,TFieldMarca.getText(),TFieldModelo.getText(),TFieldNumMotor.getText(),TFieldNumChasis.getText(),2);
                    nuevoVehiculo.setTipoDeVehiculo("Camioneta");
                    SetearAtributosCuatroRuedas(nuevoVehiculo);
                    AddAndWriteVehiculo(nuevoVehiculo,event);
                }else if(TipoVehiCombBox.getValue().equals("Camion")){
                    CuatroRuedas nuevoVehiculo = new CuatroRuedas(false,TFieldMarca.getText(),TFieldModelo.getText(),TFieldNumMotor.getText(),TFieldNumChasis.getText(),3);
                    nuevoVehiculo.setTipoDeVehiculo("Camion");
                    SetearAtributosCuatroRuedas(nuevoVehiculo);
                    AddAndWriteVehiculo(nuevoVehiculo,event);
                }else if(TipoVehiCombBox.getValue().equals("Moto")){
                    Moto nuevoVehiculo = new Moto(false,TFieldMarca.getText(),TFieldModelo.getText(),TFieldNumMotor.getText(),TFieldNumChasis.getText(),4);
                    nuevoVehiculo.setTipoDeVehiculo("Moto");
                    setearAtributosMoto(nuevoVehiculo);
                    AddAndWriteVehiculo(nuevoVehiculo,event);
                }
            }
        }
    }



    EventHandler<KeyEvent> handlerLetters = new EventHandler<KeyEvent>() {
        @Override
        public void handle(KeyEvent event) {
            if (willConsume) {
                event.consume();
            }
            if(!event.getText().matches("[0-9]") && event.getCode() != KeyCode.BACK_SPACE){
                if(event.getEventType() == KeyEvent.KEY_PRESSED){
                    willConsume = true;
                }else if(event.getEventType() == KeyEvent.KEY_RELEASED){
                    willConsume = false;
                }
            }
        }
    };
}
