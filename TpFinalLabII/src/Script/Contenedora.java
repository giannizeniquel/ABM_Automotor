package Script;

import java.io.Serializable;
import java.util.*;

public abstract class Contenedora implements Serializable {

    public static int IdContenedora = 0;
    public static Vehiculo vehiculoBusquedas;
    public static List <String> User = new ArrayList<>(); // 0
    public static List <String> Pass = new ArrayList<>(); // 1
    public static List <Vehiculo> Alta = new ArrayList<>(); // 0
    public static List <Vehiculo> Baja = new ArrayList<>(); // 1
    public static List <Venta> Ventas = new ArrayList<>(); // 2
    public static List <CompraUsados> Compras = new ArrayList<>(); // 3


    public static int getIdContenedora() {
        return IdContenedora;
    }

    public static void setIdContenedora(int idContenedora) {
        IdContenedora = idContenedora;
    }

    public static Vehiculo BuscaParticular(int id, boolean arr[]){
        try{
            Vehiculo aux;
            if (arr[0]){
                for (int i = 0; i < Alta.size(); i++){
                    aux = Alta.get(i);
                    if (aux.getIdVehiculo() == id){
                        return aux;
                    }
                }
            }
            if (arr[1]){
                for (int i = 0; i < Baja.size(); i++){
                    aux = Baja.get(i);
                    if (aux.getIdVehiculo() == id){
                        return aux;
                    }
                }
            }
            if (arr[3]){
                for (int i = 0; i < Compras.size(); i++){
                    if (Compras.get(i).getVehiCompra().getIdVehiculo() == id){
                        return Compras.get(i).getVehiCompra();
                    }
                }
            }
            if (arr[2]){
                for (int i = 0; i < Ventas.size(); i++){
                    if (Ventas.get(i).getVehiVenta().getIdVehiculo() == id){
                        return Ventas.get(i).getVehiVenta();
                    }
                }
            }
        }catch (Exception e){
            System.out.println(e);
        }
        return null;
    }

    public static void AltaBaja(int id, int listSelec){
        try{
            if (listSelec == 1){
                for (int i = 0; i < Alta.size(); i++){
                    if (Alta.get(i).getIdVehiculo() == id){
                        Baja.add(Alta.get(i));
                        Alta.remove(i);
                    }
                }
            }else if (listSelec == 2){
                for (int i = 0; i < Baja.size(); i++){
                    if (Baja.get(i).getIdVehiculo() == id){
                        Alta.add(Baja.get(i));
                        Baja.remove(i);
                    }
                }
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }

    public static Vehiculo BusquedaEnBajaComprar(String numMotorBusqueda){
        Vehiculo vehiculoBusquedaBaja;
        for(int i = 0; i < Baja.size();i++){
            if(numMotorBusqueda.equals(Baja.get(i).getNumMotor())){
                vehiculoBusquedaBaja = Baja.get(i);
                return vehiculoBusquedaBaja;
            }
        }
        return null;
    }
}

