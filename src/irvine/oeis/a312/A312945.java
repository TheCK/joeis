package irvine.oeis.a312;
// Generated by gen_seq4.pl tile1 at 2020-05-30 23:34
// DO NOT EDIT here!

import org.teherba.tile.TilingSequence;

/**
 * A312945 Coordination sequence Gal.6.537.1 where G.u.t.v denotes the coordination sequence for a vertex of type v in tiling number t in the Galebach list of u-uniform tilings.
 * @author Georg Fischer
 */
public class A312945 extends TilingSequence {

  /** Construct the sequence. */
  public A312945() {
    super(0, new String[]
        { "6.6.3.3;B60+2,A60-2,C60+1,D300+3"
        , "6.3.6.3;A180-1,A300+1,D240+2,D240-2"
        , "6.3.3.3.3;A300+3,A180-3,D240-4,E180+4,D240+4"
        , "6.3.3.3.3;F60+2,B120+3,A60+4,C120+5,E300+3"
        , "6.3.3.3.3;F180-1,F120+3,D60+5,C180+4,D60-5"
        , "6.3.6.3;E60+2,D300+1,E240+2,D120+1"
        });
    defineBaseSet(0);
  }
}
