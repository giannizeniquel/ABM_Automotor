package Script;
import com.sun.corba.se.spi.ior.ObjectKeyTemplate;

import java.io .*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class BaseDatosListas implements Serializable {

        public static void EscribirArchAltas() throws IOException {
            FileOutputStream ficheroAlta = new FileOutputStream("Data/FileAlta.dat");
            ObjectOutputStream salidaAlta = new ObjectOutputStream(ficheroAlta);
            salidaAlta.writeObject(Contenedora.Alta);
            salidaAlta.flush();
            salidaAlta.close();
        }

        public static void LeerArchAlta() throws Exception {
            FileInputStream ficheroAlta = new FileInputStream("Data/FileAlta.dat");
            ObjectInputStream entradaAlta = new ObjectInputStream(ficheroAlta);
            Contenedora.Alta = (List<Vehiculo>) entradaAlta.readObject();
            entradaAlta.close();
        }

        public static void EscribirArchBajas() throws IOException {
            FileOutputStream ficheroBaja2 = new FileOutputStream("Data/FileBaja.dat");
            ObjectOutputStream salidaBaja = new ObjectOutputStream(ficheroBaja2);
            salidaBaja.writeObject(Contenedora.Baja);
            salidaBaja.flush();
            salidaBaja.close();
        }

        public static void LeerArchBajas() throws Exception {
            FileInputStream ficheroBaja = new FileInputStream("Data/FileBaja.dat");
            ObjectInputStream entradaBaja = new ObjectInputStream(ficheroBaja);
            Contenedora.Baja = (List<Vehiculo>) entradaBaja.readObject();
            entradaBaja.close();
        }

        public static void EscribirArchVentas() throws IOException {
            FileOutputStream ficheroVenta = new FileOutputStream("Data/FileVenta.dat");
            ObjectOutputStream salidaVenta = new ObjectOutputStream(ficheroVenta);
            salidaVenta.writeObject(Contenedora.Ventas);
            salidaVenta.flush();
            salidaVenta.close();
        }

        public static void LeerArchVentas() throws Exception {
            FileInputStream ficheroVenta = new FileInputStream("Data/FileVenta.dat");
            ObjectInputStream entradaVenta = new ObjectInputStream(ficheroVenta);
            Contenedora.Ventas = (List<Venta>) entradaVenta.readObject();
            entradaVenta.close();
        }

        public static void EscribirArchCompras() throws IOException {
            FileOutputStream ficheroCompra = new FileOutputStream("Data/FileCompra.dat");
            ObjectOutputStream salidaCompra = new ObjectOutputStream(ficheroCompra);
            salidaCompra.writeObject(Contenedora.Compras);
            salidaCompra.flush();
            salidaCompra.close();
        }

        public static void LeerArchCompras() throws Exception {
            FileInputStream ficheroCompra = new FileInputStream("Data/FileCompra.dat");
            ObjectInputStream entradaCompra = new ObjectInputStream(ficheroCompra);
            Contenedora.Compras = (List<CompraUsados>) entradaCompra.readObject();
            entradaCompra.close();
        }

        public static void EscribirId() throws IOException {
            File archId = new File("Data/FileId.txt");
            if (!archId.exists()) {
                archId.createNewFile();
            }
            FileOutputStream salidaId = new FileOutputStream(archId);
            salidaId.write(Contenedora.getIdContenedora());
            salidaId.flush();
            salidaId.close();
        }

        public static void LeerId() throws Exception {
            File archId = new File("Data/FileId.txt");
            FileInputStream entradaId = new FileInputStream(archId);
            Contenedora.setIdContenedora(entradaId.read());
            entradaId.close();
        }
    public static void EscribirUser() throws IOException {
        FileOutputStream ficheroCompra = new FileOutputStream("Data/FileUser.dat");
        ObjectOutputStream salidaCompra = new ObjectOutputStream(ficheroCompra);
        salidaCompra.writeObject(Contenedora.User);
        salidaCompra.flush();
        salidaCompra.close();
    }

    public static void LeerUser() throws Exception {
        FileInputStream ficheroCompra = new FileInputStream("Data/FileUser.dat");
        ObjectInputStream entradaCompra = new ObjectInputStream(ficheroCompra);
        Contenedora.User = (List<String >) entradaCompra.readObject();
        entradaCompra.close();
    }

    public static void EscribirPass() throws IOException {
        FileOutputStream ficheroCompra = new FileOutputStream("Data/FilePass.dat");
        ObjectOutputStream salidaCompra = new ObjectOutputStream(ficheroCompra);
        salidaCompra.writeObject(Contenedora.Pass);
        salidaCompra.flush();
        salidaCompra.close();
    }
    public static void LeerPass() throws Exception {
        FileInputStream ficheroCompra = new FileInputStream("Data/FilePass.dat");
        ObjectInputStream entradaCompra = new ObjectInputStream(ficheroCompra);
        Contenedora.Pass = (List<String>) entradaCompra.readObject();
        entradaCompra.close();
    }
}

