
import javax.swing.JOptionPane;

public class figuras {

    public void cuadrado() {
        int lado, area;
        lado = Integer.parseInt(JOptionPane.showInputDialog("Digite el lado de cuadrado"));
        area = lado * lado;
        JOptionPane.showMessageDialog(null, "El area del cuadrado es: " + area);

    }

    public void triangulo() {
       float base, altura, area;
        base = Integer.parseInt(JOptionPane.showInputDialog("ingrese la base del triangulo"));
        altura = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la altura del triangulo"));
        area = (base * altura) / 2;
        JOptionPane.showMessageDialog(null, "El area del triagulo es: " + area);

    }

    public void circulo(){
    double area, radio, perimetro, diametro;
    diametro = Integer.parseInt(JOptionPane.showInputDialog("ingrese el diametro del circulo"));
    radio = diametro/2;
    area = 3.14 * Math.pow(radio, 2);
    perimetro = 2 * 3.14 * radio;
    JOptionPane.showMessageDialog(null, "El area del circulo es: " + area);
    JOptionPane.showMessageDialog(null, "El perimetro del circulo es: " + perimetro);
}
}
