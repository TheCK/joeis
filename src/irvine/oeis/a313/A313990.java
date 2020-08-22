package irvine.oeis.a313;
// Generated by gen_seq4.pl tile1 at 2020-05-30 23:34
// DO NOT EDIT here!

import org.teherba.tile.TilingSequence;

/**
 * A313990 Coordination sequence Gal.6.672.1 where G.u.t.v denotes the coordination sequence for a vertex of type v in tiling number t in the Galebach list of u-uniform tilings.
 * @author Georg Fischer
 */
public class A313990 extends TilingSequence {

  /** Construct the sequence. */
  public A313990() {
    super(0, new String[]
        { "6.3.3.3.3;B60+2,C300+1,A180+3,C120+5,D0+3"
        , "6.3.3.3.3;C60+2,A300+1,D300+2,E180+5,F0+3"
        , "6.3.3.3.3;A60+2,B300+1,F300+2,D240+4,A240+4"
        , "3.3.3.3.3.3;E240+6,B60+3,A0+5,C120+4,F60+1,F240+5"
        , "3.3.3.3.3.3;F0+4,B0+4,D300+1,F180+4,B180+4,D120+1"
        , "3.3.3.3.3.3;D300+5,C60+3,B0+5,E180+4,D120+6,F180+6"
        });
    defineBaseSet(0);
  }
}
