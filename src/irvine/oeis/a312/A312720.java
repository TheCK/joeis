package irvine.oeis.a312;
// Generated by gen_seq4.pl tile1 at 2020-05-30 23:34
// DO NOT EDIT here!

import org.teherba.tile.TilingSequence;

/**
 * A312720 Coordination sequence Gal.6.583.1 where G.u.t.v denotes the coordination sequence for a vertex of type v in tiling number t in the Galebach list of u-uniform tilings.
 * @author Georg Fischer
 */
public class A312720 extends TilingSequence {

  /** Construct the sequence. */
  public A312720() {
    super(0, new String[]
        { "6.3.6.3;A180-1,B300+1,C240+2,D300+3"
        , "6.3.6.3;A60+2,A60-2,C60+4,C300+3"
        , "6.3.6.3;A0-3,A120+3,B60+4,B300+3"
        , "6.3.6.3;E60+2,A240-4,A60+4,E120+1"
        , "6.3.3.3.3;D240+4,D300+1,E60+5,F0+2,E300+3"
        , "3.3.3.3.3.3;E300+4,E0+4,E60+4,E120+4,E180+4,E240+4"
        });
    defineBaseSet(0);
  }
}
