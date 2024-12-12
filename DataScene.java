import org.code.theater.*;

/*
visualization to print image of bird based
on their conservation status
*/
public class DataScene extends Scene {

// creating variables
    private String[] images;             // The 1D array of bird images
    private String[] status;        // The 1D array of conservation status of each bird

// constructor
  public DataScene(String[] images, String[] status){
    this.images = images;
    this.status = status;
  }

  /*
   * Return the size to draw the image based on
   * the the conservation status
   * the more endangered = the larger size
   */
public int chooseSize(String s){
 int size = 0;
  if (s.equals("Critically Endangered")){
    size = 150;
  }
  else if (s.equals("Endangered")){
    size = 100;
  }
  else if (s.equals("Vulnerable")){
    size = 50;
  }
  else if (s.equals("Near Threatened")){
    size = 25;
  }
  else{
    size = 160;
  }
  return size;
}

/*
   * Draws the results in the scene
   */
  public void drawResults() {    
    for (int i = 0; i < status.length; i++) {
      int x = (int) (Math.random() * getWidth());
      int y = (int) (Math.random() * getHeight());
      int size = chooseSize(status[i]);
      System.out.print("drawing"+i);
      drawImage(images[i], x, y, size);
    }
  }
  
}