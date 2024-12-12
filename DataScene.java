import org.code.theater.*;
import org.code.media.*;

/**
 * Represents a Scene to be played in the Theater using data from
 * a choses dataset
 */
public class DataScene extends Scene {


    private Music[] musicArray;   // 1D array of Person objects


    /** Constructor */
    public DataScene() {
        musicArray = createMusic();
    }

    /** Returns a 1D array of Person objects using the txt files in this project */
    public Music[] createMusic() {
        String[] albums = FileReader.toStringArray("albums.txt");
        String[] artists = FileReader.toStringArray("artists.txt");
        String[] genres = FileReader.toStringArray("genres.txt"); 

       Music[] musicArray = new Music[albums.length];
       for (int i = 0; i < musicArray.length; i++) {
         musicArray[i] = new Music( albums[i], artists[i], genres[i]);
      }
      return musicArray;
    }


    /**
   * Top-level method to draw the picture
   */
    public void drawScene() {
      int randomIndex = (int) (Math.random() * musicArray.length); 
      Music randomMusic = musicArray[randomIndex]; 
      playSound("acoustic-guitar-loop-f-91bpm-132687-(1).wav");
      setTextHeight(30);
      setTextStyle(Font.SANS, FontStyle.BOLD);
      drawText("MUSIC RANDOMIZER", 50, 55);
     
      
      setTextHeight(20);
      setTextStyle(Font.SANS, FontStyle.NORMAL);
      drawText(randomMusic.toStringArtist(), 50, 100); 
      drawText(randomMusic.toStringAlbum(), 50, 150);
      drawText(randomMusic.toStringGenre(), 50, 200);

      drawImage("musicdecoration.png", 50, 270, 250);
      drawImage("music.png", 50, 230, 100);
    }
      
}
