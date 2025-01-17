package irvine.oeis.a310;
// Generated by gen_seq4.pl tile1 at 2020-05-30 23:34
// DO NOT EDIT here!

import org.teherba.tile.TilingSequence;

/**
 * A310403 Coordination sequence Gal.6.606.1 where G.u.t.v denotes the coordination sequence for a vertex of type v in tiling number t in the Galebach list of u-uniform tilings.
 * @author Georg Fischer
 */
public class A310403 extends TilingSequence {

  /** Construct the sequence. */
  public A310403() {
    super(0, new String[]
        { "6.3.6.3;B60+2,C300+1,D240+2,E120+1"
        , "6.3.3.3.3;A180-1,A300+1,E60+5,F180+4,E60-5"
        , "6.3.3.3.3;A60+2,F300+1,E180+3,D120+5,D300+3"
        , "6.3.3.3.3;E60+2,A120+3,C60+5,D180+4,C240+4"
        , "6.3.3.3.3;A240+4,D300+1,C180+3,F120+5,B300+3"
        , "6.3.3.3.3;C60+2,C60-2,E240-4,B180+4,E240+4"
        });
    defineBaseSet(0);
  }
}
