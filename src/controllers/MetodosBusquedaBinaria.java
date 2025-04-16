package controllers;
import models.Persona;
import views.ShowConsole;

public class MetodosBusquedaBinaria {

    private Persona[] people;
    private ShowConsole pantalla;

    public MetodosBusquedaBinaria(Persona[]personas){
        this.people=personas;
        System.out.println("Clase MBB creada");
        this.pantalla = new ShowConsole();
        pantalla.ShowMessage("metodos busqueda binaria");

    }

    public int findPersonByCode(int code){

        int bajo=0;
        int alto=(people.length-1);
        while (bajo<=alto) {
            int central=bajo +(alto-bajo)/2;

            if(people[central].getCode()==code){
                return central;
            }
            if(people[central].getCode()<code){
                bajo=central+1;

            } else{
                alto= central-1;
            }
        }
        return -1;
    }

    public void showPersonByCode(){
        int codeToFind =pantalla.getCode();
        int indexPerson= findPersonByCode(codeToFind);

        if (indexPerson== -1){
            pantalla.ShowMessage("NO hay persona en el codigo");
        }else{
            pantalla.ShowMessage("Persona con codigo "+ codeToFind+"encontrada")  ;
            pantalla.ShowMessage(people[indexPerson].toString());     
         }
    }


    private int findPersonByName(String name){
        return -1;


    }

    public void showPersonByName(){
        
    }

}   


