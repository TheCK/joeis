package irvine.oeis.a312;
// Generated by gen_seq4.pl tile1 at 2020-05-30 23:34
// DO NOT EDIT here!

import org.teherba.tile.TilingSequence;

/**
 * A312023 Coordination sequence Gal.5.165.1 where G.u.t.v denotes the coordination sequence for a vertex of type v in tiling number t in the Galebach list of u-uniform tilings.
 * @author Georg Fischer
 */
public class A312023 extends TilingSequence {

  /** Construct the sequence. */
  public A312023() {
    super(0, new String[]
        { "6.4.4.3;B60+2,A60-2,A180+3,A60-4"
        , "6.3.6.3;C60+2,A300+1,A0-1,C240-2"
        , "6.3.6.3;C180-1,B300+1,C180-3,D300+3"
        , "6.3.6.3;E300+3,C240-4,C60+4,E120+1"
        , "6.6.3.3;D240+4,E180+2,D60+1,E180+4"
        });
    defineBaseSet(0);
  }
}
