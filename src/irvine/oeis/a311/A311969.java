package irvine.oeis.a311;
// Generated by gen_seq4.pl tile1 at 2020-05-30 23:34
// DO NOT EDIT here!

import org.teherba.tile.TilingSequence;

/**
 * A311969 Coordination sequence Gal.6.530.1 where G.u.t.v denotes the coordination sequence for a vertex of type v in tiling number t in the Galebach list of u-uniform tilings.
 * @author Georg Fischer
 */
public class A311969 extends TilingSequence {

  /** Construct the sequence. */
  public A311969() {
    super(0, new String[]
        { "6.6.3.3;B240+4,A60-2,C60+1,A60-4"
        , "6.3.6.3;A180-1,A300+1,A0-1,A120+1"
        , "6.3.6.3;A300+3,D300+1,D0-1,A0-3"
        , "6.3.6.3;C60+2,D60-2,E240+2,D60-4"
        , "6.3.6.3;F60+2,D120+3,D180-3,F240-2"
        , "6.3.6.3;F180-1,E300+1,F180-3,E120+1"
        });
    defineBaseSet(0);
  }
}
