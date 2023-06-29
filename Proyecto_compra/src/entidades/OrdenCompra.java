package entidades;

import java.util.Date;
import java.util.Scanner;

public class OrdenCompra {

    private int id;
    private String descripcion;
    private Date fecha;
    private Cliente cliente;
    private Producto[] productos;
    static int idPlus;

    public OrdenCompra() {
        this.id = ++idPlus;
    }

    public OrdenCompra(String descripcion) {
        this();
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Producto[] getProductos() {
        return productos;
    }

    public static int getIdPlus() {
        return idPlus;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Producto creadorProducto(int i) {
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el fabricante del producto " + (i+1) +":");
        String fabricante = input.next();
        System.out.println("Ingrese nombre del producto " + (i+1) +":");
        String nombre = input.next();
        System.out.println("Ingrese el precio del producto " + (i+1) +":");
        int precio = input.nextInt();
        return new Producto(fabricante, nombre, precio);
    }
    public void addProducto() {
        int j=0;
        System.out.println("Cargar los 4 productos");
        for (int i = 0; i < 4; i++) {
            do {
                System.out.println("Cargue los datos del producto " + (i+1) + ":");
                productos[i] = creadorProducto(i);
                if (i==0) {
                    j++;
                }
            } while ((productos[i].getNombre().equalsIgnoreCase(productos[j-1].getNombre())) && i !=0);
            j++;
        }

    }

    public int granTotal() {
        int sum=0;
        for (int i = 0; i < productos.length; i++) {
            sum += productos[i].getPrecio();
        }
        return sum;
    }
}
