package sample;

import Script.Contenedora;
import Script.CuatroRuedas;
import Script.Moto;
import Script.Vehiculo;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

public class ControllerVistaVehiculo implements Initializable {
    //Vehiculo
    @FXML private Text usadoV;
    @FXML private Text tipoDeVehiculoV;
    @FXML private Text tansmisionV;
    @FXML private Text inyecCarburV;
    @FXML private Text marcaV;
    @FXML private Text modeloV;
    @FXML private Text numMotorV;
    @FXML private Text numChasisV;
    @FXML private Text colorV;
    @FXML private Text paisV;
    @FXML private Text tipoCombustV;
    @FXML private Text traccionV;
    @FXML private Text frenoDelantV;
    @FXML private Text frenoTrasV;
    @FXML private Text llantasV;
    @FXML private Text tipoV;
    @FXML private Text anioFabricacionV;
    @FXML private Text cilindradaV;
    @FXML private Text rodadoV;
    @FXML private Text cantValvulasV;
    @FXML private Text caballoFuerzaV;
    @FXML private Text velocMaxV;
    @FXML private Text kilometrajeV;
    @FXML private Text listrosTanqueV;
    @FXML private Text aceleracionSegundosV;
    @FXML private Text consumoCiudadV;
    @FXML private Text consumoRutaV;
    @FXML private Text largoV;
    @FXML private Text anchoV;
    @FXML private Text altoV;
    @FXML private Text precioDolaresV;
    @FXML private Text precioPesosV;
    //CuatroRuedas
    @FXML private Text absV;
    @FXML private Text cierreCentralizadoV;
    @FXML private Text aireAcondicV;
    @FXML private Text cristalesElectronicosV;
    @FXML private Text bluetoothV;
    @FXML private Text usbV;
    @FXML private Text mp3V;
    @FXML private Text gpsV;
    @FXML private Text camTrasV;
    @FXML private Text velocCruceroV;
    @FXML private Text techoSolarV;
    @FXML private Text autobloqueoPuertasV;
    @FXML private Text cajaAutomaticaV;
    @FXML private Text tipoDireccionV;
    @FXML private Text cantPuertasV;
    //Moto
    @FXML private Text tipoTableroV;
    @FXML private Text baulV;
    @FXML private Text embragueAutomV;
    @FXML private Text patadaV;
    @FXML private Text encendidoElectricoV;
    //Para que aparezcan o no los atributo en ficha tecnica dependiendo del vehiculo
    //CuatroRuedas
    @FXML private Text absText;
    @FXML private Text cierreCentralizadoText;
    @FXML private Text aireAcondicText;
    @FXML private Text cristalesElectronicosText;
    @FXML private Text bluetoothText;
    @FXML private Text usbText;
    @FXML private Text mp3Text;
    @FXML private Text gpsText;
    @FXML private Text camTrasText;
    @FXML private Text velocCruceroText;
    @FXML private Text techoSolarText;
    @FXML private Text autobloqueoPuertasText;
    @FXML private Text cajaAutomaticaText;
    @FXML private Text tipoDireccionText;
    @FXML private Text cantPuertasText;
    //Moto
    @FXML private Text tipoTableroText;
    @FXML private Text baulText;
    @FXML private Text embragueAutomText;
    @FXML private Text patadaText;
    @FXML private Text encendidoElectricoText;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        SetTextos(Contenedora.vehiculoBusquedas);
        if (Contenedora.vehiculoBusquedas.getIdTipo() == 4){ //Moto
            //Text
            absText.setVisible(false);
            cierreCentralizadoText.setVisible(false);
            aireAcondicText.setVisible(false);
            cristalesElectronicosText.setVisible(false);
            bluetoothText.setVisible(false);
            usbText.setVisible(false);
            mp3Text.setVisible(false);
            gpsText.setVisible(false);
            camTrasText.setVisible(false);
            velocCruceroText.setVisible(false);
            techoSolarText.setVisible(false);
            autobloqueoPuertasText.setVisible(false);
            cajaAutomaticaText.setVisible(false);
            tipoDireccionText.setVisible(false);
            cantPuertasText.setVisible(false);
            //V
            absV.setVisible(false);
            cierreCentralizadoV.setVisible(false);
            aireAcondicV.setVisible(false);
            cristalesElectronicosV.setVisible(false);
            bluetoothV.setVisible(false);
            usbV.setVisible(false);
            mp3V.setVisible(false);
            gpsV.setVisible(false);
            camTrasV.setVisible(false);
            velocCruceroV.setVisible(false);
            techoSolarV.setVisible(false);
            autobloqueoPuertasV.setVisible(false);
            cajaAutomaticaV.setVisible(false);
            tipoDireccionV.setVisible(false);
            cantPuertasV.setVisible(false);
        }else{//auto,camioneta,camion
            //Text
            tipoTableroText.setVisible(false);
            baulText.setVisible(false);
            embragueAutomText.setVisible(false);
            patadaText.setVisible(false);
            encendidoElectricoText.setVisible(false);
            //V
            tipoTableroV.setVisible(false);
            baulV.setVisible(false);
            embragueAutomV.setVisible(false);
            patadaV.setVisible(false);
            encendidoElectricoV.setVisible(false);
        }
    }

    /**
     * Metodo para cargar los atributos de las clases Vehiculo, CuatroRuedas y Moto
     * a la ventana que muestra un vehiculo especifico con todos sus atributos
     * @param v
     */
    public void SetTextos(Vehiculo v){
        if (v.isUsados()){
            usadoV.setText("Si");
        }else{
            usadoV.setText("No");
        }
        marcaV.setText(v.getMarca());
        modeloV.setText(v.getModelo());
        numChasisV.setText(v.getNumChasis());
        numMotorV.setText(v.getNumMotor());

     /*   if (v.getTipoDeVehiculo() == null){
            tipoDeVehiculoV.setText("N/A");
        }else{
            tipoDeVehiculoV.setText(v.getTipoDeVehiculo());
        }*/
        if (v.getTansmision() == null){
            tansmisionV.setText("N/A");
        }else{
            tansmisionV.setText(v.getTansmision());
        }
        if (v.getInyeccionCarburacion() == null ){
            inyecCarburV.setText("N/A");
        }else{
            inyecCarburV.setText(v.getInyeccionCarburacion());
        }
        if (v.getColor() == null){
            colorV.setText("N/A");
        }else{
            colorV.setText(v.getColor());
        }
        if (v.getPais() == null){
            paisV.setText("N/A");
        }else{
            paisV.setText(v.getPais());
        }
        if (v.getTipoCombust() == null){
            tipoCombustV.setText("N/A");
        }else{
            tipoCombustV.setText(v.getTipoCombust());
        }
        if (v.getTraccion() == null){
            traccionV.setText("N/A");
        }else{
            traccionV.setText(v.getTraccion());
        }
        if (v.getFrenoDelant() == null){
            frenoDelantV.setText("N/A");
        }else{
            frenoDelantV.setText(v.getFrenoDelant());
        }
        if (v.getFrenoTras() == null){
            frenoTrasV.setText("N/A");
        }else{
            frenoTrasV.setText(v.getFrenoTras());
        }
        if (v.getLlantas() == null){
            llantasV.setText("N/A");
        }else{
            llantasV.setText(v.getLlantas());
        }
        if (v.getTipo() == null){
            tipoV.setText("N/A");
        }else{
            tipoV.setText(v.getTipo());
        }
        if (v.getAnioFabricacion() == null){
            anioFabricacionV.setText("N/A");
        }else{
            anioFabricacionV.setText(v.getAnioFabricacion());
        }
        if (v.getCilindrada() == 0){
            cilindradaV.setText("N/A");
        }else{
            cilindradaV.setText(String.valueOf(v.getCilindrada()));
        }
        if (v.getRodado() == 0){
            rodadoV.setText("N/A");
        }else{
            rodadoV.setText(String.valueOf(v.getRodado()));
        }
        if (v.getCantValvulas() == 0){
            cantValvulasV.setText("N/A");
        }else{
            cantValvulasV.setText(String.valueOf(v.getCantValvulas()));
        }
        if (v.getCaballoFuerza() == 0){
            caballoFuerzaV.setText("N/A");
        }else{
            caballoFuerzaV.setText(String.valueOf(v.getCaballoFuerza()));
        }
        if (v.getVelocMax() == 0){
            velocMaxV.setText("N/A");
        }else{
            velocMaxV.setText(String.valueOf(v.getVelocMax()));
        }
        if (v.getKilometraje() == 0){
            kilometrajeV.setText("N/A");
        }else{
            kilometrajeV.setText(String.valueOf(v.getKilometraje()));
        }
        if (v.getListrosTanque() == 0){
            listrosTanqueV.setText("N/A");
        }else{
            listrosTanqueV.setText(String.valueOf(v.getListrosTanque()));
        }
        if (v.getAceleracionSegundos() == 0.0f){
            aceleracionSegundosV.setText("N/A");
        }else{
            aceleracionSegundosV.setText(String.valueOf(v.getAceleracionSegundos()));
        }
        if (v.getConsumoCiudad() == 0.0f){
            consumoCiudadV.setText("N/A");
        }else{
            consumoCiudadV.setText(String.valueOf(v.getConsumoCiudad()));
        }
        if (v.getConsumoRuta() == 0.0f){
            consumoRutaV.setText("N/A");
        }else{
            consumoRutaV.setText(String.valueOf(v.getConsumoRuta()));
        }
        if (v.getLargo() == 0.0f){
            largoV.setText("N/A");
        }else{
            largoV.setText(String.valueOf(v.getLargo()));
        }
        if (v.getAncho() == 0.0f){
            anchoV.setText("N/A");
        }else{
            anchoV.setText(String.valueOf(v.getAncho()));
        }
        if (v.getAlto() == 0.0f){
            altoV.setText("N/A");
        }else{
            altoV.setText(String.valueOf(v.getAlto()));
        }
        if (v.getPrecioDolares() == 0.0f){
            precioDolaresV.setText("N/A");
        }else{
            precioDolaresV.setText(String.valueOf(v.getPrecioDolares()));
        }
        if (v.getPrecioPesos() == 0.0f){
            precioPesosV.setText("N/A");
        }else{
            precioPesosV.setText(String.valueOf(v.getPrecioPesos()));
        }

        //CuatroRuedas
        if (v.getIdTipo() == 1 || v.getIdTipo() == 2 || v.getIdTipo() == 3){
            if (((CuatroRuedas) v).isAbs()){
                absV.setText("Si");
            }else{
                absV.setText("No");
            }
            if (((CuatroRuedas) v).isCierreCentralizado()){
                cierreCentralizadoV.setText("Si");
            }else{
                cierreCentralizadoV.setText("No");
            }
            if (((CuatroRuedas) v).isAireAcondic()){
                aireAcondicV.setText("Si");
            }else{
                aireAcondicV.setText("No");
            }
            if (((CuatroRuedas) v).isCristalesElectronicos()){
                cristalesElectronicosV.setText("Si");
            }else{
                cristalesElectronicosV.setText("No");
            }
            if (((CuatroRuedas) v).isBluetooth()){
                bluetoothV.setText("Si");
            }else{
                bluetoothV.setText("No");
            }
            if (((CuatroRuedas) v).isUsb()){
                usbV.setText("Si");
            }else{
                usbV.setText("No");
            }
            if (((CuatroRuedas) v).isMp3()){
                mp3V.setText("Si");
            }else{
                mp3V.setText("No");
            }
            if (((CuatroRuedas) v).isGps()){
                gpsV.setText("Si");
            }else{
                gpsV.setText("No");
            }
            if (((CuatroRuedas) v).isCamTras()){
                camTrasV.setText("Si");
            }else{
                camTrasV.setText("No");
            }
            if (((CuatroRuedas) v).isVelocCrucero()){
                velocCruceroV.setText("Si");
            }else{
                velocCruceroV.setText("No");
            }
            if (((CuatroRuedas) v).isTechoSolar()){
                techoSolarV.setText("Si");
            }else{
                techoSolarV.setText("No");
            }
            if (((CuatroRuedas) v).isAutobloqueoPuertas()){
                autobloqueoPuertasV.setText("Si");
            }else{
                autobloqueoPuertasV.setText("No");
            }
            if (((CuatroRuedas) v).isCajaAutomatica()){
                cajaAutomaticaV.setText("Si");
            }else{
                cajaAutomaticaV.setText("No");
            }
            if (((CuatroRuedas) v).getTipoDireccion() == null){
                tipoDireccionV.setText("N/A");
            }else{
                tipoDireccionV.setText(((CuatroRuedas) v).getTipoDireccion());
            }
            if (((CuatroRuedas) v).getCantPuertas() == 0){
                cantPuertasV.setText("N/A");
            }
            else{
                cantPuertasV.setText(String.valueOf(((CuatroRuedas) v).getCantPuertas()));
            }
        }else{ //Moto
            if (((Moto) v).isTipoTablero()){
                tipoTableroV.setText("Electrónico");
            }else{
                tipoTableroV.setText("Analógico");
            }
            if (((Moto) v).isBaul()){
                baulV.setText("Si");
            }else{
                baulV.setText("No");
            }
            if (((Moto) v).isEmbragueAutom()){
                embragueAutomV.setText("Si");
            }else{
                embragueAutomV.setText("No");
            }
            if (((Moto) v).isPatada()){
                patadaV.setText("Si");
            }else{
                patadaV.setText("No");
            }
            if (((Moto) v).isEncendidoElectrico()){
                encendidoElectricoV.setText("Si");
            }else{
                encendidoElectricoV.setText("No");
            }
        }
    }
}