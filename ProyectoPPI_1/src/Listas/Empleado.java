package Listas;

public class Empleado {
    public String codigo;
    public String nombres;
    public String apellidos;
    public String genero;
    public int edad;
    public double sueldo;
    public Empleado siguiente;

    public Empleado(String codigo, String nombres, String apellidos, String genero, int edad, double sueldo) {
        this.codigo = codigo;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.genero = genero;
        this.edad = edad;
        this.sueldo = sueldo;
        this.siguiente = null;
    }

}
