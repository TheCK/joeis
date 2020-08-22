package irvine.oeis.a312;
// Generated by gen_seq4.pl tile1 at 2020-05-30 23:34
// DO NOT EDIT here!

import org.teherba.tile.TilingSequence;

/**
 * A312593 Coordination sequence Gal.6.454.1 where G.u.t.v denotes the coordination sequence for a vertex of type v in tiling number t in the Galebach list of u-uniform tilings.
 * @author Georg Fischer
 */
public class A312593 extends TilingSequence {

  /** Construct the sequence. */
  public A312593() {
    super(0, new String[]
        { "6.4.4.3;B240+4,C60-2,A240-3,A60-4"
        , "6.3.6.3;A180-1,A300+1,A0-1,A120+1"
        , "6.4.4.3;D180-1,A60-2,C240-3,E300-3"
        , "6.3.3.3.3;C180-1,C300+1,E240-4,F120+6,E240+4"
        , "4.4.3.3.3;E180-1,E0-2,C300-4,D120+5,F240+5"
        , "3.3.3.3.3.3;E120-5,E300+5,D60+4,E300-5,E120+5,D240+4"
        });
    defineBaseSet(0);
  }
}
