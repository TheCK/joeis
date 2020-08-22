package irvine.oeis.a310;
// Generated by gen_seq4.pl tile1 at 2020-05-30 23:34
// DO NOT EDIT here!

import org.teherba.tile.TilingSequence;

/**
 * A310315 Coordination sequence Gal.5.31.1 where G.u.t.v denotes the coordination sequence for a vertex of type v in tiling number t in the Galebach list of u-uniform tilings.
 * @author Georg Fischer
 */
public class A310315 extends TilingSequence {

  /** Construct the sequence. */
  public A310315() {
    super(0, new String[]
        { "6.6.6;B60+2,B60-2,C300+2"
        , "6.6.3.3;D240+4,A300+1,C60+1,E300+3"
        , "6.6.3.3;B300+3,A60+3,B300-3,E240+4"
        , "6.3.6.3;E60+2,B300+1,E240+2,B120+1"
        , "6.3.3.3.3;D0-3,D300+1,B60+4,C120+4,B60-4"
        });
    defineBaseSet(0);
  }
}
