import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);         //Creacion de variable para imputs
        System.out.println("Inserte la accion que quiere realizar con su respectivo número:");  
        System.out.println("1 - Sumar");            
        System.out.println("2 - Restar");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - Dividir");
        int num = input.nextInt(), result;                      //Input de la acción
        In rec = new In();
        Operaciones oper = new Operaciones();
        int lista[];
        switch (num) {
            case 1:
                lista = rec.infinito();
                result = oper.suma(lista);
                System.out.println("Resultado: " + result);
                break;
            case 2:
                lista = rec.infinito();
                result = oper.resta(lista);
                System.out.println("Resultado: " + result);
                break;
            case 3:
                lista = rec.infinito();
                result = oper.mult(lista);
                System.out.println("Resultado: " + result);
                break;
            case 4:
                System.out.println("Inserte el primer operador: ");
                int oper1 = input.nextInt();  
                System.out.println("Inserte el segundo operador: ");
                int oper2 = input.nextInt();
                while(oper2 == 0) {
                    System.out.println("No se puede dividir por 0. Inserte un número válido");
                    oper2 = input.nextInt();
                }
                result = oper.div(oper1, oper2);
                System.out.println("Resultado: " + result);
                break;
            default:
                System.out.println("Esa no es una operación válida (idiota solo eran cuatro números)");
                break;
        }   
    }
}
