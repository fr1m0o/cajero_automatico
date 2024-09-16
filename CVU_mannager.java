/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bancarios;

/**
 *
 * @author nicolas
 */
public class CVU_mannager {
     private static String CVU;
     
     public static void inicioCVU(String CvuIniciado){
     CVU=CvuIniciado;
     
     
     }

        public static String getCVU() {
        return CVU;
    }
     
     public static void cerrarCVU(){
     
     CVU= null;
     
     }
     
     
}
