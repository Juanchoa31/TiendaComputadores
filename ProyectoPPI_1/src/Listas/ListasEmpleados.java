package Listas;

public class ListasEmpleados {

    private Empleado cabeza;

    public ListasEmpleados() {
        this.cabeza = null;
    }

    public Empleado buscarEmpleado(String codigoBuscado) {
        Empleado actual = cabeza;

        while (actual != null) {
            if (actual.codigo.trim().equalsIgnoreCase(codigoBuscado.trim())) {
                return actual;
            }
            actual = actual.siguiente;
        }

        return null;
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

    public boolean editarEmpleado(String codigoBuscado, String nuevosNombres, String nuevosApellidos, String nuevoGenero, int nuevaEdad, double nuevoSueldo) {
        Empleado actual = cabeza;

        while (actual != null) {
            if (actual.codigo.equals(codigoBuscado)) {
                actual.nombres = nuevosNombres;
                actual.apellidos = nuevosApellidos;
                actual.genero = nuevoGenero;
                actual.edad = nuevaEdad;
                actual.sueldo = nuevoSueldo;
                return true;
            }
            actual = actual.siguiente;
        }

        return false;
    }

    public boolean eliminarEmpleado(String codigo) {
        if (cabeza == null) {
            return false;
        }

        // Si el primero es el que queremos eliminar
        if (cabeza.codigo.equals(codigo)) {
            cabeza = cabeza.siguiente;
            return true;
        }

        Empleado actual = cabeza;
        while (actual.siguiente != null) {
            if (actual.siguiente.codigo.equals(codigo)) {
                actual.siguiente = actual.siguiente.siguiente;
                return true;
            }
            actual = actual.siguiente;
        }

        return false; // No se encontró
    }
}
