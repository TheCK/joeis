package irvine.oeis.a310;
// Generated by gen_seq4.pl tile1 at 2020-05-30 23:34
// DO NOT EDIT here!

import org.teherba.tile.TilingSequence;

/**
 * A310488 Coordination sequence Gal.6.596.1 where G.u.t.v denotes the coordination sequence for a vertex of type v in tiling number t in the Galebach list of u-uniform tilings.
 * @author Georg Fischer
 */
public class A310488 extends TilingSequence {

  /** Construct the sequence. */
  public A310488() {
    super(0, new String[]
        { "6.3.6.3;B60+2,B60-2,C240+2,C240-2"
        , "6.3.3.3.3;B180-1,A300+1,C180-3,D180+4,E0+3"
        , "6.3.3.3.3;D180-1,A120+3,B180-3,D0-5,C180+5"
        , "6.3.3.3.3;C180-1,F300+1,E180+4,B180+4,C0-4"
        , "3.3.3.3.3.3;D0-3,B180-5,B0+5,D180+3,F120+5,F300+3"
        , "6.3.3.3.3;D60+2,D60-2,E60+6,F180+4,E240+5"
        });
    defineBaseSet(0);
  }
}
