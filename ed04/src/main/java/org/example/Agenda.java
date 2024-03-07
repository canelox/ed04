package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *Esta clase sirve para representar las caracteristicas de Agenda
 * @version 1.0
 * @since 2024
 * @author fran
 */
public class Agenda implements IAgenda {
    private List<Persona> contacts; // Lista de Contacto

    /**
     *
     * @return Crea en Agenda donde se almacenaran los contactos
     */
    public Agenda() {
        this.contacts = new ArrayList<>();
    }

    /**
     *Recibe dos parametros tipo String de nombre y telefono
     * @param name
     * @param phone
     */
    public void addContact(String name, String phone) {
        boolean exists = false;
        for (Persona c : contacts) {
            if (c.getName().equalsIgnoreCase(name)) {
                exists = true;
                c.getPhones().add(phone);
                break;
            }
        }

        if (!exists) {
            Persona newContact = new Persona(name, phone);
            contacts.add(newContact);
        }
    }

    /**
     * Recibe nombre como parametro u sirve para eliminar un contacto
     * @param name
     */
    public void removeContact(String name) {
        Iterator<Persona> it = contacts.iterator();

        while (it.hasNext()) {
            Persona c = it.next();

            if (c.getName().equalsIgnoreCase(name)) {
                it.remove();
            }
        }
    }

    /**
     * Recibe 3 oarametros: Nombre, oldPhone y newPhone para modificar el numero de Telefono
     * @param name
     * @param oldPhone
     * @param newPhone
     */
    public void modifyPhoneNumber(String name, String oldPhone, String newPhone) {
        for (Persona c : contacts) {
            if (c.getName().equalsIgnoreCase(name)) {
                List<String> phones = c.getPhones();

                int index = phones.indexOf(oldPhone);

                if (index != -1) {
                    phones.set(index, newPhone);
                }
            }
        }
    }

    /**
     * Metodo get para obtener los contactos
     * @return
     */
    public List<Persona> getContacts() {
        return this.contacts;
    }
}