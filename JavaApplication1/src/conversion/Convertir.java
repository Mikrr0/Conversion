package conversion;

public class Convertir {

    private int peso_cl;
    private int dolar;
    private int peso_arg;
    private int euro;
    
    public Convertir(int peso_cl, int dolar, int peso_arg, int euro){
        this.peso_cl = peso_cl;
        this.dolar = dolar;
        this.peso_arg = peso_arg;
        this.euro = euro;
    }

    public int getPeso_cl() {
        return peso_cl;
    }
    public int getDolar() {
        return dolar;
    }
    public int getPeso_arg() {
        return peso_arg;
    }
    public int getEuro() {
        return euro;
    }
     
    public void setPeso_cl(int peso_cl) {
        this.peso_cl = peso_cl;
    }
    public void setDolar(int dolar) {
        this.dolar = dolar;
    }
    public void setPeso_arg(int peso_arg) {
        this.peso_arg = peso_arg;
    }
    public void setEuro(int euro) {
        this.euro = euro;
    }
    
    public void conv(){
        int clToDolar = this.peso_cl / this.dolar;
        int clToArg = this.peso_cl / this.peso_arg;
        int clToEuro = this.peso_cl / this.euro;
        
        System.out.println("Monto ingresado $"+peso_cl+" pesos chilenos");
        System.out.println("$"+clToDolar+" dólares");
        System.out.println("$"+clToArg+" pesos argentinos");
        System.out.println("€"+clToEuro+" euros");
    }
}
