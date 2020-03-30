import plotter.Graphic;
import plotter.Plotter;

public class Demo1 {
       public static void main(String[] args) {
             Graphic graphic = new Graphic("Demo_1");
             Plotter plotter = graphic.getPlotter();
             for(double x = -Math.PI; x <= Math.PI; x += 0.001) {
                    plotter.add(Math.sin(x));
             }
             graphic.repaint();
       }
}
