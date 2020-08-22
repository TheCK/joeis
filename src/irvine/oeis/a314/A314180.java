package irvine.oeis.a314;
// Generated by gen_seq4.pl tile1 at 2020-05-30 23:34
// DO NOT EDIT here!

import org.teherba.tile.TilingSequence;

/**
 * A314180 Coordination sequence Gal.6.645.1 where G.u.t.v denotes the coordination sequence for a vertex of type v in tiling number t in the Galebach list of u-uniform tilings.
 * @author Georg Fischer
 */
public class A314180 extends TilingSequence {

  /** Construct the sequence. */
  public A314180() {
    super(0, new String[]
        { "4.4.3.3.3;B0+3,A180+2,B180-3,C0+2,C180+6"
        , "4.4.3.3.3;D300+4,B0-2,A0+1,C180+5,E0+3"
        , "3.3.3.3.3.3;C180+1,A0+4,B180-4,E180+4,B180+4,A180+5"
        , "4.3.4.3.3;F300+4,F120+3,D120-3,B60+1,E60+2"
        , "3.3.3.3.3.3;F240+5,D300+5,B0+5,C180+4,B0-5,D60-5"
        , "4.3.4.3.3;D180-1,D0-2,D240+2,D60+1,E120+1"
        });
    defineBaseSet(0);
  }
}
