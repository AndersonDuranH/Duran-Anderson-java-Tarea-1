public class ClaseEstudiante{
    private String nombre;
    private int edad;
    private String Carnet;
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
        this.Carnet = carnet;
        this.carrera = carrera;
    }

    public String getNombre(){
        return nombre;
    }

    public int getEdad(){
        return edad;
    }

    public String getCarnet(){
        return Carnet;
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
        this.Carnet = carnet;
    }

    public void setCarrera(String carrera){
        this.carrera = carrera;
    }

}