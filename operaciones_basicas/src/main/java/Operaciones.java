
public class Operaciones {
    public int suma(int num[]) {
        int result = 0;
        for(int i = 0; num[i] != 0; i++){
           result = result + num[i];
        }
        return result;
    }
    
    public int resta(int num[]) {
        int result = num[0];
        for(int i = (1); num[i] != 0; i++){
           result = result - num[i];
        }
        return result;
    } 
    
    public int mult(int num[]) {
        int result = num [0];
        for(int i = (1); num[i] != 0; i++){
           result = result * num[i];
        }
        return result;
    }
    
    public int div(int oper1, int oper2) {
        int result = oper1 / oper2;
        return result; 
    }
}
