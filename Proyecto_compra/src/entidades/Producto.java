package entidades;

public class Producto {

    private String fabricante, nombre;
    private int precio;

    public Producto(String fabricante, String nombre, int precio) {
        this.fabricante = fabricante;
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "fabricante='" + fabricante + '\'' +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }
}
