import java.util.ArrayList;
import java.util.Scanner;
public class ClaseEstudiante{
    private String nombre;
    private int edad;
    private String carnet;
    private String carrera;

    public ClaseEstudiante(){
        setNombre("");
        setEdad(0);
        setCarnet("");
        setCarrera("");
    }

    public ClaseEstudiante(String nombre, int edad, String carnet, String carrera){
        this.nombre = nombre;
        this.edad = edad;
        this.carnet = carnet;
        this.carrera = carrera;
    }

    public String getNombre(){
        return nombre;
    }

    public int getEdad(){
        return edad;
    }

    public String getCarnet(){
        return carnet;
    }

    public String getCarrera(){
        return carrera;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }

    public void setCarnet(String carnet){
        this.carnet = carnet;
    }

    public void setCarrera(String carrera){
        this.carrera = carrera;
    }


    public static void ClaseEstudiante(Scanner sc) {
        ArrayList<ClaseEstudiante> estudiantes = new ArrayList<ClaseEstudiante>();
   
        for(int i = 1; i <= 2; i++){

        System.out.print("Digite su Nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Digite su Edad: ");
        int edad = sc.nextInt();
        sc.nextLine();

        System.out.print("Digite su Carnet: ");
        String carnet = sc.nextLine();

        System.out.print("Digite su Carrera: ");
        String carrera = sc.nextLine();

        ClaseEstudiante e = new ClaseEstudiante(nombre, edad, carnet, carrera);
        estudiantes.add(e);
        }

        for(ClaseEstudiante e : estudiantes)
{
    System.out.println("==============================");
    System.out.println("Nombre: " + e.getNombre());
    System.out.println("Edad: " + e.getEdad());
    System.out.println("Carnet: " + e.getCarnet());
    System.out.println("Carrera: " + e.getCarrera());
    System.out.println("==============================");
}
        

        
    }
}


