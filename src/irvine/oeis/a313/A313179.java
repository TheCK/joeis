package irvine.oeis.a313;
// Generated by gen_seq4.pl tile1 at 2020-05-30 23:34
// DO NOT EDIT here!

import org.teherba.tile.TilingSequence;

/**
 * A313179 Coordination sequence Gal.3.38.1 where G.u.t.v denotes the coordination sequence for a vertex of type v in tiling number t in the Galebach list of u-uniform tilings.
 * @author Georg Fischer
 */
public class A313179 extends TilingSequence {

  /** Construct the sequence. */
  public A313179() {
    super(0, new String[]
        { "6.6.3.3;A180-1,A180+2,B60+1,C0+3"
        , "6.3.3.3.3;A300+3,B60-2,C120+5,B180+4,C300+4"
        , "3.3.3.3.3.3;B120-5,A180-4,A0+4,B60+5,B240+3,B300-3"
        });
    defineBaseSet(0);
  }
}
