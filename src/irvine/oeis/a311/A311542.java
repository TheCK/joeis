package irvine.oeis.a311;
// Generated by gen_seq4.pl tile1 at 2020-05-30 23:34
// DO NOT EDIT here!

import org.teherba.tile.TilingSequence;

/**
 * A311542 Coordination sequence Gal.5.155.1 where G.u.t.v denotes the coordination sequence for a vertex of type v in tiling number t in the Galebach list of u-uniform tilings.
 * @author Georg Fischer
 */
public class A311542 extends TilingSequence {

  /** Construct the sequence. */
  public A311542() {
    super(0, new String[]
        { "6.4.4.3;B300+3,C60-2,A180+3,D120+1"
        , "6.6.3.3;E300+3,B180+2,A60+1,D180+5"
        , "6.4.4.3;E180-1,A60-2,D120-2,D300-3"
        , "4.4.3.3.3;A240+4,C120-3,C300-4,E120+4,B180+4"
        , "6.6.3.3;C180-1,E180+2,B60+1,D240+4"
        });
    defineBaseSet(0);
  }
}
