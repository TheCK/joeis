package irvine.oeis.a311;
// Generated by gen_seq4.pl tile1 at 2020-05-30 23:34
// DO NOT EDIT here!

import org.teherba.tile.TilingSequence;

/**
 * A311624 Coordination sequence Gal.5.285.1 where G.u.t.v denotes the coordination sequence for a vertex of type v in tiling number t in the Galebach list of u-uniform tilings.
 * @author Georg Fischer
 */
public class A311624 extends TilingSequence {

  /** Construct the sequence. */
  public A311624() {
    super(0, new String[]
        { "12.4.3.3;A180-1,A120-2,B60+1,C0+3"
        , "4.4.3.3.3;A300+3,B0-2,D0+1,E180+4,C300+4"
        , "3.3.3.3.3.3;B120-5,A180-4,A0+4,B60+5,E240+3,E300-3"
        , "4.4.3.3.3;B0+3,D180+2,B180-3,E0-5,E180+5"
        , "6.3.3.3.3;E180-1,E60-2,C120+5,B180+4,D180+5"
        });
    defineBaseSet(0);
  }
}
