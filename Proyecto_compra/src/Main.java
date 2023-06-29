import entidades.OrdenCompra;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        OrdenCompra orden1 = new OrdenCompra("Compra 1");
        OrdenCompra orden2 = new OrdenCompra("Compra 2");
        OrdenCompra orden3 = new OrdenCompra("Compra 3");

        System.out.println("id compra 1: " + orden1.getId());
    }
}