import plotter.Graphic;
import plotter.Plotter;

public class Demo2 {
       public static void main(String[] args) {
             Graphic graphic = new Graphic("Demo_2");
             Plotter plotter = graphic.getPlotter();
             plotter.setXrange(-(Math.PI) * 1.1, (Math.PI) * 1.1);
             plotter.setXLine(0);
             plotter.setYLine(0);
             plotter.setAutoYgrid(0.25);
             double[] xgrid = {-Math.PI, -1, 0, 1, Math.PI};
             plotter.setXLabelFormat("%.2f");
             plotter.setXGrid(xgrid);
             for(double x = -Math.PI; x <= Math.PI; x += 0.001) {
                    plotter.add(x, Math.sin(x));
             }
             graphic.repaint();
       }
}
