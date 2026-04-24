package modelos;

// PrototypeRegistry.java
import java.util.HashMap;
import java.util.Map;

public class PrototypeRegistry {
    private Map<String, IPrototype> prototipos = new HashMap<>();

    public PrototypeRegistry() {
        // Cargamos los modelos base iniciales
        PersonajeRPG guerreroBase = new PersonajeRPG("Base", "Guerrero", 1, 150, 50);
        PersonajeRPG magoBase = new PersonajeRPG("Base", "Mago", 1, 80, 150);
        PersonajeRPG arqueroBase = new PersonajeRPG("Base", "Arquero", 1, 100, 100);

        prototipos.put("guerrero", guerreroBase);
        prototipos.put("mago", magoBase);
        prototipos.put("arquero", arqueroBase);
    }

    public IPrototype getClon(String tipo) {
        IPrototype prototipo = prototipos.get(tipo.toLowerCase());
        if (prototipo != null) {
            return prototipo.clone();
        }
        return null;
    }
}