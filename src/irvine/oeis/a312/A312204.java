package irvine.oeis.a312;
// Generated by gen_seq4.pl tile1 at 2020-05-30 23:34
// DO NOT EDIT here!

import org.teherba.tile.TilingSequence;

/**
 * A312204 Coordination sequence Gal.6.401.1 where G.u.t.v denotes the coordination sequence for a vertex of type v in tiling number t in the Galebach list of u-uniform tilings.
 * @author Georg Fischer
 */
public class A312204 extends TilingSequence {

  /** Construct the sequence. */
  public A312204() {
    super(0, new String[]
        { "6.4.4.3;B60+2,A60-2,A180+3,A60-4"
        , "6.3.6.3;C180-1,A300+1,A0-1,C120+1"
        , "6.4.4.3;B180-1,C60-2,D120-2,C60-4"
        , "4.4.3.3.3;D180-1,C120-3,D180-3,E180+5,F180+6"
        , "3.3.3.3.3.3;F0+4,D0+4,D180-4,F0+1,D180+4,D0-4"
        , "3.3.3.3.3.3;E0+4,D180-5,D0+5,E0+1,D0-5,D180+5"
        });
    defineBaseSet(0);
  }
}
