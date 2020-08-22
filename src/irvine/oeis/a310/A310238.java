package irvine.oeis.a310;
// Generated by gen_seq4.pl tile1 at 2020-05-30 23:34
// DO NOT EDIT here!

import org.teherba.tile.TilingSequence;

/**
 * A310238 Coordination sequence Gal.4.7.1 where G.u.t.v denotes the coordination sequence for a vertex of type v in tiling number t in the Galebach list of u-uniform tilings.
 * @author Georg Fischer
 */
public class A310238 extends TilingSequence {

  /** Construct the sequence. */
  public A310238() {
    super(0, new String[]
        { "6.6.6;A60+2,A300+1,B300+2"
        , "6.6.3.3;C300+3,A60+3,C60+1,D0+3"
        , "6.6.3.3;B300+3,C180+2,B60+1,D60+2"
        , "3.3.3.3.3.3;B240+4,C300+4,B0+4,C60+4,B120+4,C180+4"
        });
    defineBaseSet(0);
  }
}
