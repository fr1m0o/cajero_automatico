/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bancarios;

/**
 *
 * @author nicolas
 */
public class MailManager {
     private static String email;
     
     
     public static void Mail(String MailIngresado){
     email= MailIngresado;
     
     
     }

    public static String getEmail() {
        return email;
    }

    public static void cerrarMail() {
        email = null;
    }
     
     
     
}
