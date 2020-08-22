package irvine.oeis.a311;
// Generated by gen_seq4.pl tile1 at 2020-05-30 23:34
// DO NOT EDIT here!

import org.teherba.tile.TilingSequence;

/**
 * A311788 Coordination sequence Gal.6.431.1 where G.u.t.v denotes the coordination sequence for a vertex of type v in tiling number t in the Galebach list of u-uniform tilings.
 * @author Georg Fischer
 */
public class A311788 extends TilingSequence {

  /** Construct the sequence. */
  public A311788() {
    super(0, new String[]
        { "6.4.4.3;B240+4,A60-2,C180+3,A60-4"
        , "6.3.6.3;A180-1,A300+1,A0-1,A120+1"
        , "6.4.4.3;D60+2,C60-2,A180+3,C60-4"
        , "6.3.6.3;E300+3,C300+1,C0-1,E0-3"
        , "6.6.3.3;F60+2,E60-2,D60+1,E60-4"
        , "6.3.6.3;E180-1,E300+1,E0-1,E120+1"
        });
    defineBaseSet(0);
  }
}
