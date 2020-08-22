package irvine.oeis.a311;
// Generated by gen_seq4.pl tile1 at 2020-05-30 23:34
// DO NOT EDIT here!

import org.teherba.tile.TilingSequence;

/**
 * A311538 Coordination sequence Gal.6.385.1 where G.u.t.v denotes the coordination sequence for a vertex of type v in tiling number t in the Galebach list of u-uniform tilings.
 * @author Georg Fischer
 */
public class A311538 extends TilingSequence {

  /** Construct the sequence. */
  public A311538() {
    super(0, new String[]
        { "6.4.4.3;B180-1,A60-2,A240-3,C210+4"
        , "6.4.4.3;A180-1,D60-2,B240-3,C330-3"
        , "6.4.3.4;C180-1,C60-2,B330-4,A150+4"
        , "6.4.3.4;D180-1,B60-2,D240-3,E0+2"
        , "4.3.4.3.3;E300+4,D0+4,D240-4,E60+1,F240+5"
        , "3.3.3.3.3.3;E240+5,E300+5,E0+5,E60+5,E120+5,E180+5"
        });
    defineBaseSet(0);
  }
}
