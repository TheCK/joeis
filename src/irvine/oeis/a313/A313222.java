package irvine.oeis.a313;
// Generated by gen_seq4.pl tile1 at 2020-05-30 23:34
// DO NOT EDIT here!

import org.teherba.tile.TilingSequence;

/**
 * A313222 Coordination sequence Gal.6.456.1 where G.u.t.v denotes the coordination sequence for a vertex of type v in tiling number t in the Galebach list of u-uniform tilings.
 * @author Georg Fischer
 */
public class A313222 extends TilingSequence {

  /** Construct the sequence. */
  public A313222() {
    super(0, new String[]
        { "6.4.4.3;B240+4,C60-2,D300+2,A60-4"
        , "6.3.6.3;A180-1,A300+1,A0-1,A120+1"
        , "6.4.4.3;E180-1,A60-2,C180+3,D300-3"
        , "4.4.3.3.3;D180-1,A60+3,C300-4,E120+5,F0+3"
        , "6.3.3.3.3;C180-1,C300+1,D240-4,F60+1,D240+4"
        , "3.3.3.3.3.3;E300+4,D180-5,D0+5,E120+4,D0-5,D180+5"
        });
    defineBaseSet(0);
  }
}
