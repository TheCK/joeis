package irvine.oeis.a313;
// Generated by gen_seq4.pl tile1 at 2020-05-30 23:34
// DO NOT EDIT here!

import org.teherba.tile.TilingSequence;

/**
 * A313122 Coordination sequence Gal.6.314.1 where G.u.t.v denotes the coordination sequence for a vertex of type v in tiling number t in the Galebach list of u-uniform tilings.
 * @author Georg Fischer
 */
public class A313122 extends TilingSequence {

  /** Construct the sequence. */
  public A313122() {
    super(0, new String[]
        { "4.4.4.4;A180+1,B60+3,A180-3,C0+2"
        , "6.4.4.3;D60+2,B60-2,A300+2,C120+1"
        , "4.4.3.3.3;B240+4,A0+4,C180-3,E0+2,D300+3"
        , "6.3.3.3.3;F60+2,B300+1,C60+5,E60+1,F240+4"
        , "3.3.3.3.3.3;D300+4,C0+4,C180-4,D240-4,F0-5,F180+5"
        , "6.3.3.3.3;F180-1,D300+1,F180+3,D120+5,E180+6"
        });
    defineBaseSet(0);
  }
}
