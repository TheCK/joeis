package irvine.oeis.a315;
// Generated by gen_seq4.pl tile1 at 2020-05-30 23:34
// DO NOT EDIT here!

import org.teherba.tile.TilingSequence;

/**
 * A315796 Coordination sequence Gal.3.42.3 where G.u.t.v denotes the coordination sequence for a vertex of type v in tiling number t in the Galebach list of u-uniform tilings.
 * @author Georg Fischer
 */
public class A315796 extends TilingSequence {

  /** Construct the sequence. */
  public A315796() {
    super(0, new String[]
        { "6.3.6.3;A240+4,B300+1,B240+2,A120+1"
        , "6.3.3.3.3;A60+2,A120+3,B60+5,C60+1,B300+3"
        , "3.3.3.3.3.3;B300+4,B0+4,B60+4,B120+4,B180+4,B240+4"
        });
    defineBaseSet(2);
  }
}
