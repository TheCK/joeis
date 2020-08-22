package irvine.oeis.a312;
// Generated by gen_seq4.pl tile1 at 2020-05-30 23:34
// DO NOT EDIT here!

import org.teherba.tile.TilingSequence;

/**
 * A312743 Coordination sequence Gal.6.580.1 where G.u.t.v denotes the coordination sequence for a vertex of type v in tiling number t in the Galebach list of u-uniform tilings.
 * @author Georg Fischer
 */
public class A312743 extends TilingSequence {

  /** Construct the sequence. */
  public A312743() {
    super(0, new String[]
        { "6.3.6.3;A180-1,B300+1,A180-3,C300+3"
        , "6.3.6.3;A60+2,A60-2,A240+2,A240-2"
        , "6.3.6.3;D60+2,A240-4,A60+4,D240-2"
        , "6.3.3.3.3;D180-1,C300+1,D180-3,E180+4,F180+5"
        , "4.4.3.3.3;F0+3,E180+2,F0+1,D180+4,D0-4"
        , "4.4.3.3.3;E0+3,F180+2,E0+1,D0-5,D180+5"
        });
    defineBaseSet(0);
  }
}
