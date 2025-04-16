package controllers;

import models.Persona;
import views.ShowConsole;

public class metodosBusqueda{

    private int [] arreglo;
    private ShowConsole showConsole;
    private Persona[] people;

    public metodosBusqueda(Persona[] persons){
        this.showConsole= new ShowConsole();
        this.people= persons;
        showPersonByCode();
    }

    public int busquedaLineal (int[] arreglo, int valorBuscado){
        this.arreglo= arreglo;
        for (int i=0; i < arreglo.length; i++){
            if (arreglo[i]==valorBuscado)
                return i;
            
        }
        return -1;
    }

    public int findPersonByCode(int code){
        for(int i=0; i<people.length; i++){            
        if (people[i].getCode()== code){
                return i;
            }
        }
        return -1;
    }

    public void showPersonByCode(){
        int codeToFind =showConsole.getCode();
        int indexPerson=findPersonByCode(codeToFind);
        if(indexPerson>= 0){
            showConsole.ShowMessage("Persona Encontrada");
            showConsole.ShowMessage(people[indexPerson].toString());

        }else{
            showConsole.ShowMessage("persona con codigo"+codeToFind+"persona no ecnotrada");
        }

    }
}

