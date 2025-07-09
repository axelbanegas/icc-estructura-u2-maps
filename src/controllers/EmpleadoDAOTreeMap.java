package controllers;
import models.Empleado;
import java.util.Map;
import java.util.TreeMap;

public class EmpleadoDAOTreeMap implements EmpleadoDAO {
    // Implementa la interface EmpleadoDAO
    // Usamos un TreeMap para almacenar empleados
    private Map<Empleado, Empleado> empleados;

    public EmpleadoDAOTreeMap() {
        empleados = new TreeMap<>();
    }

    @Override
    public void add(Empleado emp) {
        empleados.put(emp, emp);
    }

    @Override
    public void List() {

        if (empleados.isEmpty()) {
            System.out.println("No hay empleados.");
            return;
        }
        System.out.println("Lista de empleados:");
        for (Empleado emp : empleados.keySet()) {
            System.out.println(emp);
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
        return empleados;
    }
}