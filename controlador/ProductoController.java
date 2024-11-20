package controlador;

import modelo.Producto;          // Importar clase Producto del modelo.
import vista.ProductoView;      // Importar clase ProductoView de vista.

import java.awt.event.ActionEvent;  // Importar ActionEvent para manejar eventos de acción.
import java.awt.event.ActionListener;  // Importar ActionListener para manejar eventos.

public class ProductoController {
    
    private Producto modelo;       // Referencia al modelo de datos (Producto).
    private ProductoView vista;     // Referencia a la vista (ProductoView).

    public ProductoController(Producto modelo, ProductoView vista) {
        this.modelo = modelo;       // Inicializar modelo con el objeto recibido como parámetro.
        this.vista = vista;         // Inicializar vista con el objeto recibido como parámetro.

        this.vista.addActualizarListener(new ActualizarListener());  // Agregar listener al botón "Actualizar Producto".
    }
    
    class ActualizarListener implements ActionListener {  // Clase interna que implementa ActionListener.

        @Override
        public void actionPerformed(ActionEvent e) {  // Método que se ejecuta al hacer clic en el botón "Actualizar Producto".
            String nombre = vista.getNombre();           // Obtener nombre desde la vista.
            double precio = vista.getPrecio();           // Obtener precio desde la vista.
            int cantidad = vista.getCantidad();           // Obtener cantidad desde la vista.
            String categoria = vista.getCategoria();      // Obtener categoría desde la vista.

            modelo.setNombre(nombre);                     // Actualizar nombre en el modelo.
            modelo.setPrecio(precio);                     // Actualizar precio en el modelo.
            modelo.setCantidadStock(cantidad);            // Actualizar cantidad en stock en el modelo.
            modelo.setCategoria(categoria);               // Actualizar categoría en el modelo.

            String resultado = "Producto actualizado:\n" + 
                               "Nombre: " + modelo.getNombre() + "\n" +
                               "Precio: " + modelo.getPrecio() + "\n" +
                               "Cantidad en Stock: " + modelo.getCantidadStock() + "\n" +
                               "Categoría: " + modelo.getCategoria();
            vista.mostrarResultado(resultado);             // Mostrar resultado actualizado en la vista.  
         }
     }
}