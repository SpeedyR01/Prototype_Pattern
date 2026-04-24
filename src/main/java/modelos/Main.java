package modelos;

// Main.java
public class Main {
    public static void main(String[] args) {
        PrototypeRegistry registro = new PrototypeRegistry();

        // Creamos un batallón de guerreros clonando el prototipo
        PersonajeRPG g1 = (PersonajeRPG) registro.getClon("guerrero");
        g1.setNombre("Aragorn");
        g1.setNivel(10);

        PersonajeRPG g2 = (PersonajeRPG) registro.getClon("guerrero");
        g2.setNombre("Boromir");
        g2.setNivel(8);

        // Creamos un mago clonado
        PersonajeRPG m1 = (PersonajeRPG) registro.getClon("mago");
        m1.setNombre("Gandalf");
        m1.setNivel(50);

        // Resultados
        System.out.println("--- Personajes Creados vía Prototype ---");
        System.out.println(g1);
        System.out.println(g2);
        System.out.println(m1);
    }
}