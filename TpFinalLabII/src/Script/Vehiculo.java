package Script;

import java.io.Serializable;
import java.util.Date;

public abstract class Vehiculo implements Serializable {
    private boolean estado;
    private boolean usados;
    private boolean alarma;
    private boolean importado;
    private String tipoDeVehiculo;
    private String tansmision;
    private String inyeccionCarburacion;
    private String marca;
    private String modelo;
    private String numMotor;
    private String numChasis;
    private String color;
    private String pais;
    private String tipoCombust;
    private String traccion;
    private String frenoDelant;
    private String frenoTras;
    private String llantas;
    private String tipo; //saber si es miniband o que
    private String anioFabricacion;
    private Date fechaAlta;
    private int cilindrada;
    private int rodado;
    private int cantValvulas;
    private int caballoFuerza;
    private int velocMax;
    private int kilometraje;
    private int listrosTanque;
    private int idTipo; //saber si es auto o moto etc
    private int idVehiculo;
    private float aceleracionSegundos;
    private float consumoCiudad;
    private float consumoRuta;
    private float largo;
    private float ancho;
    private float alto;
    private float precioDolares;
    private float precioPesos;

    protected void AltaBaja(){
        estado = !estado;
    }

    public Vehiculo() {
    }

    public Vehiculo(boolean usados, String marca, String modelo, String numMotor, String numChasis, int idTipo ) {
        this.usados = usados;
        this.marca = marca;
        this.modelo = modelo;
        this.numMotor = numMotor;
        this.numChasis = numChasis;
        this.idTipo = idTipo;
        estado = true;
        if(idTipo == 1){
            tipoDeVehiculo = "AUTO";
        }else if(idTipo == 2){
            tipoDeVehiculo = "CAMIONETA";
        }else if(idTipo == 3){
            tipoDeVehiculo = "CAMION";
        }else if(idTipo == 4){
            tipoDeVehiculo = "MOTO";
        }
        if(!usados){
            kilometraje = 0;
        }
    }

    public String getTipoDeVehiculo() {
        return tipoDeVehiculo;
    }

    public void setTipoDeVehiculo(String tipoDeVehiculo) {
        this.tipoDeVehiculo = tipoDeVehiculo;
    }

    public String getTansmision() {
        return tansmision;
    }

    public String getInyeccionCarburacion() {
        return inyeccionCarburacion;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public boolean isUsados() {
        return usados;
    }

    public void setUsados(boolean usados) {
        this.usados = usados;
    }

    public boolean isAlarma() {
        return alarma;
    }

    public void setAlarma(boolean alarma) {
        this.alarma = alarma;
    }

    public boolean isImportado() {
        return importado;
    }

    public void setImportado(boolean importado) {
        this.importado = importado;
    }

    public String isTansmision() {
        return tansmision;
    }

    public void setTansmision(String tansmision) {
        this.tansmision = tansmision;
    }

    public String isInyeccionCarburacion() {
        return inyeccionCarburacion;
    }

    public void setInyeccionCarburacion(String inyeccionCarburacion) {
        this.inyeccionCarburacion = inyeccionCarburacion;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getNumMotor() {
        return numMotor;
    }

    public void setNumMotor(String numMotor) {
        this.numMotor = numMotor;
    }

    public String getNumChasis() {
        return numChasis;
    }

    public void setNumChasis(String numChasis) {
        this.numChasis = numChasis;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getTipoCombust() {
        return tipoCombust;
    }

    public void setTipoCombust(String tipoCombust) {
        this.tipoCombust = tipoCombust;
    }

    public String getTraccion() {
        return traccion;
    }

    public void setTraccion(String traccion) {
        this.traccion = traccion;
    }

    public String getFrenoDelant() {
        return frenoDelant;
    }

    public void setFrenoDelant(String frenoDelant) {
        this.frenoDelant = frenoDelant;
    }

    public String getFrenoTras() {
        return frenoTras;
    }

    public void setFrenoTras(String frenoTras) {
        this.frenoTras = frenoTras;
    }

    public String getLlantas() {
        return llantas;
    }

    public void setLlantas(String llantas) {
        this.llantas = llantas;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(String anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public int getRodado() {
        return rodado;
    }

    public void setRodado(int rodado) {
        this.rodado = rodado;
    }

    public int getCantValvulas() {
        return cantValvulas;
    }

    public void setCantValvulas(int cantValvulas) {
        this.cantValvulas = cantValvulas;
    }

    public int getCaballoFuerza() {
        return caballoFuerza;
    }

    public void setCaballoFuerza(int caballoFuerza) {
        this.caballoFuerza = caballoFuerza;
    }

    public int getVelocMax() {
        return velocMax;
    }

    public void setVelocMax(int velocMax) {
        this.velocMax = velocMax;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

    public int getListrosTanque() {
        return listrosTanque;
    }

    public void setListrosTanque(int listrosTanque) {
        this.listrosTanque = listrosTanque;
    }

    public int getIdTipo() {
        return idTipo;
    }

    public void setIdTipo(int idTipo) {
        this.idTipo = idTipo;
    }

    public int getIdVehiculo() {
        return idVehiculo;
    }

    public void setIdVehiculo(int idVehiculo) {
        this.idVehiculo = idVehiculo;
    }

    public float getAceleracionSegundos() {
        return aceleracionSegundos;
    }

    public void setAceleracionSegundos(float aceleracionSegundos) {
        this.aceleracionSegundos = aceleracionSegundos;
    }

    public float getConsumoCiudad() {
        return consumoCiudad;
    }

    public void setConsumoCiudad(float consumoCiudad) {
        this.consumoCiudad = consumoCiudad;
    }

    public float getConsumoRuta() {
        return consumoRuta;
    }

    public void setConsumoRuta(float consumoRuta) {
        this.consumoRuta = consumoRuta;
    }

    public float getLargo() {
        return largo;
    }

    public void setLargo(float largo) {
        this.largo = largo;
    }

    public float getAncho() {
        return ancho;
    }

    public void setAncho(float ancho) {
        this.ancho = ancho;
    }

    public float getAlto() {
        return alto;
    }

    public void setAlto(float alto) {
        this.alto = alto;
    }

    public float getPrecioDolares() {
        return precioDolares;
    }

    public void setPrecioDolares(float precioDolares) {
        this.precioDolares = precioDolares;
    }

    public float getPrecioPesos() {
        return precioPesos;
    }

    public void setPrecioPesos(float precioPesos) {
        this.precioPesos = precioPesos;
    }

}

