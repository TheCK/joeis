package irvine.oeis.a312;
// Generated by gen_seq4.pl tile1 at 2020-05-30 23:34
// DO NOT EDIT here!

import org.teherba.tile.TilingSequence;

/**
 * A312430 Coordination sequence Gal.6.534.1 where G.u.t.v denotes the coordination sequence for a vertex of type v in tiling number t in the Galebach list of u-uniform tilings.
 * @author Georg Fischer
 */
public class A312430 extends TilingSequence {

  /** Construct the sequence. */
  public A312430() {
    super(0, new String[]
        { "6.6.3.3;B60+2,A60-2,C60+1,A60-4"
        , "6.3.6.3;D240+4,A300+1,A0-1,D60-4"
        , "6.3.6.3;A300+3,E300+1,E0-1,A0-3"
        , "6.3.6.3;D180-1,B300+1,D180-3,B120+1"
        , "6.3.6.3;C60+2,E60-2,F240+2,E60-4"
        , "6.3.6.3;E0-3,E120+3,E180-3,E300+3"
        });
    defineBaseSet(0);
  }
}
