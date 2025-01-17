package irvine.oeis.a312;
// Generated by gen_seq4.pl tile1 at 2020-05-30 23:34
// DO NOT EDIT here!

import org.teherba.tile.TilingSequence;

/**
 * A312172 Coordination sequence Gal.6.430.1 where G.u.t.v denotes the coordination sequence for a vertex of type v in tiling number t in the Galebach list of u-uniform tilings.
 * @author Georg Fischer
 */
public class A312172 extends TilingSequence {

  /** Construct the sequence. */
  public A312172() {
    super(0, new String[]
        { "6.4.4.3;B60+2,A60-2,A240-3,C60-4"
        , "6.3.6.3;D60+2,A300+1,C0-1,B60-4"
        , "6.4.4.3;B0-3,E60-2,C240-3,A60-4"
        , "6.3.6.3;D240+4,B300+1,B0-1,D120+1"
        , "6.4.3.4;E180-1,C60-2,E240-3,F240+3"
        , "6.4.3.4;F60+2,F300+1,E120+4,E0-4"
        });
    defineBaseSet(0);
  }
}
