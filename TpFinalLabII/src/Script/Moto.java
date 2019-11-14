package Script;

import java.io.Serializable;

public class Moto extends Vehiculo  {

    private boolean tipoTablero; //electronico/analogico
    private boolean baul;
    private boolean embragueAutom;
    private boolean patada;
    private boolean encendidoElectrico;

    public Moto(boolean usados, String marca, String modelo, String numMotor, String numChasis, int idTipo) {
        super(usados, marca, modelo, numMotor, numChasis, idTipo);
    }

    @Override
    protected void AltaBaja() {
        super.AltaBaja();
    }

    public boolean isTipoTablero() {
        return tipoTablero;
    }

    public void setTipoTablero(boolean tipoTablero) {
        this.tipoTablero = tipoTablero;
    }

    public boolean isBaul() {
        return baul;
    }

    public void setBaul(boolean baul) {
        this.baul = baul;
    }

    public boolean isEmbragueAutom() {
        return embragueAutom;
    }

    public void setEmbragueAutom(boolean embragueAutom) {
        this.embragueAutom = embragueAutom;
    }

    public boolean isPatada() {
        return patada;
    }

    public void setPatada(boolean patada) {
        this.patada = patada;
    }

    public boolean isEncendidoElectrico() {
        return encendidoElectrico;
    }

    public void setEncendidoElectrico(boolean encendidoElectrico) {
        this.encendidoElectrico = encendidoElectrico;
    }

}