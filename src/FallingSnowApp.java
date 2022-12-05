import de.ur.mi.oop.app.GraphicsApp;
import de.ur.mi.oop.colors.Colors;
import de.ur.mi.oop.launcher.GraphicsAppLauncher;

public class FallingSnowApp extends GraphicsApp {
    private static final int CANVAS_HEIGHT = 800;
    private static final int CANVAS_WIDTH = 800;
    public static final int FRAMERATE = 60;

    @Override
    public void initialize() {
        setupCanvas();
    }

    @Override
    public void draw() {

    }

    private void setupCanvas() {
        setCanvasSize(CANVAS_WIDTH, CANVAS_HEIGHT);
        drawBackground(Colors.WHITE);
        setFrameRate(FRAMERATE);
    }

    public static void main(String[] args) {
        GraphicsAppLauncher.launch();
    }
}