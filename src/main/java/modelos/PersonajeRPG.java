package modelos;

// PersonajeRPG.java
public class PersonajeRPG implements IPrototype {
    private String nombre;
    private String clase;
    private int nivel;
    private int puntosVida;
    private int puntosEnergia;

    public PersonajeRPG(String nombre, String clase, int nivel, int puntosVida, int puntosEnergia) {
        this.nombre = nombre;
        this.clase = clase;
        this.nivel = nivel;
        this.puntosVida = puntosVida;
        this.puntosEnergia = puntosEnergia;
    }

    // Constructor de copia para el clon
    public PersonajeRPG(PersonajeRPG prototipo) {
        this.nombre = prototipo.nombre;
        this.clase = prototipo.clase;
        this.nivel = prototipo.nivel;
        this.puntosVida = prototipo.puntosVida;
        this.puntosEnergia = prototipo.puntosEnergia;
    }

    @Override
    public IPrototype clone() {
        return new PersonajeRPG(this);
    }

    // Getters y Setters para modificar el clon después
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setNivel(int nivel) { this.nivel = nivel; }

    @Override
    public String toString() {
        return String.format("Personaje [Nombre: %s, Clase: %s, Nivel: %d, HP: %d, Energía: %d]", 
                nombre, clase, nivel, puntosVida, puntosEnergia);
    }
}