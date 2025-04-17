import controllers.BusquedaPorNombre;
import controllers.MetodosBusquedaBinaria;
import controllers.metodosBusqueda;
import models.Persona;

public class Main {
    
    
    public static void main(String[] args) throws Exception {

        Persona[] personas = new Persona[7];
        personas [0] = new Persona (101, "Juan");
        personas [1] = new Persona (102, "Maria");
        personas [2] = new Persona (103, "Carlos");
        personas [3] = new Persona (104, "Ana");
        personas [4] = new Persona (105, "Luis");
        personas [5] = new Persona (106, "Sofia");
        personas [6] = new Persona (107, "Pedro");
        //metodosBusqueda mB= new metodosBusqueda(personas);

        MetodosBusquedaBinaria mBB= new MetodosBusquedaBinaria(personas);
        mBB.showPersonByCode();

        
    

        BusquedaPorNombre buscador = new BusquedaPorNombre(personas);

        buscador.showPersonByName();

    }
    
}
