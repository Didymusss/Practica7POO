import java.util.ArrayList;
import java.util.Scanner;

public class Alumno {
    private String nombre;
    private String apellido;
    private String numDeCuenta;
    private int semestreActual;
    private double promedio;
    private int creditos;
    private int NP;
    private static ArrayList<Alumno> totalAlumnos = new ArrayList<>();
    

    public Alumno(String nombre, String apellido, String numDeCuenta, int semestreActual, double promedio, int creditos, int NP) {
      this.nombre= nombre;
      this.apellido= apellido;
      this.numDeCuenta=numDeCuenta;
      this.semestreActual=semestreActual;
      this.promedio= promedio;
      this.creditos= creditos;
      this.NP= NP;
        
    }
 
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNumDeCuenta() {
        return numDeCuenta;
    }

    public void setNumDeCuenta(String numDeCuenta) {
        this.numDeCuenta = numDeCuenta;
    }

    public int getSemestreActual() {
        return semestreActual;
    }

    public void setSemestreActual(int semestreActual) {
        this.semestreActual = semestreActual;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public int getNP() {
        return NP;
    }

    public void setNP(int NP) {
        this.NP = NP;
    }

    public void crearAlumno(){
      Alumno nuevoAl;
      String nombre, apellido, numC;
      int semestreActual, creditos, NP;
      double promedio;
      Scanner scanMan = new Scanner(System.in);
      System.out.println("Introduzca el nombre del alumno.");
      nombre = scanMan.nextLine();
      System.out.println("Introduzca el apellido del alumno.");
      apellido = scanMan.nextLine();
      System.out.println("Introduzca el no. de cuenta del alumno.");
      numC = scanMan.nextLine();
      System.out.println("Introduzca el semestre actual del alumno.");
      semestreActual = scanMan.nextInt();
      System.out.println("Introduzca los cr�ditos que tiene el alumno.");
      creditos = scanMan.nextInt();
      System.out.println("Introduzca las materias NP del alumno.");
      NP = scanMan.nextInt();
      System.out.println("Introduzca el promedio del alumno.");
      promedio = scanMan.nextDouble();

      nuevoAl = new Alumno(nombre, apellido, numC, semestreActual, promedio, creditos, NP);

    totalAlumnos.add(nuevoAl);
      
    }

    public void listarTodosAlumnos(){
      int i = 0;
      for(Alumno alu : totalAlumnos){
        System.out.println("ALUMNO " + i);
        System.out.println("NOMBRE: " + alu.getNombre() + " " + alu.getApellido());
        System.out.println("PROMEDIO: " + alu.getPromedio());
        System.out.println("NUMERO DE CUENTA: " + alu.getNumDeCuenta());
        System.out.println("SEMESTRE ACTUAL: " + alu.getSemestreActual());
        System.out.println("CREDITOS: " + alu.getCreditos());
        System.out.println("CANTIDAD DE NPs: " + alu.getNP());
      }
    }
    
    @Override
    public String toString(){
        return "Nombre del alumno: " + getNombre() + " " + getApellido() + "\n" +
                "Promedio del alumno: " + getPromedio() + "\n" + "Numero de cuenta: "
                + getNumDeCuenta() + "\n" + "Semestre actual: " + getSemestreActual() + "\n"
                + "Creditos: " + getCreditos() + "\n" + "NPs: " + getNP();
    }
}
