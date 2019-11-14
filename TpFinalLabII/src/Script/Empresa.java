package Script;

public abstract class Empresa {

    private String nombreEmp = "Pepito SRL";
    private String pais = "Argentina";
    private String provincia = "Chaco";
    private String ciudad = "Campo de Primavera";
    private String direccEmp = "Av. Siempreviva 742";
    private String telEmp = "3624587456";
    private String mailEmp = "compraventa_vehiculos@pepitosrl.com";
    private String cuit = "30-45875462-6";
    private String responsableEmp = "Don Pepe Compraventa";

    public String getNombreEmp() {
        return nombreEmp;
    }

    public void setNombreEmp(String nombreEmp) {
        this.nombreEmp = nombreEmp;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDireccEmp() {
        return direccEmp;
    }

    public void setDireccEmp(String direccEmp) {
        this.direccEmp = direccEmp;
    }

    public String getTelEmp() {
        return telEmp;
    }

    public void setTelEmp(String telEmp) {
        this.telEmp = telEmp;
    }

    public String getMailEmp() {
        return mailEmp;
    }

    public void setMailEmp(String mailEmp) {
        this.mailEmp = mailEmp;
    }

    public String getCuit() {
        return cuit;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    public String getResponsableEmp() {
        return responsableEmp;
    }

    public void setResponsableEmp(String responsableEmp) {
        this.responsableEmp = responsableEmp;
    }
}
