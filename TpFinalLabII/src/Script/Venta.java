package Script;

import java.io.Serializable;
import java.util.*;

public class Venta implements Serializable {

    private Vehiculo vehiVenta;
    private String fechaBaja;
    private String garantia;
    private String modoPago;
    private String nombreComprador;
    private String apellidoComprador;
    private String dniComprador;
    private String direccComprador;
    private String mailComprador;
    private String telComprador;
    private float precioVenta;

    public Venta(Vehiculo vehiVenta, String fechaBaja, String garantia, String modoPago, String nombreComprador, String apellidoComprador, String dniComprador, String direccComprador, String mailComprador, String telComprador, float precioVenta) {
        this.vehiVenta = vehiVenta;
        this.fechaBaja = fechaBaja;
        this.garantia = garantia;
        this.modoPago = modoPago;
        this.nombreComprador = nombreComprador;
        this.apellidoComprador = apellidoComprador;
        this.dniComprador = dniComprador;
        this.direccComprador = direccComprador;
        this.mailComprador = mailComprador;
        this.telComprador = telComprador;
        this.precioVenta = precioVenta;
    }

    public Venta(Vehiculo vehiVenta, String fechaBaja, String garantia, String modoPago, String nombreComprador, String apellidoComprador, String dniComprador, String direccComprador, String telComprador, float precioVenta) {
        this.vehiVenta = vehiVenta;
        this.fechaBaja = fechaBaja;
        this.garantia = garantia;
        this.modoPago = modoPago;
        this.nombreComprador = nombreComprador;
        this.apellidoComprador = apellidoComprador;
        this.dniComprador = dniComprador;
        this.direccComprador = direccComprador;
        this.telComprador = telComprador;
        this.precioVenta = precioVenta;
    }

    public Vehiculo getVehiVenta() {
        return vehiVenta;
    }

    public String getFechaBaja() {
        return fechaBaja;
    }

    public String getGarantia() {
        return garantia;
    }

    public String getModoPago() {
        return modoPago;
    }

    public String getNombreComprador() {
        return nombreComprador;
    }

    public String getApellidoComprador() {
        return apellidoComprador;
    }

    public String getDniComprador() {
        return dniComprador;
    }

    public String getDireccComprador() {
        return direccComprador;
    }

    public String getMailComprador() {
        return mailComprador;
    }

    public String getTelComprador() {
        return telComprador;
    }

    public float getPrecioVenta() {
        return precioVenta;
    }
}
