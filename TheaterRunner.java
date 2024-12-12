import org.code.theater.*;

public class TheaterRunner {
  public static void main(String[] args) {

    // Creates a 1D array of image file names from a text file
    String[] images = FileReader.toStringArray("images.txt");

    // Creates a 1D array containing the number of wins from a text file
    String[] status = FileReader.toStringArray("status.txt");

    // Creates a DataScene object
    DataScene scene = new DataScene(images, status);

    // Calls the drawResults() method
    scene.drawResults();

    // Plays the scene
    Theater.playScenes(scene); 
    
    
  }
}