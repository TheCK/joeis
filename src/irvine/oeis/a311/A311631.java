package irvine.oeis.a311;
// Generated by gen_seq4.pl tile1 at 2020-05-30 23:34
// DO NOT EDIT here!

import org.teherba.tile.TilingSequence;

/**
 * A311631 Coordination sequence Gal.6.285.1 where G.u.t.v denotes the coordination sequence for a vertex of type v in tiling number t in the Galebach list of u-uniform tilings.
 * @author Georg Fischer
 */
public class A311631 extends TilingSequence {

  /** Construct the sequence. */
  public A311631() {
    super(0, new String[]
        { "4.4.4.4;A180+1,B60+3,A180+3,B300-3"
        , "6.4.4.3;C60+2,B60-2,A300+2,B60-4"
        , "6.3.6.3;D180-1,B300+1,B0-1,D120+1"
        , "6.4.4.3;C180-1,D60-2,E120-2,D60-4"
        , "4.4.3.3.3;E180-1,D120-3,E180-3,F180+5,F0+3"
        , "3.3.3.3.3.3;F180+1,E180-5,E0+5,F180+4,E180+4,E0-4"
        });
    defineBaseSet(0);
  }
}
