import java.awt.*;
import java.applet.*;

public class EigenApplet2 extends Applet {

    public void init() {
        setBackground(Color.WHITE);

    }

    public void paint(Graphics g) {
        g.setColor(Color.BLUE);
        g.drawString("Thomas", 50, 60);

        g.setColor(Color.red);
        g.drawString("Rasegfar", 50, 80);
    }
}
