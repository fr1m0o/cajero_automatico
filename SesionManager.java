/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bancarios;

/**
 *
 * @author nicolas
 */
public class SesionManager {
     private static String contraseña;
     
     public static void iniciarSesion(String contraseñaIngresada) {
        contraseña = contraseñaIngresada;
    }

    public static String getContraseña() {
        return contraseña;
    }
    
     public static void cerrarSesion() {
        contraseña = null;
    }
     
}


