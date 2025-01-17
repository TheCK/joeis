package irvine.oeis.a310;
// Generated by gen_seq4.pl tile1 at 2020-05-30 23:34
// DO NOT EDIT here!

import org.teherba.tile.TilingSequence;

/**
 * A310329 Coordination sequence Gal.6.74.1 where G.u.t.v denotes the coordination sequence for a vertex of type v in tiling number t in the Galebach list of u-uniform tilings.
 * @author Georg Fischer
 */
public class A310329 extends TilingSequence {

  /** Construct the sequence. */
  public A310329() {
    super(0, new String[]
        { "6.6.6;B60+2,B180+2,B300+2"
        , "6.6.3.3;C240+4,A300+1,D60+1,E300+3"
        , "6.3.6.3;E60+2,B300+1,E240+2,B120+1"
        , "6.3.3.3.3;B300+3,E300+1,F180+3,F120+5,E240+4"
        , "6.3.3.3.3;D60+2,C300+1,B60+4,D120+5,F240+4"
        , "6.3.3.3.3;F60+2,F300+1,D180+3,E120+5,D240+4"
        });
    defineBaseSet(0);
  }
}
