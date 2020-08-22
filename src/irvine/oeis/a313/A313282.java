package irvine.oeis.a313;
// Generated by gen_seq4.pl tile1 at 2020-05-30 23:34
// DO NOT EDIT here!

import org.teherba.tile.TilingSequence;

/**
 * A313282 Coordination sequence Gal.6.491.1 where G.u.t.v denotes the coordination sequence for a vertex of type v in tiling number t in the Galebach list of u-uniform tilings.
 * @author Georg Fischer
 */
public class A313282 extends TilingSequence {

  /** Construct the sequence. */
  public A313282() {
    super(0, new String[]
        { "6.4.3.4;A180-1,B300+1,C240+3,A0-4"
        , "6.4.3.4;A60+2,A60-2,D240+3,D240-3"
        , "4.3.4.3.3;D300+4,A120-3,A120+3,D300-4,E0+3"
        , "4.3.4.3.3;F0+3,D0-2,B120+3,C60+1,E60+2"
        , "3.3.3.3.3.3;F300+4,D300+5,C0+5,D300-5,F120+5,E180+6"
        , "4.4.3.3.3;D180-1,F180+2,D0+1,E60+1,E240+5"
        });
    defineBaseSet(0);
  }
}
