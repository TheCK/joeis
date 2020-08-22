package irvine.oeis.a310;
// Generated by gen_seq4.pl tile1 at 2020-05-30 23:34
// DO NOT EDIT here!

import org.teherba.tile.TilingSequence;

/**
 * A310165 Coordination sequence Gal.5.4.1 where G.u.t.v denotes the coordination sequence for a vertex of type v in tiling number t in the Galebach list of u-uniform tilings.
 * @author Georg Fischer
 */
public class A310165 extends TilingSequence {

  /** Construct the sequence. */
  public A310165() {
    super(0, new String[]
        { "6.6.6;A180+1,A180+2,B300+2"
        , "6.6.6;C60+2,A60+3,C60+1"
        , "6.6.6;B300+3,B300+1,D300+2"
        , "6.6.3.3;E60+2,C60+3,E60+1,D180+4"
        , "6.3.6.3;D300+3,D300+1,D120+3,D120+1"
        });
    defineBaseSet(0);
  }
}
