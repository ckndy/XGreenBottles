public class XGreenBottles {

  public static void main(String[] args) {

    int bottles = 10; // Variable that takes in the number of bottles
    String word = "green bottles"; // Initialize

    // Here I've inserted a while loop because we will be repeating an expression until it is no longer true.

    while(bottles > 0) { // While bottles are greater than zero

      // While we have more than zero bottles we will start a new verse of the song

      System.out.println("---NEW VERSE---"); 
      System.out.println(bottles + " " + word + " " + "hanging on the wall");
      System.out.println(bottles + " " + word + " " + "hanging on the wall");
      System.out.println("And if one green bottle should accidentally fall");

      bottles--; // Takes one bottle away at a time

    if (bottles == 1) { // When there is one bottle left word = bottle
      word = "bottle";
    }

    if (bottles == 0) { // When there is multiple bottles left word = bottles
      word = "bottles"; // When there is zero bottles left it has to change back to bottles
    }

    System.out.println("There'll be" + bottles + " " + word + " " + "hanging on the wall");
  }
}
}

// Seems to compile but no song lyrics print out to the screen.....