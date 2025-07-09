package controllers;

import java.util.HashMap;
import java.util.Map;

import models.Empleado;

public class EmpleadoController {
    private EmpleadoDAO empleadoDAO;
    public EmpleadoController(EmpleadoDAO empleadoDAO) {
    this.empleadoDAO = empleadoDAO;
    }
    public void agregarEmpleado(Empleado emp1) {
        // TODO Auto-generated method stub
        empleadoDAO.add(emp1);
    }
    public Empleado[] getEmpleados() {
        // TODO Auto-generated method stub
        // Convertimos el Map a un array de Empleado
        return empleadoDAO.getEmpleados().values().toArray(new Empleado[0]);
        
    }
    public void list() {
        // TODO Auto-generated method stub
        empleadoDAO.List();
    }
    public void remove(int i) {
        // TODO Auto-generated method stub
        empleadoDAO.remove(i);
    }
}