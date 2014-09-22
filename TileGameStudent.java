import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;
import info.gridworld.world.World;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.io.*;
import java.net.URL;
import javax.sound.sampled.*;


import java.awt.Color;

public class TileGameStudent extends World<Tile>
{
  int score = 0;
  int turns = 0;
   public TileGameStudent()
   {
      Color[] colors = 
         { 
            Color.RED, Color.BLUE, Color.GREEN, Color.CYAN,
            Color.PINK, Color.ORANGE, Color.GRAY, Color.MAGENTA,
            Color.YELLOW
         };
      for (Color color : colors)
      {
         add(getRandomEmptyLocation(), new Tile(color));
         add(getRandomEmptyLocation(), new Tile(color));
         
         add(getRandomEmptyLocation(), new Tile(color));
         add(getRandomEmptyLocation(), new Tile(color));
      }
      setMessage("Click on the first tile           Turns = " +turns+"           Score = " +score);
      first = true;
      
   }

   public boolean locationClicked(Location loc)
   {
      Grid<Tile> gr = getGrid();
      Tile t = gr.get(loc);
      if (t != null) 
      { 
         t.flip(); 
         if (first)
         {
            if (firstTile != null) 
            {
               firstTile.flip();
               secondTile.flip();
               turns++;
            }
            firstTile = t;
            setMessage("Click on the second tile           Turns = " +turns+"           Score = " +score);
            first = false;
         }
         else
         {            
            if (firstTile.getColor().equals(t.getColor()))
            {               
               firstTile = secondTile = null;
               Sound.MATCH.play();
               score++;
               
            }
            else
            {
              secondTile = t;  
              Sound.MISMATCH.play();
            }
               
            setMessage("Click on the first tile           Turns = " +turns+"           Score = " +score);
            first = true;
         }
         if (score >= 19)
         {
           setMessage("YOU WIN!!!");
           Sound.WIN.play();
         }
      }
      return true;      
   }
   
   public boolean keyPressed(String description, Location loc)
   {
       if (description.equals("SPACE"))      
           return locationClicked(loc);
       else
           return false;
   }
   
   public static void main(String[] args)
   {
      new TileGameStudent().show();
   }
   
   private Tile firstTile;
   private Tile secondTile;
   private boolean first;
}
