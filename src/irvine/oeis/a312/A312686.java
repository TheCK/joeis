package irvine.oeis.a312;
// Generated by gen_seq4.pl tile1 at 2020-05-30 23:34
// DO NOT EDIT here!

import org.teherba.tile.TilingSequence;

/**
 * A312686 Coordination sequence Gal.4.91.1 where G.u.t.v denotes the coordination sequence for a vertex of type v in tiling number t in the Galebach list of u-uniform tilings.
 * @author Georg Fischer
 */
public class A312686 extends TilingSequence {

  /** Construct the sequence. */
  public A312686() {
    super(0, new String[]
        { "6.4.4.3;B60+2,A60-2,A240-3,A60-4"
        , "6.3.6.3;C60+2,A300+1,A0-1,C240-2"
        , "6.3.3.3.3;C180-1,B300+1,C180-3,D180+5,D0+3"
        , "3.3.3.3.3.3;D180+1,C180-5,C0+5,D180+4,C180+4,C0-4"
        });
    defineBaseSet(0);
  }
}
