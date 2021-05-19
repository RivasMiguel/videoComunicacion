/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videocomunicacion;

/**
 *
 * @author Admin
 */
public class videoComunicacion {

    
        private static String nombre;
        private static int cantidadUsuario;
        private static Integer tiempo;
        private static String nivel;
        private static int estrella;
        
        public videoComunicacion(String nombre,int cantidadUsuario, int tiempo, String nivel, int estrella){
            videoComunicacion.nombre = nombre;
            videoComunicacion.cantidadUsuario = cantidadUsuario;
            videoComunicacion.tiempo = tiempo;
            videoComunicacion.nivel = nivel;
            videoComunicacion.estrella = estrella;
        }
            
        
               public static int calidad(){
                   return cantidadUsuario*tiempo*estrella;
               }
               
        
    public static void main(String[] args){
        videoComunicacion mivideoComunicacion = new videoComunicacion("Meet", 40, 2, "libre", 5);
        System.out.println(calidad());
    }
}
    

