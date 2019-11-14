package Script;

import javafx.scene.control.PasswordField;

import java.util.ArrayList;
import java.util.List;

public class Login {
    public static boolean VerificacionUsuaPassw(String sUsuario,String sPassword){
        sUsuario = sUsuario.toUpperCase();
        for(int i = 0;i < Contenedora.User.size();i++) {
            if (sUsuario.equals(Contenedora.User.get(i))) {
                if(sPassword.equals(Contenedora.Pass.get(i))){
                    return true;
                }
            }
        }
        return false;
    }
}
