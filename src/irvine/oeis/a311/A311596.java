package irvine.oeis.a311;
// Generated by gen_seq4.pl tile1 at 2020-05-30 23:34
// DO NOT EDIT here!

import org.teherba.tile.TilingSequence;

/**
 * A311596 Coordination sequence Gal.6.270.1 where G.u.t.v denotes the coordination sequence for a vertex of type v in tiling number t in the Galebach list of u-uniform tilings.
 * @author Georg Fischer
 */
public class A311596 extends TilingSequence {

  /** Construct the sequence. */
  public A311596() {
    super(0, new String[]
        { "4.4.4.4;A0-3,B60+3,A0-1,B240+3"
        , "6.4.4.3;C60+2,B60-2,A300+2,B60-4"
        , "6.3.6.3;D180-1,B300+1,B0-1,D120+1"
        , "6.4.4.3;C180-1,D60-2,E180+3,D60-4"
        , "6.4.4.3;F180-1,E60-2,D180+3,E60-4"
        , "6.3.6.3;E180-1,E300+1,E0-1,E120+1"
        });
    defineBaseSet(0);
  }
}
