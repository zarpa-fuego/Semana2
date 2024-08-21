package pe.upeu;
import java.time.LocalDate;

class Persona {
    private String nombre;
    private int edad;
    private boolean presente;
    private LocalDate fecha;


    public Persona(String nombre, int edad, boolean presente, LocalDate fecha) {
        this.nombre = nombre;
        this.edad = edad;
        this.presente = presente;
        this.fecha = fecha;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean getPresente() {
        return presente;
    }

    public void setPresente(boolean presente) {
        this.presente = presente;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String toString() {
        return "Persona{" + "nombre='" + nombre + ", edad=" + edad + ", asistencia " + presente + " - " + fecha + "}";
    }
}