package Script;

import java.io.Serializable;

public class CuatroRuedas extends Vehiculo {


    private boolean abs;
    private boolean cierreCentralizado;
    private boolean aireAcondic;
    private boolean cristalesElectronicos;
    private boolean bluetooth;
    private boolean usb;
    private boolean mp3;
    private boolean gps;
    private boolean camTras;
    private boolean velocCrucero;
    private boolean techoSolar;
    private boolean autobloqueoPuertas;
    private boolean cajaAutomatica;
    private String tipoDireccion;
    private String tipoVehiculo;
    private int cantPuertas;

    public CuatroRuedas(boolean usados, String marca, String modelo, String numMotor, String numChasis, int idTipo) {
        super(usados, marca, modelo, numMotor, numChasis, idTipo);
    }

    @Override
    protected void AltaBaja() {
        super.AltaBaja();
    }

    public boolean isAbs() {
        return abs;
    }

    public void setAbs(boolean abs) {
        this.abs = abs;
    }

    public boolean isCierreCentralizado() {
        return cierreCentralizado;
    }

    public void setCierreCentralizado(boolean cierreCentralizado) {
        this.cierreCentralizado = cierreCentralizado;
    }

    public boolean isAireAcondic() {
        return aireAcondic;
    }

    public void setAireAcondic(boolean aireAcondic) {
        this.aireAcondic = aireAcondic;
    }

    public boolean isCristalesElectronicos() {
        return cristalesElectronicos;
    }

    public void setCristalesElectronicos(boolean cristalesElectronicos) {
        this.cristalesElectronicos = cristalesElectronicos;
    }

    public boolean isBluetooth() {
        return bluetooth;
    }

    public void setBluetooth(boolean bluetooth) {
        this.bluetooth = bluetooth;
    }

    public boolean isUsb() {
        return usb;
    }

    public void setUsb(boolean usb) {
        this.usb = usb;
    }

    public boolean isMp3() {
        return mp3;
    }

    public void setMp3(boolean mp3) {
        this.mp3 = mp3;
    }

    public boolean isGps() {
        return gps;
    }

    public void setGps(boolean gps) {
        this.gps = gps;
    }

    public boolean isCamTras() {
        return camTras;
    }

    public void setCamTras(boolean camTras) {
        this.camTras = camTras;
    }

    public boolean isVelocCrucero() {
        return velocCrucero;
    }

    public void setVelocCrucero(boolean velocCrucero) {
        this.velocCrucero = velocCrucero;
    }

    public boolean isTechoSolar() {
        return techoSolar;
    }

    public void setTechoSolar(boolean techoSolar) {
        this.techoSolar = techoSolar;
    }

    public boolean isAutobloqueoPuertas() {
        return autobloqueoPuertas;
    }

    public void setAutobloqueoPuertas(boolean autobloqueoPuertas) {
        this.autobloqueoPuertas = autobloqueoPuertas;
    }

    public boolean isCajaAutomatica() {
        return cajaAutomatica;
    }

    public void setCajaAutomatica(boolean cajaAutomatica) {
        this.cajaAutomatica = cajaAutomatica;
    }

    public String getTipoDireccion() {
        return tipoDireccion;
    }

    public void setTipoDireccion(String tipoDireccion) {
        this.tipoDireccion = tipoDireccion;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public int getCantPuertas() {
        return cantPuertas;
    }

    public void setCantPuertas(int cantPuertas) {
        this.cantPuertas = cantPuertas;
    }
}
