package Frontend.Button;

import Frontend.Utils.IconProcessor;

import javax.swing.*;
import java.awt.*;

/**
 * A class to create the restart button in the game, which is used to restart the game of Nine Men's Morris.
 */
public class BtnRestart extends JButton {
    /**
     * Constructor.
     * Creates a restart button in the game.
     */
    public BtnRestart(){
        this.setFocusable(false); // get rid of the annoying box in button
        ImageIcon iconRestart = new ImageIcon(getClass().getResource("/Icons/restart.png"));

        // Resize the icon
        IconProcessor icon = new IconProcessor(iconRestart, 60, 60);
        ImageIcon resizedIcon = icon.resizeIcon();
        this.setIcon(resizedIcon);

        this.setBackground(new Color(0xE6B380));
        this.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.BLACK));

    }
}
