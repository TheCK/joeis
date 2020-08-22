package irvine.oeis.a313;
// Generated by gen_seq4.pl tile1 at 2020-05-30 23:34
// DO NOT EDIT here!

import org.teherba.tile.TilingSequence;

/**
 * A313084 Coordination sequence Gal.6.545.1 where G.u.t.v denotes the coordination sequence for a vertex of type v in tiling number t in the Galebach list of u-uniform tilings.
 * @author Georg Fischer
 */
public class A313084 extends TilingSequence {

  /** Construct the sequence. */
  public A313084() {
    super(0, new String[]
        { "6.6.3.3;B60+2,A180+2,C60+1,D300+3"
        , "6.3.6.3;E240+4,A300+1,D240+2,F300+3"
        , "6.3.3.3.3;A300+3,F300+1,D60+5,C180+4,D240+4"
        , "6.3.3.3.3;F240+4,B120+3,A60+4,C120+5,C300+3"
        , "6.3.6.3;F60+2,B300+1,F240+2,B120+1"
        , "6.3.6.3;C60+2,E300+1,B60+4,D120+1"
        });
    defineBaseSet(0);
  }
}
