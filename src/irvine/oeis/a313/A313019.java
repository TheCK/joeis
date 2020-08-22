package irvine.oeis.a313;
// Generated by gen_seq4.pl tile1 at 2020-05-30 23:34
// DO NOT EDIT here!

import org.teherba.tile.TilingSequence;

/**
 * A313019 Coordination sequence Gal.6.445.1 where G.u.t.v denotes the coordination sequence for a vertex of type v in tiling number t in the Galebach list of u-uniform tilings.
 * @author Georg Fischer
 */
public class A313019 extends TilingSequence {

  /** Construct the sequence. */
  public A313019() {
    super(0, new String[]
        { "6.4.4.3;B60+2,A60-2,C300+2,A60-4"
        , "6.3.6.3;D300+3,A300+1,A0-1,D0-3"
        , "4.4.3.3.3;C180-1,A60+3,C180-3,E0+2,E180+6"
        , "6.6.3.3;F240+4,D60-2,B60+1,D60-4"
        , "3.3.3.3.3.3;E180+1,C0+4,C180-4,E180+4,C0-5,C180+5"
        , "6.3.6.3;D180-1,D300+1,D0-1,D120+1"
        });
    defineBaseSet(0);
  }
}
