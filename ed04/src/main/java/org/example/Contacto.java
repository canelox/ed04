package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * @author fran
 * @version 1.0
 */
class Contacto {
    private String name;
    private List<String> phones;

    /**
     * Recibe dos parametros de Contacto, el nombre y el telefono
     * @param name
     * @param phone
     */
    public Contacto(String name, String phone) {
        this.name = name;
        this.phones = new ArrayList<>();
        this.phones.add(phone);
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
}