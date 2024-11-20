package vista;

import java.awt.*;          // Importar Swing para crear componentes gráficos.
import javax.swing.*;            // Importar AWT para manejar dimensiones y gráficos.

// Clase que representa un panel gráfico que muestra un gráfico de barras basado en las cantidades de productos ingresadas por el usuario.
public class BarChartPanel extends JPanel {

    private int[] cantidades;  // Arreglo que almacena las cantidades de productos.

    public BarChartPanel(int[] cantidades) { 
        this.cantidades = cantidades;  // Inicializar con las cantidades proporcionadas por el controlador o usuario. 
    }

    @Override
    protected void paintComponent(Graphics g) { 
        super.paintComponent(g);  // Llamar al método padre para limpiar el área antes de dibujar.

        Graphics2D g2d = (Graphics2D) g;
        
        int maxHeight = 200;      // Altura máxima del gráfico (en píxeles).
        int barWidth = 50;      	// Ancho de cada barra (en píxeles).

		// Dibujar cada barra basada en las cantidades proporcionadas:
		for (int i = 0; i < cantidades.length; i++) { 
            int height = (int)((cantidades[i] / 100.0) * maxHeight); 
            g2d.fillRect(i * (barWidth + 10), maxHeight - height, barWidth, height); 
            g2d.drawString(String.valueOf(cantidades[i]), i * (barWidth + 10), maxHeight - height - 5);
            g2d.drawString("Producto " + (i + 1), i * (barWidth + 10), maxHeight + 15); 
            /* Dibujar cada barra y su respectiva etiqueta con la calificación correspondiente. */
		}

		g2d.drawLine(0, maxHeight, getWidth(), maxHeight);  
		// Dibujar línea del eje X en el gráfico.  
	}
}