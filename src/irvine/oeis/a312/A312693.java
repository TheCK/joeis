package irvine.oeis.a312;
// Generated by gen_seq4.pl tile1 at 2020-05-30 23:34
// DO NOT EDIT here!

import org.teherba.tile.TilingSequence;

/**
 * A312693 Coordination sequence Gal.6.409.1 where G.u.t.v denotes the coordination sequence for a vertex of type v in tiling number t in the Galebach list of u-uniform tilings.
 * @author Georg Fischer
 */
public class A312693 extends TilingSequence {

  /** Construct the sequence. */
  public A312693() {
    super(0, new String[]
        { "6.4.4.3;B60+2,A60-2,A180+3,A60-4"
        , "6.3.6.3;C60+2,A300+1,A0-1,C240-2"
        , "6.3.3.3.3;C180-1,B300+1,C180-3,D0+2,E0+3"
        , "3.3.3.3.3.3;E0+4,C0+4,C180-4,E0+1,F180+4,F0-4"
        , "3.3.3.3.3.3;D0+4,C180-5,C0+5,D0+1,F0-5,F180+5"
        , "4.4.3.3.3;F180-1,F0-2,F180-3,D180+5,E180+6"
        });
    defineBaseSet(0);
  }
}
