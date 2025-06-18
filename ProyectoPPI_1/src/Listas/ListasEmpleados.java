package Listas;

public class ListasEmpleados {

    private Empleado cabeza;

    public ListasEmpleados() {
        this.cabeza = null;
    }

    public void agregarEmpleado(String codigo, String nombres, String apellidos, String genero, int edad, double sueldo) {
        Empleado nuevo = new Empleado(codigo, nombres, apellidos, genero, edad, sueldo);
        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            Empleado actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevo;
        }
    }

}
