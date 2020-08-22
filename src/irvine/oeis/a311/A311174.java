package irvine.oeis.a311;
// Generated by gen_seq4.pl tile1 at 2020-05-30 23:34
// DO NOT EDIT here!

import org.teherba.tile.TilingSequence;

/**
 * A311174 Coordination sequence Gal.5.62.1 where G.u.t.v denotes the coordination sequence for a vertex of type v in tiling number t in the Galebach list of u-uniform tilings.
 * @author Georg Fischer
 */
public class A311174 extends TilingSequence {

  /** Construct the sequence. */
  public A311174() {
    super(0, new String[]
        { "4.4.4.4;A180-1,A0-2,A180-3,B0+2"
        , "4.4.4.4;B180-1,A0+4,B180-3,C240+3"
        , "6.4.4.3;D60+2,C60-2,B120+4,C60-4"
        , "6.3.6.3;E300+3,C300+1,C0-1,E120+1"
        , "6.6.3.3;D240+4,E180+2,D60+1,E180+4"
        });
    defineBaseSet(0);
  }
}
