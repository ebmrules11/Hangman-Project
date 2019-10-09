
import java.awt.Component;
import java.awt.Graphics2D;
import java.awt.Window;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ebmru
 */
public class KeyPresser implements KeyListener
{
    JOptionPane F1Pane = new JOptionPane();
    private final JPanel panel;

    KeyPresser(JPanel parentPanel) {
        this.panel = parentPanel;
    }
    public void keyPressed(KeyEvent e)
    {
        int keyCode = e.getKeyCode();
        if(keyCode == KeyEvent.VK_ESCAPE)
        {
            System.exit(0);
        }
        if(keyCode == KeyEvent.VK_F1)
        {
        F1Pane.showMessageDialog(null,"Ethan Bangar-Martinez: 011923873 /n Raul Pabian: 011993813","A plain message",JOptionPane.PLAIN_MESSAGE);
        panel.add(F1Pane);
        }
        else
        {
            e.consume();
        }
    }
    
    @Override
    public void keyReleased(KeyEvent e)
    {
        panel.remove(F1Pane);
        e.consume();
    }
    
    /**
     *
     * @param e
     */
    @Override
    public void keyTyped(KeyEvent e)
    {
        e.consume();
    }
    
    
    
    
}
