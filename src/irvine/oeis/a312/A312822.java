package irvine.oeis.a312;
// Generated by gen_seq4.pl tile1 at 2020-05-30 23:34
// DO NOT EDIT here!

import org.teherba.tile.TilingSequence;

/**
 * A312822 Coordination sequence Gal.6.577.1 where G.u.t.v denotes the coordination sequence for a vertex of type v in tiling number t in the Galebach list of u-uniform tilings.
 * @author Georg Fischer
 */
public class A312822 extends TilingSequence {

  /** Construct the sequence. */
  public A312822() {
    super(0, new String[]
        { "6.3.6.3;A0-3,B300+1,A0-1,B120+1"
        , "6.3.6.3;A60+2,C300+1,C0-1,A60-4"
        , "6.3.3.3.3;B60+2,C60-2,D300+2,E300+3,C60-5"
        , "3.3.3.3.3.3;E0+4,C60+3,C120-3,E0+1,F180+5,F180-2"
        , "3.3.3.3.3.3;D0+4,C120-4,C60+4,D0+1,F180-3,F180+6"
        , "3.3.3.3.3.3;F0-4,D0+5,E0+6,F0-1,D180+5,E180+6"
        });
    defineBaseSet(0);
  }
}
