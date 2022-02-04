
package laboratorio3;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Laboratorio3 {

public static Scanner leer = new Scanner(System.in);
    static ArrayList<Clases>clases=new ArrayList<Clases>();
    static ArrayList<Alumnos>alumnos=new ArrayList<Alumnos>();
    static ArrayList<Transportistas>transportista=new ArrayList<Transportistas>();
    static ArrayList<Transportes> transporte=new ArrayList<Transportes>();
    static ArrayList<Estaciones> estacion=new ArrayList<Estaciones>();
    static DateFormat pedirfechas=new SimpleDateFormat("dd/MM/yyyy");
    public static void main(String[] args) throws ParseException {
       
        
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
    public static void opcion(int opcion) throws ParseException{
        if(opcion == 0)
            System.exit(0);
        else if(opcion == 1){
           registarClase();
        }
        else if(opcion == 2){
            crearestacion();
        }
        else if(opcion == 3){
           registrarlumno();
        }

        else if(opcion == 4){
            asignarclase();
        }

        else if(opcion == 5){
         crearTransportista();
        }
        else if(opcion == 6){
           
        }
        else if (opcion == 7){

        }
        else if (opcion == 8){
            listarClases();
        }
        else if (opcion == 9){
            listarEstaciones();
        }
        else if (opcion == 10){
             listarAlumnos();
        }
        else if (opcion == 11){
             listarTransportistas();
        }
        else if (opcion == 12){
             listarTransportes();
        }
        
       
       
        
    }
    
     public static void crearestacion(){
            System.out.println("Ingrese el nombre de la estacion");
            String nombreestacion=leer.nextLine();
            System.out.println("Ingrese coordenada X");
            int coordenada_x=leer.nextInt();
            System.out.println("Ingrese coordenada Y");
            int coordenada_y=leer.nextInt();  
            estacion.add(new Estaciones( nombreestacion,coordenada_x,coordenada_y));
        }
     
    public static void registarClase(){
        System.out.println("Ingrese el nombre de la clase que esta cursando");
        String clase=leer.next();
        System.out.println("Ingrese el codigo de la clase ");
        String codigo=leer.next();
        
        clases.add(new Clases(clase,codigo));

    }

    public static boolean verificarCodigo(String codigo){
        for(Clases clases:clases){
            if(clases.getCodigodeclase().equals(codigo)){
               return true;
            }
        }
       return false;
    }
    
       
      public static void registrarlumno() throws ParseException{
        System.out.println("Ingrese su nombre de alumno ");
        String nombrealumno= leer.nextLine();
          System.out.println("Ingrese su id");
          int identidad=leer.nextInt();
          System.out.println("Ingrese sus fecha de nacimiento(dia/mes/año)");
          String fecha=leer.nextLine();
          Date fechanac=pedirfechas.parse(fecha);
        System.out.println("Ingrese su id de estudiante ");
        int idestudiante=leer.nextInt();
 
        
        alumnos.add(new Alumnos(nombrealumno,identidad,fechanac,idestudiante));
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
           System.out.println("Ingrese la posicion del Alumno");
           int pos=leer.nextInt();
           System.out.println("Ingrese la posicion de la Clase");
           int posclase=leer.nextInt();
           alumnos.get(pos).getClases().add(clases.get(posclase));
       }
       
       public static void crearTransportista() throws ParseException{
        System.out.println("Ingrese el nombre ");
        String nombreTransportista=leer.next();
        System.out.println("Identidad");
        int identidadTransportista=leer.nextInt();
        System.out.println("Fecha de nacimiento");
        String fecha=leer.nextLine();
          Date fechatrans=pedirfechas.parse(fecha);

    }
    public static boolean verificarIdTranportista(int identidadTransportista){
        for(Transportistas transpo:transportista){
            if(transpo.getIdentidad()==identidadTransportista){
                return true;
            }
        }
        return false;
    }
    
   public static void listarClases(){
        for (Clases clases : clases) {
            System.out.println(clases.toString());
    }
    }
    
   public static void listarEstaciones(){
        for (Estaciones estaciones : estacion) {
            System.out.println(estacion.toString());
    }
    }
   
   public static void listarAlumnos(){
        for (Alumnos alumno : alumnos) {
            System.out.println(alumnos.toString());
    }
    }
   
   public static void listarTransportistas(){
        for (Transportistas transpor : transportista) {
            System.out.println(transportista.toString());
    }
    }
   public static void listarTransportes(){
        for (Transportes transportes : transporte) {
            System.out.println(transporte.toString());
    }
    }
   
   
   
}
