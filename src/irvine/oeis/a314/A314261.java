package irvine.oeis.a314;
// Generated by gen_seq4.pl tile1 at 2020-05-30 23:34
// DO NOT EDIT here!

import org.teherba.tile.TilingSequence;

/**
 * A314261 Coordination sequence Gal.4.149.1 where G.u.t.v denotes the coordination sequence for a vertex of type v in tiling number t in the Galebach list of u-uniform tilings.
 * @author Georg Fischer
 */
public class A314261 extends TilingSequence {

  /** Construct the sequence. */
  public A314261() {
    super(0, new String[]
        { "6.3.3.3.3;A60+2,A300+1,B300+2,C0+2,B0+3"
        , "3.3.3.3.3.3;C60+3,A60+3,A0+5,C0+1,D0+2,D240+5"
        , "3.3.3.3.3.3;B0+4,A0+4,B300+1,D180+4,C180+5,D0+3"
        , "3.3.3.3.3.3;D240+6,B0+5,C0+6,C180+4,B120+6,D120+1"
        });
    defineBaseSet(0);
  }
}
