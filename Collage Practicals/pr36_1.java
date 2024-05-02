import java.applet.Applet;
import java.awt.Graphics;
import java.util.Timer;
import java.util.TimerTask;

public class pr36_1 extends Applet {
    String message = "Moving Banner";
    int x = 10; // Default x-coordinate

    public void init() {
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            public void run() {
                x += 10; // Move the banner 10 pixels to the right every second
                repaint(); // Refresh the applet's display
            }
        }, 0, 1000); // Delay 0 milliseconds, repeat every 1 second
    }

    public void paint(Graphics g) {
        g.drawString(message, x, 50); // Draw the banner at the current x-coordinate
    }
}
