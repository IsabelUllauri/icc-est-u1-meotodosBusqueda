package views;
import java.util.Scanner;

public class ShowConsole {
    private Scanner scanner = new Scanner(System.in);

    public void ShowMenu(){
        System.out.println("Metodo Busqueda: ");
    }

    public int getCode(){
        System.out.println("ingrese codigo: ");
        int codigo = scanner.nextInt();
        System.out.println("Codigo ingresado ");
        return codigo;
 
    }

    public void ShowMessage(String message){
        System.out.println(message);
    }

    public String getName (){
        System.out.print("Ingrese el nombre: ");
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();

    }
}
