import java.util.InputMismatchException;
import java.util.Scanner;

public class VendedorSopaipillas {
    private String nombre;
    private String nombreCarrito;
    private int cantSopaipillas;
    private int dineroTotal;
    private int dineroVenta;

    public VendedorSopaipillas(String nombre, String nombreCarrito, int dineroTotal) {
        this.nombre = nombre;
        this.nombreCarrito = nombreCarrito;
        this.dineroTotal =dineroTotal;
        hacerSopaipillas();


    }

    public void hacerSopaipillas() {
        int cantidad = -1;
        while (!validarNumeroSopaipillas(cantidad)){
            System.out.println("Sopaipillas a hacer: ");
            cantidad =leerCantidadSopaipillas();
        }
        setCantSopaipillas(cantidad);


    }

    public int leerCantidadSopaipillas(){
        int cantidad = 0;
        Scanner input = new Scanner(System.in);
        try {
            cantidad = input.nextInt();
        }catch (InputMismatchException e){
            input.next();
            System.out.println("Valor invalido");


        }
        return cantidad;
    }

    public boolean validarNumeroSopaipillas(int cantidad){
        return 0 < cantidad && cantidad < 300;
    }


    private void setCantSopaipillas(int cantSopaipillas) {
        this.cantSopaipillas = cantSopaipillas;
    }

    public int realizarVenta(){
        int cantidad = -1;
        while (!validarSopaipillasVenta(cantidad)){
            System.out.println("¿Cuantas sopaipillas quiere comprar? ");
            cantidad = leerCantidadSopaipillas();
        }
        return cantidad;

    }

    public void cobrar(){
        System.out.println("El valor final es: " + this.dineroVenta);
        int pago = this.dineroVenta-1;
        while (!validarPago(pago)){
            System.out.println("Pagar: ");
            pago = leerPago();
        }
        recibirPago(pago);

    }

    public void recibirPago(int pago){
        if (pago==this.dineroVenta){
            this.dineroTotal = this.dineroTotal + this.dineroVenta;
        }
        else{
            this.dineroTotal = this.dineroTotal + this.dineroVenta;
            System.out.println("Su vuelto es: " + (pago-this.dineroVenta));

        }
    }

    public int leerPago(){
        int pago = 0;
        Scanner input = new Scanner(System.in);
        try {
            pago = input.nextInt();
        }catch (InputMismatchException e){
            input.next();
            System.out.println("Valor invalido");
        }
        return pago;
    }

    public boolean validarPago(int pago){
        return this.dineroVenta<=pago && pago<this.dineroTotal;
    }

    public boolean validarSopaipillasVenta(int cantidad){
        return 0<cantidad && cantidad<this.cantSopaipillas;
    }

    public void venderSopaipillas(int cant){
        calcularValorVenta(cant);
        setCantSopaipillas(getCantSopaipillas()-cant);

    }

    public int calcularValorVenta(int cantidad){
        int precioSopaipillas = 500;
        return this.dineroVenta = precioSopaipillas*cantidad;
    }

    public void setDinero(int dineroTotal) {
        this.dineroTotal = dineroTotal;
    }

    public int getCantSopaipillas() {
        return cantSopaipillas;
    }

    public int getDinero(){
        return dineroTotal;
    }

    public void setDineroVenta(int dineroVenta) {
        this.dineroVenta = dineroVenta;
    }
}
