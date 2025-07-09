import controllers.Ejercicios;
import controllers.EmpleadoController;
import controllers.EmpleadoDAO;
import controllers.EmpleadoDAOHashMap;
import controllers.EmpleadoDAOTreeMap;
import controllers.Mapa;

import models.Empleado;


public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("--------------------------Practica Mapas--------------------------");
        System.out.println("__________________________Nombre: Axel Banegas___________________"); /// Cambiar por su nombre
        // Ejecuta el ejemplo de uso de HashMap con ejemplos sencillos
        //runMapExamlpe();

        // // Ejecuta el ejemplo de gestión de empleados usando HashMap
         runEmpleadoExample();

        // // Ejecuta los ejercicios de sumatoria y anagramas
        // runEjerccios();
    }

    private static void runMapExamlpe() {
        Mapa mapa = new Mapa();
        mapa.runHashMap();
        mapa.runLinkedHashMap();
        mapa.runTreeMap();
        mapa.runHashMapObj();
        mapa.runTreemapObj();
    }

    private static void runEmpleadoExample() {
    System.out.println("--------------------------Ejemplo de Empleados--------------------------");

    // HashMap
    EmpleadoDAO empleadoDAOHash = new EmpleadoDAOHashMap();
    EmpleadoController empleadoControllerHash = new EmpleadoController(empleadoDAOHash);

    // TreeMap
    EmpleadoDAO empleadoDAOTree = new EmpleadoDAOTreeMap();
    EmpleadoController empleadoControllerTree = new EmpleadoController(empleadoDAOTree);

    Empleado emp1 = new Empleado(4, "Pedro", "DEV");
    Empleado emp2 = new Empleado(2, "Pedro", "DEV");
    Empleado emp3 = new Empleado(5, "Juan", "DEV");
    Empleado emp4 = new Empleado(3, "Maria", "DEV");
    Empleado emp5 = new Empleado(1, "Juan", "DEV");

    // HashMap ejemplo
    System.out.println("---- HashMap ----");
    empleadoControllerHash.agregarEmpleado(emp1);
    empleadoControllerHash.agregarEmpleado(emp2);
    empleadoControllerHash.agregarEmpleado(emp3);
    empleadoControllerHash.agregarEmpleado(emp4);
    empleadoControllerHash.agregarEmpleado(emp5);

    empleadoControllerHash.list();
    empleadoControllerHash.remove(2);
    empleadoControllerHash.list();

    // TreeMap ejemplo
    System.out.println("---- TreeMap ----");
    empleadoControllerTree.agregarEmpleado(emp1);
    empleadoControllerTree.agregarEmpleado(emp2);
    empleadoControllerTree.agregarEmpleado(emp3);
    empleadoControllerTree.agregarEmpleado(emp4);
    empleadoControllerTree.agregarEmpleado(emp5);

    empleadoControllerTree.list();
    empleadoControllerTree.remove(2);
    empleadoControllerTree.list();
    }

    private static void runEjerccios() {
        throw new UnsupportedOperationException("Not implemented yet");

    }
}
