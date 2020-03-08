package Model;

/**
 * Enum class for Notes.
 */
public enum NoteValue {
  A(0, "A", "A"), ASharp(1, "A#", "Bb"), B(2, "B", "B"), C(3, "C", "C"),
  CSharp(4, "C#", "Db"), D(5, "D", "D"), DSharp(6, "D#", "Eb"),
  E(7, "E", "E"), F(8, "F", "F"), FSharp(9, "F#", "Gb"),
  G(10, "G", "G"), GSharp(11, "G#", "Ab");

  private final int value;
  private final String sharps;
  private final String flats;

   NoteValue(int value, String sharps, String flats) {
    this.value = value;
    this.sharps = sharps;
    this.flats = flats;
  }

   public String getFlatString() {
    return this.flats;
   }

   public String getSharpString() {
    return this.sharps;
   }

   public int getNoteValue() {
    return this.value;
   }
}
