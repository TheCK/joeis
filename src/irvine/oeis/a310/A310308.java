package irvine.oeis.a310;
// Generated by gen_seq4.pl tile1 at 2020-05-30 23:34
// DO NOT EDIT here!

import org.teherba.tile.TilingSequence;

/**
 * A310308 Coordination sequence Gal.4.20.1 where G.u.t.v denotes the coordination sequence for a vertex of type v in tiling number t in the Galebach list of u-uniform tilings.
 * @author Georg Fischer
 */
public class A310308 extends TilingSequence {

  /** Construct the sequence. */
  public A310308() {
    super(0, new String[]
        { "6.6.6;A180+1,B180+2,B180-2"
        , "6.6.3.3;B180-1,A180+2,C60+1,D0+3"
        , "6.3.3.3.3;B300+3,C60-2,D120+5,C180+4,D300+4"
        , "3.3.3.3.3.3;C120-5,B180-4,B0+4,C60+5,C240+3,C300-3"
        });
    defineBaseSet(0);
  }
}
