package irvine.oeis.a311;
// Generated by gen_seq4.pl tile1 at 2020-05-30 23:34
// DO NOT EDIT here!

import org.teherba.tile.TilingSequence;

/**
 * A311229 Coordination sequence Gal.6.229.1 where G.u.t.v denotes the coordination sequence for a vertex of type v in tiling number t in the Galebach list of u-uniform tilings.
 * @author Georg Fischer
 */
public class A311229 extends TilingSequence {

  /** Construct the sequence. */
  public A311229() {
    super(0, new String[]
        { "4.4.4.4;A180+1,B180+2,A180+3,B180-2"
        , "4.4.4.4;B180-1,A180+2,B180-3,C0+2"
        , "4.4.4.4;C180-1,B0+4,C180-3,D240+3"
        , "6.4.4.3;E60+2,D60-2,C120+4,D60-4"
        , "6.3.6.3;F240+4,D300+1,D0-1,F240-2"
        , "6.3.6.3;F0-3,E300+1,F0-1,E120+1"
        });
    defineBaseSet(0);
  }
}
