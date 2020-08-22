package irvine.oeis.a312;
// Generated by gen_seq4.pl tile1 at 2020-05-30 23:34
// DO NOT EDIT here!

import org.teherba.tile.TilingSequence;

/**
 * A312648 Coordination sequence Gal.5.196.1 where G.u.t.v denotes the coordination sequence for a vertex of type v in tiling number t in the Galebach list of u-uniform tilings.
 * @author Georg Fischer
 */
public class A312648 extends TilingSequence {

  /** Construct the sequence. */
  public A312648() {
    super(0, new String[]
        { "6.4.4.3;B60+2,C300+1,A240-3,A60-4"
        , "6.3.6.3;B240+4,A300+1,A0-1,B120+1"
        , "6.4.3.4;A60+2,C60-2,D240+3,C0-4"
        , "4.3.4.3.3;D300+4,C120-3,C120+3,D60+1,E180+6"
        , "3.3.3.3.3.3;D240+5,D300+5,D0+5,D60+5,D120+5,D180+5"
        });
    defineBaseSet(0);
  }
}
