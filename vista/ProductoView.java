package vista;

import java.awt.*; // Importar Swing para crear componentes gráficos.
import java.awt.event.ActionListener; // Importar AWT para manejar dimensiones y layout.
import javax.swing.*; // Importar ActionListener para manejar eventos.

public class ProductoView {
    private JFrame frame;                // Ventana principal de la aplicación.
    private JTextField txtNombre;        // Campo de texto para el nombre del producto.
    private JTextField txtPrecio;        // Campo de texto para el precio del producto.
    private JTextField txtCantidad;      // Campo de texto para la cantidad en stock del producto.
    private JTextField txtCategoria;     // Campo de texto para la categoría del producto.
    private JButton btnActualizar;       // Botón para actualizar el producto.
    private JLabel lblResultado;         // Etiqueta para mostrar el resultado.

    public ProductoView() {
        frame = new JFrame(" Gestión de Productos"); // Configurar título de la ventana principal.
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Cerrar aplicación al cerrar ventana.
        frame.setSize(400, 300); // Establecer tamaño de la ventana.

        JPanel panel = new JPanel(); // Crear un panel para organizar los componentes.
        panel.setLayout(new GridLayout(6, 2)); // Usar un layout en cuadrícula con 6 filas y 2 columnas.

        // Agregar etiquetas y campos de texto al panel:
        panel.add(new JLabel(" Nombre:")); 
        txtNombre = new JTextField(); 
        panel.add(txtNombre);

        panel.add(new JLabel(" Precio:")); 
        txtPrecio = new JTextField(); 
        panel.add(txtPrecio);

        panel.add(new JLabel(" Cantidad en Stock:")); 
        txtCantidad = new JTextField(); 
        panel.add(txtCantidad);

        panel.add(new JLabel(" Categoría:")); 
        txtCategoria = new JTextField(); 
        panel.add(txtCategoria);

        btnActualizar = new JButton(" Actualizar Producto"); // Crear botón para actualizar datos del producto.

        panel.add(btnActualizar); // Agregar botón al panel.

        lblResultado = new JLabel(""); // Inicializar etiqueta para mostrar resultados actualizados.
        panel.add(lblResultado); 

        frame.add(panel); // Agregar panel a la ventana principal.

        frame.setVisible(true); // Hacer visible la ventana principal.
    }

    // Métodos para obtener los datos ingresados por el usuario:
    
    public String getNombre() {
        return txtNombre.getText(); // Obtener el texto ingresado en el campo nombre.
    }

    public double getPrecio() {
        return Double.parseDouble(txtPrecio.getText()); // Obtener y convertir el texto ingresado a double (precio).
    }

    public int getCantidad() {
        return Integer.parseInt(txtCantidad.getText()); // Obtener y convertir el texto ingresado a int (cantidad).
    }

    public String getCategoria() {
        return txtCategoria.getText(); // Obtener el texto ingresado en el campo categoría.
    }

    public void addActualizarListener(ActionListener listener) {
        btnActualizar.addActionListener(listener); // Agregar listener al botón actualizar para manejar eventos de clics.
    }

    public void mostrarResultado(String mensaje) {
        lblResultado.setText(mensaje); // Mostrar mensaje actualizado en la etiqueta resultado.
    }
}