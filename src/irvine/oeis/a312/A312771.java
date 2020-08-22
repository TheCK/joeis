package irvine.oeis.a312;
// Generated by gen_seq4.pl tile1 at 2020-05-30 23:34
// DO NOT EDIT here!

import org.teherba.tile.TilingSequence;

/**
 * A312771 Coordination sequence Gal.4.125.1 where G.u.t.v denotes the coordination sequence for a vertex of type v in tiling number t in the Galebach list of u-uniform tilings.
 * @author Georg Fischer
 */
public class A312771 extends TilingSequence {

  /** Construct the sequence. */
  public A312771() {
    super(0, new String[]
        { "6.3.6.3;A0-3,B300+1,A0-1,B60-4"
        , "6.3.6.3;A60+2,C300+1,D240+2,A60-4"
        , "6.3.3.3.3;B60+2,D300+1,C180+3,D120+5,D300+3"
        , "6.3.3.3.3;C60+2,B120+3,C60+5,D180+4,C240+4"
        });
    defineBaseSet(0);
  }
}
