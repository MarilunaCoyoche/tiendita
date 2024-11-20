import controlador.ProductoController;  // Importar controlador de productos.
import modelo.Producto;                   // Importar modelo de productos. 
import vista.ProductoView;                 // Importar vista de productos. 

public class AppTienda { 

    public static void main(String[] args) {   // Método principal donde se inicia la aplicación. 
        Producto modelo = new Producto("", 0.0, 0, "");   // Crear un nuevo objeto Producto vacío inicialmente.    
        ProductoView vista = new ProductoView();          // Crear una nueva instancia de ProductoView (interfaz gráfica).           
        ProductoController controlador = new ProductoController(modelo, vista);   // Crear controlador con modelo y vista.    
    } 
}