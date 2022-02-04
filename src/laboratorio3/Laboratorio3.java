
package laboratorio3;

import java.util.ArrayList;
import java.util.Scanner;

public class Laboratorio3 {

public static Scanner leer = new Scanner(System.in);
    static ArrayList<Clases>clases=new ArrayList<Clases>();
    static ArrayList<Alumnos>alumnos=new ArrayList<Alumnos>();
    public static void main(String[] args) {
        do{
            opcion( menu() );
        }while(true);
    }

    public static int menu(){

        System.out.println("");
        System.out.println("");
        System.out.println("0. Salir");
        System.out.println("1.Crear clase\n" +
                "2. Crear Estacion \n" +
                "3. Crear Alumno\n" +
                "4. Agregar Clase Alumno\n" +
                "5. Crear Transportista\n" +
                "6. Crear transporte \n" +
                "7. Simulacion\n" +
                "8. Listar Clases\n" +
                "9.Listar Rutas\n" +
                "10.Listar Alumnos\n" +
                "11.Listar Transportistas\n" +
                "12.Listar Transportes\n" +
                "Ingrese la opcion: \n");
        return leer.nextInt();
    }
    public static void opcion(int opcion){
        if(opcion == 0)
            System.exit(0);
        else if(opcion == 1){
           registarClase();
        }
        else if(opcion == 2){
            
        }
        else if(opcion == 3){
           registrarlumno();
        }

        else if(opcion == 4){

        }

        else if(opcion == 5){

        }
        else if(opcion == 6){

        }
        else if (opcion == 7){

        }

    }
    public static void registarClase(){
        System.out.println("Ingrese el nombre de la clase que esta cursando");
        String clase=leer.next();
        System.out.println("Ingrese el codigo de la clase ");
        String codigo=leer.next();
          

    }

    public static boolean verificarCodigo(String codigo){
        for(Clases clases:clases){
            if(clases.getCodigodeclase().equals(codigo)){
               return true;
            }
        }
       return false;
    }
    
       
      public static void registrarlumno(){
        System.out.println("Ingrese su nombre de alumno ");
        String nombreaalumno= leer.next();
        System.out.println("Ingrese su id de estudiante ");
        int idestudiante=leer.nextInt();
    }
      
       public static boolean verificarid(int idestudiante){
        for(Alumnos alumno:alumnos){
            if(alumno.getIdestudiante()==idestudiante){
               return true;
            }
        }
       return false;
    }
       
       public static void asignarclase(){
           
       }
    
}
