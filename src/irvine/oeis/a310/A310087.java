package irvine.oeis.a310;
// Generated by gen_seq4.pl tile1 at 2020-05-30 23:34
// DO NOT EDIT here!

import org.teherba.tile.TilingSequence;

/**
 * A310087 Coordination sequence Gal.6.113.1 where G.u.t.v denotes the coordination sequence for a vertex of type v in tiling number t in the Galebach list of u-uniform tilings.
 * @author Georg Fischer
 */
public class A310087 extends TilingSequence {

  /** Construct the sequence. */
  public A310087() {
    super(0, new String[]
        { "12.12.3;B30+2,A180+2,B270-2"
        , "12.3.4.3;C180-1,A330+1,B240-3,D120+1"
        , "12.4.3.3;B180-1,C120-2,E240-3,D60-5"
        , "4.4.3.3.3;B240+4,D0-2,F0+1,E180+4,C60-4"
        , "4.4.3.3.3;F0+3,E0-2,C240-3,D180+4,F180+5"
        , "4.4.3.3.3;D0+3,F0-2,E0+1,F180+4,E180+5"
        });
    defineBaseSet(0);
  }
}
