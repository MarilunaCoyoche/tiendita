package modelo;

// Clase que representa un producto en la tienda.
public class Producto {
    private String nombre;       // Nombre del producto.
    private double precio;       // Precio del producto.
    private int cantidadStock;   // Cantidad disponible en stock.
    private String categoria;     // Categoría del producto.

    // Constructor para inicializar los atributos del producto.
    public Producto(String nombre, double precio, int cantidadStock, String categoria) {
        this.nombre = nombre; // Asignar nombre.
        this.precio = precio; // Asignar precio.
        this.cantidadStock = cantidadStock; // Asignar cantidad en stock.
        this.categoria = categoria; // Asignar categoría.
    }

    // Métodos getter y setter para acceder y modificar los atributos.

    public String getNombre() {
        return nombre; // Retorna el nombre del producto.
    }

    public void setNombre(String nombre) {
        this.nombre = nombre; // Establece el nombre del producto.
    }

    public double getPrecio() {
        return precio; // Retorna el precio del producto.
    }

    public void setPrecio(double precio) {
        this.precio = precio; // Establece el precio del producto.
    }

    public int getCantidadStock() {
        return cantidadStock; // Retorna la cantidad en stock.
    }

    public void setCantidadStock(int cantidadStock) {
        this.cantidadStock = cantidadStock; // Establece la cantidad en stock.
    }

    public String getCategoria() {
        return categoria; // Retorna la categoría del producto.
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria; // Establece la categoría del producto.
    }
}