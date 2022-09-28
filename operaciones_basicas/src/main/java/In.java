import java.util.Scanner;

public class In {
    public int[] infinito() {
        Scanner input = new Scanner(System.in);
        int num[];
        num = new int[200];
        System.out.println("Inserte los numeros (Escriba '0' para ejecutar)");
        num[0] = input.nextInt();
        for(int i = 1; (num[i] = input.nextInt()) != 0; ++i) {
            
        } 
        return num;
    }
    
    public int[] ampliar(int num[], int add, int i) {
        int output[];
        output = new int[200];
        output = num;
        output[i + 1] = add;
        return output;
    }
}
