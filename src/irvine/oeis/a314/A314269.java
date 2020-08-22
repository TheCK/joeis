package irvine.oeis.a314;
// Generated by gen_seq4.pl tile1 at 2020-05-30 23:34
// DO NOT EDIT here!

import org.teherba.tile.TilingSequence;

/**
 * A314269 Coordination sequence Gal.5.322.1 where G.u.t.v denotes the coordination sequence for a vertex of type v in tiling number t in the Galebach list of u-uniform tilings.
 * @author Georg Fischer
 */
public class A314269 extends TilingSequence {

  /** Construct the sequence. */
  public A314269() {
    super(0, new String[]
        { "6.3.3.3.3;A60+2,A300+1,B300+2,C0+2,B0+3"
        , "3.3.3.3.3.3;C60+3,A60+3,A0+5,C0+1,D0+2,E0+3"
        , "3.3.3.3.3.3;B0+4,A0+4,B300+1,E300+2,D120+6,D0+3"
        , "3.3.3.3.3.3;E0+4,B0+5,C0+6,D120+5,D240+4,C240+5"
        , "3.3.3.3.3.3;D180+1,C60+4,B0+6,D0+1,C240+4,B180+6"
        });
    defineBaseSet(0);
  }
}
