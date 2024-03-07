package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * @author fran
 * @version 1.0
 */
public class Persona {
    private String name;
    private List<String> phones;

    /**
     * Recibe dos parametros de Contacto, el nombre y el telefono
     * @param name
     * @param phone
     */
    public Persona(String name, String phone) {
        this.setName(name);
        this.setPhones(new ArrayList<>());
        this.getPhones().add(phone);
    }

    /**
     * Metodo get que devuelve el nombre
     * @return
     */
    public String getName() {
        return this.name;
    }

    /**
     * Metodo get que devuelve los telefonos
     * @return
     */
    public List<String> getPhones() {
        return this.phones;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhones(List<String> phones) {
        this.phones = phones;
    }
}