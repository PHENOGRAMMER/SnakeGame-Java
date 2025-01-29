import javax.swing.*;

public class GameFrame extends JFrame {

    private static final long serialVersionUID = 1L;

    GameFrame() {
        // Create an instance of GamePanel
        GamePanel gamePanel = new GamePanel();

        // Add the GamePanel to the frame
        this.add(gamePanel);

        // Set the title of the frame
        this.setTitle("Snake Game");

        // Set the default close operation
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Make the frame not resizable
        this.setResizable(false);

        // Pack the frame to fit the preferred size of its components
        this.pack();

        // Make the frame visible
        this.setVisible(true);

        // Center the frame on the screen
        this.setLocationRelativeTo(null);

    }
}