package Listas;

public class Empleado {
    String codigo;
    String nombres;
    String apellidos;
    String genero;
    int edad;
    double sueldo;
    Empleado siguiente;

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
