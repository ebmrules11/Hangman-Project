
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.Timer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ebmru
 */
public class ClockLabel extends JLabel implements ActionListener
    {
        
        SimpleDateFormat sdf;
        
        public ClockLabel ()
        {
            sdf = new SimpleDateFormat(" MMMM dd yyyy hh:mm:ss");
            
            setFont(new Font("comic sans", Font.PLAIN,12));
            setHorizontalAlignment(SwingConstants.LEFT);
            
            Timer t = new Timer(1000, this);
            t.start();
        }
        public void actionPerformed(ActionEvent ae)
        {
            Date d = new Date();
            setText(sdf.format(d));
        }
        
    }