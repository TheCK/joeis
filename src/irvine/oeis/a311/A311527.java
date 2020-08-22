package irvine.oeis.a311;
// Generated by gen_seq4.pl tile1 at 2020-05-30 23:34
// DO NOT EDIT here!

import org.teherba.tile.TilingSequence;

/**
 * A311527 Coordination sequence Gal.6.185.1 where G.u.t.v denotes the coordination sequence for a vertex of type v in tiling number t in the Galebach list of u-uniform tilings.
 * @author Georg Fischer
 */
public class A311527 extends TilingSequence {

  /** Construct the sequence. */
  public A311527() {
    super(0, new String[]
        { "4.4.4.4;A180-1,A0-2,A180-3,B240+3"
        , "6.4.4.3;C60+2,B60-2,A120+4,B60-4"
        , "6.3.6.3;D60+2,B300+1,B0-1,D240-2"
        , "6.3.6.3;D180-1,C300+1,D180-3,E300+3"
        , "6.3.6.3;F180-1,D240-4,D60+4,F120+1"
        , "6.4.4.3;E180-1,F60-2,F240-3,F60-4"
        });
    defineBaseSet(0);
  }
}
