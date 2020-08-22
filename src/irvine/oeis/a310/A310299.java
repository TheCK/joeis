package irvine.oeis.a310;
// Generated by gen_seq4.pl tile1 at 2020-05-30 23:34
// DO NOT EDIT here!

import org.teherba.tile.TilingSequence;

/**
 * A310299 Coordination sequence Gal.4.21.1 where G.u.t.v denotes the coordination sequence for a vertex of type v in tiling number t in the Galebach list of u-uniform tilings.
 * @author Georg Fischer
 */
public class A310299 extends TilingSequence {

  /** Construct the sequence. */
  public A310299() {
    super(0, new String[]
        { "6.6.6;A180+1,B180+2,B180-2"
        , "6.6.3.3;C60+2,A180+2,C240+3,B180+4"
        , "6.3.6.3;D60+2,B300+1,B120+3,C60-4"
        , "6.3.6.3;C180-1,C300+1,C0-1,C120+1"
        });
    defineBaseSet(0);
  }
}
