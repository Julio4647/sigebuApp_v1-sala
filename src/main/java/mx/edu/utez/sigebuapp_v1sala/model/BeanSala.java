package mx.edu.utez.sigebuapp_v1sala.model;

public class BeanSala {
    private int id;
    private String nombre_sala;
    private int capacidad_sala;

    public BeanSala(int id){this.id = id;}

    public BeanSala() {

    }

    public BeanSala(String nombre_sala, int capacidad_sala) {
        this.nombre_sala = nombre_sala;
        this.capacidad_sala = capacidad_sala;
    }

    public int getId() {return id;}

    public void setId(int id) {this.id = id;}

    public String getNombre_sala() {return nombre_sala;}

    public void setNombre_sala(String nombre_sala) {this.nombre_sala = nombre_sala;}

    public int getCapacidad_sala() {return capacidad_sala;}

    public void setCapacidad_sala(int capacidad_sala) {this.capacidad_sala = capacidad_sala;}
}
