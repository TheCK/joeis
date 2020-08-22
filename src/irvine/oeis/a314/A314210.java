package irvine.oeis.a314;
// Generated by gen_seq4.pl tile1 at 2020-05-30 23:34
// DO NOT EDIT here!

import org.teherba.tile.TilingSequence;

/**
 * A314210 Coordination sequence Gal.6.623.4 where G.u.t.v denotes the coordination sequence for a vertex of type v in tiling number t in the Galebach list of u-uniform tilings.
 * @author Georg Fischer
 */
public class A314210 extends TilingSequence {

  /** Construct the sequence. */
  public A314210() {
    super(0, new String[]
        { "4.4.3.3.3;A0+3,A180+2,A0+1,B0+2,B0+3"
        , "3.3.3.3.3.3;B0+4,A0+4,A0+5,B0+1,C0+2,C0+3"
        , "3.3.3.3.3.3;C0+4,B0+5,B0+6,C0+1,D180+4,D180+5"
        , "4.4.3.3.3;D0+3,E180+2,D0+1,C180+5,C180+6"
        , "4.4.3.3.3;E0+3,D180+2,E0+1,F0+2,F0+3"
        , "3.3.3.3.3.3;F0+4,E0+4,E0+5,F0+1,E180+4,E180+5"
        });
    defineBaseSet(0);
  }
}
