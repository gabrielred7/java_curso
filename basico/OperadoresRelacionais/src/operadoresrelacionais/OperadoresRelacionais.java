
package operadoresrelacionais;

public class OperadoresRelacionais {

    public static void main(String[] args) {
            int n1, n2, r1, r2 ;
            n1 = 4;
            n2 = 8;
            r1 = (n1 > n2) ? 0:1;
            r2 = (n1 >n2) ? n1+ n2: n1-n2;
            System.out.println(r1);
            System.out.println(r2);
            
            //ComparandoStrings
            
            String nome1 = "Gustavo";
            String nome2 = "Gustavo";
            String nome3 = new String("Gustavo");
            String res1, res2, res3;
            res1 = (nome1 == nome2) ? "igual" : "diferente";
            System.out.println(res1);
            res2 = (nome2 == nome3) ? "igual" : "diferente";
            System.out.println(res2);
            res3 = (nome1.equals(nome3)) ? "igual" : "diferente";
            System.out.println(res3);
                       
    } 
}