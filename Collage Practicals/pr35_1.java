import java.applet.Applet;
import java.awt.Graphics;

public class pr35_1 extends Applet {

    // Initialization method
    public void init() {
        // Perform initialization tasks here
        System.out.println("Initializing applet...");
    }

    // Start method
    public void start() {
        // Start any threads or animations here
        System.out.println("Starting applet...");
    }

    // Stop method
    public void stop() {
        // Stop any activities here
        System.out.println("Stopping applet...");
    }

    // Destroy method
    public void destroy() {
        // Clean up resources here
        System.out.println("Destroying applet...");
    }

    // Paint method (required for rendering)
    public void paint(Graphics g) {
        // Draw graphics here
        g.drawString("Hello, World!", 20, 20);
    }
}

/*
  No Output Because:

    The Applet class has been deprecated since Java 9 and is marked for removal
    in future versions of Java. Instead of using Applets, modern Java
    applications typically use other technologies for user interface development,
    such as JavaFX for desktop applications or web frameworks like Spring Boot
    for web applications.
 */