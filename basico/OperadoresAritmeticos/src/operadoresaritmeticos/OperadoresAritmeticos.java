
package operadoresaritmeticos;
        
public class OperadoresAritmeticos {

    public static void main(String[] args) {
        int n1 = 3;
        int n2 = 5;
        float m = n1 + n2 /2;
        System.out.println("A media é igual e: " + m);
        
        int num = 5;
        int val = 5 + num++;
        System.out.println(val);
        
        int x = 4;
        x += 2;
        System.out.println(x);
        
        float v = 8.5f;
        int ar = (int) Math.round(v);
        System.out.println(ar);
        
        double gerar = Math.random();
        int  aleatorio = (int)  (1 +  gerar * (10 - 1));
        System.out.println(aleatorio);

    }
}