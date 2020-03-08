package Model;


/**
 * FretBoard Class will create Model depending on user input.
 */
public interface FretBoard {


  /**
   * For testing purposes.
   * @return String version of FretBored.
   */
  String toString();


  /**
   * Gets a array with fretboard model
   * @return  StringArray with model info.
   */
  NoteValue[][] getFretBoard();
}
