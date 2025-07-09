package controllers;
import java.util.Map;
import java.util.TreeMap;
import java.util.HashMap;
import models.Empleado;


public class Mapa {
    public Mapa() {
        System.out.println("***********Mapa Class***********");
    }
    public void runHashMap() {
        System.out.println("----------------------------Ejemplo de HashMap------------------------------");
        Map<String, String>mapa = new HashMap();
        mapa.put("001", "Celular"); 
        mapa.put("002", "Laptop"); 
        mapa.put("003", "Celular");  
        mapa.put("003", "PC");

        System.out.println(mapa);
        System.out.println(mapa.keySet());

        for (String key : mapa.keySet()) {
            System.out.println(" Valor: " + mapa.get(key));
        }
        System.out.println("001");
        System.out.println("005");
     }

    public void runLinkedHashMap() {
        // Crear un mapa con clave numeros y vaalores nombre de personas solo nombre
        //iteger-string
        //Agregar 5 elementos e imprimir todos los VALORES
        System.out.println("---------------------Ejemplo de LinkedHashMap----------------------");
        Map<Integer, String> linkedMap = new java.util.LinkedHashMap<>();
        linkedMap.put(1, "Juan");
        linkedMap.put(2, "Maria");
        linkedMap.put(3, "Pedro");
        linkedMap.put(4, "Ana");
        linkedMap.put(5, "Luis");
        // Imprimir todos los valores
        for (String value : linkedMap.values()) {
            System.out.println("Valor: " + value);
        }
    }
    public void runTreeMap() {
        System.out.println("------------------------------Ejemplo de TreeMap------------------------------");
        Map<Integer, String> items = new TreeMap();
            items.put(3, "carro");
            items.put(6, "bicicleta");
            items.put(1, "moto");
            
            // IMPRIMIR VALORES
            for (String value : items.values()) {
                System.out.println("Valor: " + value);
            }
    }
    public void runHashMapObj(){
        System.out.println("----------------------Ejemplo de HashMap con objetos-----------------------");
        Map<Empleado, Integer> empleados = new HashMap();

        empleados.put(new Empleado(1, "Juan", "Dev"), 1200);
        empleados.put(new Empleado(2, "Juan", "Dev"), 1500);
        empleados.put(new Empleado(3, "Pedro", "Dev"), 2000);
        empleados.put(new Empleado(1, "Juan", "Dev"), 2500);
        empleados.put(new Empleado(1, "Diego", "Dev"), 3000);
        //sobreescribimos el iquals y el Hashcode para comparar solo el id y el nombre 
        // solo deberia quedar 4 empleados 1 pedro 2 juan y 1 diego
        System.out.println("Empleados y sus salarios:");
        for (Map.Entry<Empleado, Integer> entry : empleados.entrySet()) {
            Empleado empleado = entry.getKey();
            Integer salario = entry.getValue();
            System.out.println(empleado + " - Salario: " + salario);
        }
    }
    public void runTreemapObj(){
        System.out.println("----------------------Ejemplo de TreeMap con objetos-----------------------");
        Map<Empleado, Integer> empleados = new TreeMap();

        empleados.put(new Empleado(1, "Juan", "Dev"), 1200);
        empleados.put(new Empleado(2, "Juan", "Dev"), 1500);
        empleados.put(new Empleado(3, "Pedro", "Dev"), 2000);
        empleados.put(new Empleado(1, "Diego", "Dev"), 1200);
        empleados.put(new Empleado(1, "Juan", "Senior"), 3000);



        //comparamos si los numeros son iguales, si son iguales comparamos por nombre
        //utilizamos el compareto de la clase empleado
        //no necesito crear mas empleados
        //es necesario que la clase empleado implemente la interfaz comparable
        System.out.println("Empleados y sus salarios:");
        for (Map.Entry<Empleado, Integer> entry : empleados.entrySet()) {
            Empleado empleado = entry.getKey();
            Integer salario = entry.getValue();
            System.out.println(empleado + " - Salario: " + salario);
        }


    }
}
