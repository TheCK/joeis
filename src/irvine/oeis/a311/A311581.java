package irvine.oeis.a311;
// Generated by gen_seq4.pl tile1 at 2020-05-30 23:34
// DO NOT EDIT here!

import org.teherba.tile.TilingSequence;

/**
 * A311581 Coordination sequence Gal.6.305.1 where G.u.t.v denotes the coordination sequence for a vertex of type v in tiling number t in the Galebach list of u-uniform tilings.
 * @author Georg Fischer
 */
public class A311581 extends TilingSequence {

  /** Construct the sequence. */
  public A311581() {
    super(0, new String[]
        { "4.4.4.4;A180-1,B60+3,A180-3,C300-3"
        , "6.4.4.3;D240+4,B60-2,A300+2,B60-4"
        , "6.4.4.3;E0-3,C60-2,A300-4,C60-4"
        , "6.3.6.3;B180-1,B300+1,B0-1,B120+1"
        , "6.3.6.3;F60+2,C300+1,C0-1,F60-4"
        , "6.3.6.3;F0-3,E300+1,F0-1,E120+1"
        });
    defineBaseSet(0);
  }
}
