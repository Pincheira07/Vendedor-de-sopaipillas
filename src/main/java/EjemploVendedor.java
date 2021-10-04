public class EjemploVendedor {
    public static void main(String[] args) {
        VendedorSopaipillas miVendedor = new VendedorSopaipillas("Luis Perez", "Sopaipletos");
        System.out.println(miVendedor.getCantSopaipillas());
        miVendedor.venderSopaipillas(100);
        System.out.println(miVendedor.getDinero());
        System.out.println(miVendedor.getCantSopaipillas());
    }
}
