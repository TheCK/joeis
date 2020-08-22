package irvine.oeis.a310;
// Generated by gen_seq4.pl tile1 at 2020-05-30 23:34
// DO NOT EDIT here!

import org.teherba.tile.TilingSequence;

/**
 * A310473 Coordination sequence Gal.6.608.1 where G.u.t.v denotes the coordination sequence for a vertex of type v in tiling number t in the Galebach list of u-uniform tilings.
 * @author Georg Fischer
 */
public class A310473 extends TilingSequence {

  /** Construct the sequence. */
  public A310473() {
    super(0, new String[]
        { "6.3.6.3;B60+2,C300+1,D240+2,E120+1"
        , "6.3.3.3.3;E60+2,A300+1,E60+5,B180+4,E240+4"
        , "6.3.3.3.3;A60+2,D300+1,F300+2,F120+6,D300+3"
        , "6.3.3.3.3;C60+2,A120+3,C60+5,F180+5,F0+3"
        , "6.3.3.3.3;A240+4,B300+1,E180+3,B120+5,B300+3"
        , "3.3.3.3.3.3;F180+1,C60+3,D0+5,F180+4,D180+4,C240+4"
        });
    defineBaseSet(0);
  }
}
