package models;

public class Empleado implements Comparable<Empleado>{
    private int id;
    private String name;
    private String position;

    public Empleado(int id, String name, String position) {
        this.id = id;
        this.name = name;
        this.position = position;
    }

    public Empleado(int id2) {
        //TODO Auto-generated constructor stub
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Position: " + position;
    }
    //sobreescribimos el iquals y el Hashcode para comparar solo el id y el nombre 
    // solo deberia quedar 4 empleados 1 pedro 2 juan y 1 diego
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Empleado)) return false;
        Empleado other = (Empleado) obj;
        return this.id == other.id && this.name.equals(other.name);
    }
    @Override
    public int hashCode() {
    int result = Integer.hashCode(id);
    result = 31 * result + (name != null ? name.hashCode() : 0);
    return result;
}
    //En caso de que el id sea el mismo, se compara por nombre
    // si el id es diferente se compara por id
    @Override
    public int compareTo(Empleado emp) {
        int comparacionId = Integer.compare(id, emp.id);
        if (comparacionId != 0) {
            return comparacionId;
        }
        // Si los IDs son iguales, comparamos por nombre
        return name.compareTo(emp.name);
    }
}