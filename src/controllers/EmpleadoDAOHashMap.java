package controllers;
import models.Empleado;
import java.util.HashMap;
import java.util.Map;

public class EmpleadoDAOHashMap implements EmpleadoDAO {
    //implela interface EmpleadoDAO
    // Usamos un HashMap para almacenar empleados
    private Map<Empleado, Empleado> empleados;
    public EmpleadoDAOHashMap() {
        this.empleados = new HashMap<>();
    }
    //implementar los metodos abstractos de la interface EmpleadoDAO
    
    @Override
    public void add(Empleado emp) {
        empleados.put(emp, emp);
    }
    @Override
    public void List() {
        if (empleados.isEmpty()) {
            System.out.println("No hay empleados registrados.");
        } else {
            System.out.println("Lista de empleados:");
            for (Empleado emp : empleados.keySet()) {
                System.out.println(emp);
            }
        }
    }
    @Override
    public void remove(int id) {
        Empleado toRemove = null;
        for (Empleado emp : empleados.keySet()) {
            if (emp.getId() == id) {
                toRemove = emp;
                break;
            }
        }
        if (toRemove != null) {
            empleados.remove(toRemove);
        }
    }

    @Override
    public Object getEmpleados() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getEmpleados'");
    }
    
}
