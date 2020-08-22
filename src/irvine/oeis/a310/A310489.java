package irvine.oeis.a310;
// Generated by gen_seq4.pl tile1 at 2020-05-30 23:34
// DO NOT EDIT here!

import org.teherba.tile.TilingSequence;

/**
 * A310489 Coordination sequence Gal.4.127.1 where G.u.t.v denotes the coordination sequence for a vertex of type v in tiling number t in the Galebach list of u-uniform tilings.
 * @author Georg Fischer
 */
public class A310489 extends TilingSequence {

  /** Construct the sequence. */
  public A310489() {
    super(0, new String[]
        { "6.3.6.3;B60+2,B60-2,B240+2,B240-2"
        , "6.3.3.3.3;B180-1,A300+1,B180-3,C180+4,D180+5"
        , "4.4.3.3.3;D0+3,D180+2,D0+1,B180+4,B0-4"
        , "4.4.3.3.3;C0+3,C180+2,C0+1,B0-5,B180+5"
        });
    defineBaseSet(0);
  }
}
