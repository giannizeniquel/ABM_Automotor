package Script;

import java.io.Serializable;
import java.util.Date;

public class CompraUsados implements Serializable {

    private Vehiculo vehiCompra;
    private String fechaCompra;
    private String modoPago;
    private String nombreVendedor;
    private String apellidoVendedor;
    private String dniVendedor;
    private String direccVendedor;
    private String mailVendedor;
    private String telVendedor;
    private float precioCompra;

    public CompraUsados(Vehiculo vehiCompra, String fechaCompra, String modoPago, String nombreVendedor, String apellidoVendedor, String dniVendedor, String direccVendedor, String mailVendedor, String telVendedor,float precioCompra) {
        this.vehiCompra = vehiCompra;
        this.fechaCompra = fechaCompra;
        this.modoPago = modoPago;
        this.nombreVendedor = nombreVendedor;
        this.apellidoVendedor = apellidoVendedor;
        this.dniVendedor = dniVendedor;
        this.direccVendedor = direccVendedor;
        this.mailVendedor = mailVendedor;
        this.telVendedor = telVendedor;
        this.precioCompra = precioCompra;
    }

    public CompraUsados(Vehiculo vehiCompra, String fechaCompra, String modoPago, String nombreVendedor, String apellidoVendedor, String dniVendedor, String direccVendedor, String telVendedor, float precioCompra) {
        this.vehiCompra = vehiCompra;
        this.fechaCompra = fechaCompra;
        this.modoPago = modoPago;
        this.nombreVendedor = nombreVendedor;
        this.apellidoVendedor = apellidoVendedor;
        this.dniVendedor = dniVendedor;
        this.direccVendedor = direccVendedor;
        this.telVendedor = telVendedor;
        this.precioCompra = precioCompra;
    }

    public float getPrecioCompra() {
        return precioCompra;
    }

    public Vehiculo getVehiCompra() {
        return vehiCompra;
    }

    public String getFechaCompra() {
        return fechaCompra;
    }

    public String getModoPago() {
        return modoPago;
    }

    public String getNombreVendedor() {
        return nombreVendedor;
    }

    public String getApellidoVendedor() {
        return apellidoVendedor;
    }

    public String getDniVendedor() {
        return dniVendedor;
    }

    public String getDireccVendedor() {
        return direccVendedor;
    }

    public String getMailVendedor() {
        return mailVendedor;
    }

    public String getTelVendedor() {
        return telVendedor;
    }
}
