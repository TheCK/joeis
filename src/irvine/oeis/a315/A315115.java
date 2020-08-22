package irvine.oeis.a315;
// Generated by gen_seq4.pl tile1 at 2020-05-30 23:34
// DO NOT EDIT here!

import org.teherba.tile.TilingSequence;

/**
 * A315115 Coordination sequence Gal.5.332.1 where G.u.t.v denotes the coordination sequence for a vertex of type v in tiling number t in the Galebach list of u-uniform tilings.
 * @author Georg Fischer
 */
public class A315115 extends TilingSequence {

  /** Construct the sequence. */
  public A315115() {
    super(0, new String[]
        { "6.3.3.3.3;B60+2,C300+1,A120+4,A240+3,C180+5"
        , "6.3.3.3.3;C60+2,A300+1,C120+4,D0+2,D300+4"
        , "6.3.3.3.3;A60+2,B300+1,D240+3,B240+3,A180+5"
        , "3.3.3.3.3.3;D300+5,B0+4,C120+3,B60+5,D60+1,E300+4"
        , "3.3.3.3.3.3;D240+6,D300+6,D0+6,D60+6,D120+6,D180+6"
        });
    defineBaseSet(0);
  }
}
