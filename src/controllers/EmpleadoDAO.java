package controllers;
import models.Empleado;

public interface EmpleadoDAO {
    public void add(Empleado emp);
    public void List();
    public void remove(int id);
    public Object getEmpleados();
}
