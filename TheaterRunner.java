import org.code.theater.*;

public class TheaterRunner {
  public static void main(String[] args) {
    
    // Instantiate a DataScene object to play in the Theater
    DataScene song = new DataScene();
      song.drawScene();
 
    // Play the DataScene in the theater
      Theater.playScenes(song);

  
    
  }
}