package irvine.oeis.a312;
// Generated by gen_seq4.pl tile1 at 2020-05-30 23:34
// DO NOT EDIT here!

import org.teherba.tile.TilingSequence;

/**
 * A312112 Coordination sequence Gal.6.501.1 where G.u.t.v denotes the coordination sequence for a vertex of type v in tiling number t in the Galebach list of u-uniform tilings.
 * @author Georg Fischer
 */
public class A312112 extends TilingSequence {

  /** Construct the sequence. */
  public A312112() {
    super(0, new String[]
        { "6.6.3.3;A180-1,A180+2,B60+1,C0+3"
        , "6.6.3.3;A300+3,B60-2,D60+1,C300+4"
        , "3.3.3.3.3.3;B120-4,A180-4,A0+4,B60+4,D120+5,D60-5"
        , "6.3.3.3.3;B300+3,E300+1,F240+3,D300-4,C240+5"
        , "6.6.3.3;D60+2,E180+2,D180-2,F300+4"
        , "3.3.3.3.3.3;E240+4,D60-3,D120+3,E60+4,D240-3,D300+3"
        });
    defineBaseSet(0);
  }
}
