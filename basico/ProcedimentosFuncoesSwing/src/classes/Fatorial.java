
package classes;

public class Fatorial {
    
    private int num = 0;
    private int fat = 1;
    private String formula = "";
    
    public void setValor(int n){
        int f = 1;
        num = n;
        String s = "";
        for (int c = n; c > 1; c--) { // conta de tras para frente
            f = f * c;
            s = s + c + " x ";
        }
        s = s + "1 = ";
        fat = f;
        formula = s;
    }
    
    public int getFatorial (){
        return fat;
    }
    
    public String getFormula(){
        return formula;
    }
}