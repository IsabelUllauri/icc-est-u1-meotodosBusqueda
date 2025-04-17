package controllers;

import models.Persona;
import views.ShowConsole;




public class BusquedaPorNombre {

    private Persona[] people;
    private ShowConsole pantalla;

    public BusquedaPorNombre(Persona[] personas) {
        this.people = personas;
        this.pantalla = new ShowConsole();
        pantalla.ShowMessage("Métodos de búsqueda por nombre");
    }

    private int findPersonByName(String name) {
        int bajo = 0;
        int alto = people.length - 1;

        while (bajo <= alto) {
            int central = bajo + (alto - bajo) / 2;
            String centralName = people[central].getName();
            int comparacion = centralName.compareTo(name);

            if (comparacion == 0) {
                return central;
            } else if (comparacion < 0) {
                bajo = central + 1;
            } else {
                alto = central - 1;
            }
        }

        return -1;
    }

    public void showPersonByName() {
        ordenarPorNombre(); // Aseguramos que esté ordenado antes de buscar
        String nameToFind = pantalla.getName(); 
        int indexPerson = findPersonByName(nameToFind);
    
        if (indexPerson == -1) {
            pantalla.ShowMessage("No hay persona con el nombre: " + nameToFind);
        } else {
            pantalla.ShowMessage("Persona con nombre " + nameToFind + " encontrada:");
            pantalla.ShowMessage(people[indexPerson].toString());
      
        }
    }

    private void ordenarPorNombre() {
        for (int i = 0; i < people.length - 1; i++) {
            for (int j = 0; j < people.length - i - 1; j++) {
                String nombreActual = people[j].getName();
                String nombreSiguiente = people[j + 1].getName();
    
                if (nombreActual.compareTo(nombreSiguiente) > 0) {
                    // Intercambio (swap)
                    Persona temp = people[j];
                    people[j] = people[j + 1];
                    people[j + 1] = temp;
                }
            }
        }
        System.out.println();
    }
    
}

