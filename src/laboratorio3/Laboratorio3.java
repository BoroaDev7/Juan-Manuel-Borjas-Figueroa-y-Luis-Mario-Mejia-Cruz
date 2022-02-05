
package laboratorio3;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class Laboratorio3 {

public static Scanner leer = new Scanner(System.in);
    static ArrayList<Clases>clases=new ArrayList<Clases>();
    static ArrayList<Alumnos>alumnos=new ArrayList<Alumnos>();
    static ArrayList<Transportistas>transportista=new ArrayList<Transportistas>();
    static ArrayList<Transportes> transporte=new ArrayList<Transportes>();
    static ArrayList<Estaciones> estacion=new ArrayList<Estaciones>();
    static DateFormat pedirfechas=new SimpleDateFormat("dd/MM/yyyy");
    static ArrayList<Transportes> buses=new ArrayList<Transportes>();
    static int genteparada;
    static int numerodeasientos;
    static int capmax;
    static int possub;
    
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
                "9. Listar Rutas\n" +
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
           agregarTransporte();
        }
        else if (opcion == 7){
           simulacion();
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
            String nombreestacion=leer.next();
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
        String nombrealumno= leer.next();
          System.out.println("Ingrese su id");
          int identidad=leer.nextInt();
          
          System.out.println("Ingrese sus fecha de nacimiento(dia/mes/año)");
          String fecha=leer.next();
          Date fechanac=pedirfechas.parse(fecha);
        System.out.println("Ingrese su id de estudiante ");
        int idestudiante=leer.nextInt();
 
        if(verificaridestudiante(idestudiante) && verificarid(identidad)){
            System.out.println("Dos personas no pueden tener las mismas id");
            System.out.println("");
             System.out.println("Ingrese su id");
           identidad=leer.nextInt();
           System.out.println("Ingrese su id de estudiante ");
         idestudiante=leer.nextInt();
        }  
    alumnos.add(new Alumnos(nombrealumno,identidad,fechanac,idestudiante));
        
      }
      
      public static boolean verificarid(int identidad){
        for(Alumnos alumno:alumnos){
            if(alumno.getIdentidad()==identidad){
               return true;
            }
        }
       return false;
    }
      
       public static boolean verificaridestudiante(int idestudiante){
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
        String fecha=leer.next();
          Date fechatrans=pedirfechas.parse(fecha);
           System.out.println("Ingrese los años de Experiencia");
           int aniosexp=leer.nextInt();
           System.out.println("Ingrese Apodo");
           String apodo=leer.next();
           transportista.add(new Transportistas(nombreTransportista,identidadTransportista,fechatrans,aniosexp,apodo));
        
    }
    public static boolean verificarIdTranportista(int identidadTransportista){
        for(Transportistas transpo:transportista){
            if(transpo.getIdentidad()==identidadTransportista){
                return true;
            }
        }
        return false;
    }
    
    public static void agregarTransporte(){
        System.out.println("Ingrese la placa");
            String placa=leer.next();
            if(verificarplaca(placa)){
                System.out.println("Dos transportes no pueden tener la misma placa");
                System.out.println("");
                System.out.println("Ingrese la placa");
                 placa=leer.next();
            }
            System.out.println("Ingrese el color del transporte");
            String color=leer.next();
        System.out.println("Ingrese el tipo de transporte");
        String tipo=leer.next();
        
        
        if(tipo.equals("buses") || tipo.equals("Buses") ||tipo.equals("Bus")|| tipo.equals("bus")) {
            System.out.println("Ingrese el numero de asientos ");
             numerodeasientos = leer.nextInt();
            System.out.println("Ingrese el numero de personas de pie");
             genteparada = leer.nextInt();
            capmax = numerodeasientos + genteparada;

           
            buses.add(new Buses(placa,color,transportista,alumnos,numerodeasientos,genteparada,capmax));
   
           
        }
        else if(tipo.equals("rapidito")||tipo.equals("Rapidito") || tipo.equals("Rapiditos") ||tipo.equals("rapiditos") ){
            System.out.println("Ingrese el numero de asientos ");
            int numsillas=leer.nextInt();
           
            capmax=numsillas;   
            
            transporte.add(new Rapiditos(placa,color,transportista,alumnos,numsillas));
        }
        else if(tipo.equals("taxis")||tipo.equals("Taxis") || tipo.equals("Taxi") ||tipo.equals("taxi")){
            capmax=4;
            System.out.println("Ingrese el numero de Taxi");
            int numerotaxi=leer.nextInt(); 
            if(verificarnumtaxi(numerotaxi)){
                System.out.println("Dos taxis no pueden tener el mismo numero");
                System.out.println("");
                System.out.println("Ingrese el numero de taxi");
                 numerotaxi=leer.nextInt();
            }
            transporte.add(new Taxis(placa,color,transportista,numerotaxi));
            
        }
        else if (tipo.equals("mototaxis")||tipo.equals("Mototaxis") || tipo.equals("mototaxi") ||tipo.equals("Mototaxi")){
            capmax=2;
            transporte.add(new Mototaxis(placa,color,transportista,capmax));
        }
    }
    
     public static boolean verificarplaca(String placa ){
        for(Transportes transportes:transporte){
            if(transportes.getPlaca().equals(placa)){
                return true;
            }
        }
        return false;
    }
     public static boolean verificarnumtaxi(int numerotaxi ){
        for(Transportes transportes:transporte){
            if(transporte.equals(numerotaxi)){
                return true;
            }
        }
        return false;
    }
     
     public static void simulacion(){
         System.out.println("0. Salir\n" +
             "1. Subir alumno al transporte\n" +
             "2. Listar alumnos del transporte\n" +
             "3. Escoger transportista\n" +
             "4. Añadir ruta\n" +
             "5. Imprimir transporte\n" +
             "6. Destruir\n"+
             "Ingrese una opcion");
         int opcionsim=leer.nextInt();
         
         if(opcionsim==0){
              System.exit(0);
         }
         else if(opcionsim==1){
          subiralumnos();
         }
         else if(opcionsim==2){
             listaralum();
             
         }
         else if(opcionsim==3){
             escogertransport();
         }
         else if(opcionsim==4){
             
         }
         else if(opcionsim==5){
             imprimirtranspo();
         }
         else if(opcionsim==6){
             destruir();
         }
     }
     
     
     
     
     public static void subiralumnos(){
         System.out.println("Inserte la posicion del transporte en la cual se subira el alumno");
         possub=leer.nextInt();
         while(alumnos.size()<capmax){
             System.out.println("Ingrese la posicion del alumno a subirse");
              int posalumn=leer.nextInt();
              transporte.get(possub).getAlumnotrans().add(alumnos.get(posalumn));
         }
     }
     
     public static void listaralum(){
     for (Transportes alumno : transporte) {
            System.out.println(alumno.getAlumnotrans());
    }
    }
     public static void escogertransport(){
         
         System.out.println("Inserte la posicion del transportista que se subira");
         int posta=leer.nextInt();
         transporte.get(possub).getTransportista().add(transportista.get(posta));
     }
     
     public static void imprimirtranspo(){
         for (Transportes transportes : transporte) {
            System.out.println(transportes.toString());
    }
     }
     
     public static void destruir(){
         transporte.remove(possub);
     }
     
   public static void listarClases(){
        for (Clases clase : clases) {
            System.out.println(clase.toString());
    }
    }
   
    
   public static void listarEstaciones(){
        for (Estaciones estaciones : estacion) {
            System.out.println(estaciones.toString());
    }
    }
   
   public static void listarAlumnos(){
        for (Alumnos alumno : alumnos) {
            System.out.println(alumno.toString());
    }
    }
   
   public static void listarTransportistas(){
        for (Transportistas transpor : transportista) {
            System.out.println(transpor.toString());
    }
    }
   public static void listarTransportes(){
        for (Transportes transportes : transporte) {
            System.out.println(transportes.toString());
    }
    }
   
   
   
}
