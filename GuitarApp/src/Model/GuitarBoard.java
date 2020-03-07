package Model;

import java.lang.*;
import java.lang.IllegalArgumentException;


/**
 * Class to make a model that represents a Guitar Board.
 */
public class GuitarBoard implements FretBoard {


  static int[] regularTuning = {7, 0, 5, 10, 2, 7};
  static int[] OpenD = {5, 0, 5, 9, 0, 5};
  static int[] DropD = {5, 0, 5, 10, 2, 7};
  String[] noteValues = {"A ", "A#", "B ", "C ", "C#", "D ", "D#", "E ", "F ", "F#", "G ", "G#"};

  String[][] boardArray;
  int capo;
  int[] t;

  /**
   * Constructor for guitar model.
   *
   * @param t    type of tuning, {Tuning}, can't be null.
   * @param capo where capo is on guitar neck, 0 = no capo. Must be positive & < 10.
   */
  public void GuitarBoard(Tuning t, int capo) {
    if (t == null || capo < 0 || capo >= 10) {
      throw new IllegalArgumentException("invalid capo placement or tuning");
    }
    this.boardArray = new String[22][6];
    ;

    this.capo = capo;
    switch (t) {
      case RegularTuning:
        this.t = regularTuning;
        break;
      case OpenDTuning:
        this.t = OpenD;
        break;
      case DropDTuning:
        this.t = DropD;
        break;
      default:
        throw new IllegalStateException("invalid tuning");
    }

    this.initializeBoard();


  }

  /**
   * Creates a guitarBoard
   */
  private void initializeBoard() {
    boardArray = new String[22][6];

    for (int j = 0; j < 22; j++) {
      for (int i = 0; i < 6; i++) {
        int noteVal = (((this.t[i]) + (1 * (j + capo))) % 12);
        boardArray[j][i] = noteValues[noteVal];
      }
    }
  }


  /**
   * Converts GuitarBoard Model into a string.
   *
   * @return String GuitarBoard
   */
  @Override
  public String toString() {
    String totalBoard = "";

    for (int j = 0; j < 22; j++) {
      String singleLine = "";
      for (int i = 0; i < 6; i++) {
        singleLine = (singleLine + (boardArray[j][i] + " "));
      }
      totalBoard = totalBoard + "\n" + singleLine;
    }
    return totalBoard;
  }

  @Override
  public String[][] getFretBoard() {

    String[][] copyArray;
    copyArray = new String[22][6];

    for (int j = 0; j < 22; j++) {
      System.out.print(j + this.capo);
      for (int i = 0; i < 6; i++) {
        System.out.println(this.boardArray[j][i]);
        copyArray[j][i] = this.boardArray[j][i];
      }
    }
    return copyArray;
  }
}
