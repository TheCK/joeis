package irvine.oeis.a311;
// Generated by gen_seq4.pl tile1 at 2020-05-30 23:34
// DO NOT EDIT here!

import org.teherba.tile.TilingSequence;

/**
 * A311026 Coordination sequence Gal.6.481.1 where G.u.t.v denotes the coordination sequence for a vertex of type v in tiling number t in the Galebach list of u-uniform tilings.
 * @author Georg Fischer
 */
public class A311026 extends TilingSequence {

  /** Construct the sequence. */
  public A311026() {
    super(0, new String[]
        { "6.4.3.4;A180-1,A60-2,B270-3,C210+4"
        , "12.4.3.3;D180-1,B120-2,A270-3,C60-5"
        , "4.3.4.3.3;D240+4,E0+4,C120-3,A150+4,B60-4"
        , "12.3.4.3;B180-1,D120-2,F180+3,C120+1"
        , "6.4.3.4;F60+2,F300+1,C120-2,C0+2"
        , "6.4.3.4;E60+2,E300+1,D180+3,D300-3"
        });
    defineBaseSet(0);
  }
}
