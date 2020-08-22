package irvine.oeis.a310;
// Generated by gen_seq4.pl tile1 at 2020-05-30 23:34
// DO NOT EDIT here!

import org.teherba.tile.TilingSequence;

/**
 * A310317 Coordination sequence Gal.6.79.1 where G.u.t.v denotes the coordination sequence for a vertex of type v in tiling number t in the Galebach list of u-uniform tilings.
 * @author Georg Fischer
 */
public class A310317 extends TilingSequence {

  /** Construct the sequence. */
  public A310317() {
    super(0, new String[]
        { "6.6.6;B60+2,B60-2,C300+2"
        , "6.6.3.3;D60+2,A300+1,D240+3,B180+4"
        , "6.6.3.3;E300+3,A60+3,E300-3,F240+4"
        , "6.3.6.3;F60+2,B300+1,B120+3,E120+1"
        , "6.6.3.3;D240+4,E180+2,C60+1,F300+3"
        , "6.3.3.3.3;D180-1,D300+1,E60+4,C120+4,E60-4"
        });
    defineBaseSet(0);
  }
}
