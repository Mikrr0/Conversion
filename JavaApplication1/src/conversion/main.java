package conversion;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        
        System.out.println("Ingrese el monto que desea convertir (pesos chilenos)");
        Scanner pc = new Scanner(System.in);
        int peso_cl = pc.nextInt();
        System.out.println("Ingrese el valor del dolar");
        Scanner d = new Scanner(System.in);
        int dolar = d.nextInt();
        System.out.println("Ingrese el valor del peso argentino");
        Scanner pa = new Scanner(System.in);
        int peso_arg = pa.nextInt();
        System.out.println("Ingrese el valor del euro");
        Scanner e = new Scanner(System.in);
        int euro = e.nextInt();
        
        
        
        Convertir moneda = new Convertir(peso_cl, dolar, peso_arg, euro);
        moneda.conv();
        


    }
    
}
