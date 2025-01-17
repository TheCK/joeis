package irvine.oeis.a315;
// Generated by gen_seq4.pl tile1 at 2020-05-30 23:34
// DO NOT EDIT here!

import org.teherba.tile.TilingSequence;

/**
 * A315103 Coordination sequence Gal.4.123.2 where G.u.t.v denotes the coordination sequence for a vertex of type v in tiling number t in the Galebach list of u-uniform tilings.
 * @author Georg Fischer
 */
public class A315103 extends TilingSequence {

  /** Construct the sequence. */
  public A315103() {
    super(0, new String[]
        { "6.6.3.3;B60+2,A180+2,B60+1,C0+3"
        , "6.3.3.3.3;A300+3,A300+1,C300+2,D0+2,C300+4"
        , "3.3.3.3.3.3;D60+3,B60+3,A0+4,B60+5,D60+1,D240+5"
        , "3.3.3.3.3.3;C300+5,B0+4,C300+1,D180+4,C120+6,D180+6"
        });
    defineBaseSet(1);
  }
}
