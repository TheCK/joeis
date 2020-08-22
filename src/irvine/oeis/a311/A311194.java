package irvine.oeis.a311;
// Generated by gen_seq4.pl tile1 at 2020-05-30 23:34
// DO NOT EDIT here!

import org.teherba.tile.TilingSequence;

/**
 * A311194 Coordination sequence Gal.6.383.1 where G.u.t.v denotes the coordination sequence for a vertex of type v in tiling number t in the Galebach list of u-uniform tilings.
 * @author Georg Fischer
 */
public class A311194 extends TilingSequence {

  /** Construct the sequence. */
  public A311194() {
    super(0, new String[]
        { "6.4.4.3;A180-1,B300+1,A240-3,C210+4"
        , "6.4.3.4;A60+2,D300+1,E120+4,B0-4"
        , "6.4.3.4;C60+2,C300+1,A330-4,A150+4"
        , "6.4.3.4;B60+2,D60-2,D240-3,F240+3"
        , "6.4.3.4;F60+2,F300+1,B240-3,B240+3"
        , "6.4.3.4;E60+2,E300+1,D120+4,D0-4"
        });
    defineBaseSet(0);
  }
}
