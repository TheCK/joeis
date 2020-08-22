package irvine.oeis.a313;
// Generated by gen_seq4.pl tile1 at 2020-05-30 23:34
// DO NOT EDIT here!

import org.teherba.tile.TilingSequence;

/**
 * A313239 Coordination sequence Gal.6.467.1 where G.u.t.v denotes the coordination sequence for a vertex of type v in tiling number t in the Galebach list of u-uniform tilings.
 * @author Georg Fischer
 */
public class A313239 extends TilingSequence {

  /** Construct the sequence. */
  public A313239() {
    super(0, new String[]
        { "6.4.4.3;B60+2,A60-2,A240-3,C120+1"
        , "6.3.3.3.3;D300+3,A300+1,C60+5,E0+2,F0+3"
        , "4.4.3.3.3;A240+4,C0-2,C180-3,E300+3,B300+3"
        , "6.6.3.3;B180-1,D180+2,B60+1,F60+2"
        , "3.3.3.3.3.3;F0+4,B0+4,C60+4,C240-4,B300-4,F180+6"
        , "3.3.3.3.3.3;B120-5,D300+4,B0+5,E0+1,F180+5,E180+6"
        });
    defineBaseSet(0);
  }
}
