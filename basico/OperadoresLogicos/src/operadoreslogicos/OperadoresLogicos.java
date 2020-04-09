
package operadoreslogicos;

public class OperadoresLogicos {

    public static void main(String[] args) {
        int x = 4;
        int y = 7;
        int z = 12;
        boolean r = (x < y && y < z) ? true:false;
        boolean s = (x > y || y > z) ? true:false;
        System.out.println(r + ", " + s);
    }
}