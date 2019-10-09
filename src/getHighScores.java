
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ebmru
 */
public class getHighScores extends JLabel// implements ActionListener
{
    File temp;
    Scanner file;
    String highScoreList;

    public getHighScores(){
      temp = new File("BangarMartinez_Pabian_Hangman/src/highScores.TXT");
      Scanner file = null;
      String name1 = null;
      String score1 = null;
      String name2 = null;
      String score2 = null;
      String name3 = null;
      String score3 = null;
      String name4 = null;
      String score4 = null;
      String name5 = null;
      String score5 = null;
      String newLine = null;
      String dots = null;
        try {
            file = new Scanner(temp);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(getHighScores.class.getName()).log(Level.SEVERE, null, ex);
        }
      while(file.hasNext())
      {
          name1 = (file.next());
          score1 = (file.next());
          name2 = (file.next());
          score2 = (file.next());
          name3 = (file.next());
          score3 = (file.next());
          name4 = (file.next());
          score4 = (file.next());
          name5 = (file.next());
          score5 = (file.next());
          newLine = "\n";
          dots = "...";
          
          
          
      }
      highScoreList = name1 + dots + score1 + newLine + name2 + dots + score2 + newLine + name3 + dots + score3 + newLine + name4 + dots + score4 + newLine + name5 + dots + score5 + newLine;
      setFont(new Font("comic sans", Font.PLAIN,12));
      setHorizontalAlignment(SwingConstants.LEFT);
      setText(highScoreList);
    }
  
  //public void actionPerformed(ActionEvent ae)
       // {
            
       // }
    
}
