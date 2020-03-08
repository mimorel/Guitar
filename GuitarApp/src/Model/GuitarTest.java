package Model;
import org.junit.Assert;
import org.junit.Test;


public class GuitarTest {

  @Test
  public void guitar1Test() {
    FretBoard Guitar1 = new GuitarBoard(Tuning.RegularTuning, 0, true);


    NoteValue[][] g1Array = Guitar1.getFretBoard();
    Assert.assertEquals(g1Array[0][0], NoteValue.E);
    Assert.assertEquals(g1Array[0][5], NoteValue.E);
    Assert.assertEquals(g1Array[12][0], NoteValue.E);
    Assert.assertEquals(g1Array[13][5], NoteValue.F);
    Assert.assertEquals(g1Array[21][0], NoteValue.CSharp);


    FretBoard Guitar2 = new GuitarBoard(Tuning.RegularTuning, 2, false);


    NoteValue[][] g2Array = Guitar2.getFretBoard();
    Assert.assertEquals(g2Array[0][0], NoteValue.FSharp);
    Assert.assertEquals(g2Array[0][5], NoteValue.FSharp);
    Assert.assertEquals(g2Array[12][0].getFlatString(),"Gb");
    Assert.assertEquals(g2Array[12][0].getSharpString(),"F#");
    Assert.assertEquals(g2Array[13][5], NoteValue.G);
    Assert.assertEquals(g2Array[21][0], NoteValue.DSharp);
  }

}
