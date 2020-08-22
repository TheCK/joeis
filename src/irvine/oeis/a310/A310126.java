package irvine.oeis.a310;
// Generated by gen_seq4.pl tile1 at 2020-05-30 23:34
// DO NOT EDIT here!

import org.teherba.tile.TilingSequence;

/**
 * A310126 Coordination sequence Gal.5.28.1 where G.u.t.v denotes the coordination sequence for a vertex of type v in tiling number t in the Galebach list of u-uniform tilings.
 * @author Georg Fischer
 */
public class A310126 extends TilingSequence {

  /** Construct the sequence. */
  public A310126() {
    super(0, new String[]
        { "6.6.6;B60+2,B180+2,B300+2"
        , "6.6.6;C60+2,A300+1,C180-2"
        , "6.6.3.3;D60+2,B300+1,E60+1,E300+3"
        , "6.3.6.3;C180-1,C300+1,E240+2,E240-2"
        , "6.3.3.3.3;C300+3,D120+3,C60+4,E120+5,E240+4"
        });
    defineBaseSet(0);
  }
}
