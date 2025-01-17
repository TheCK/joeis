package irvine.oeis.a313;
// Generated by gen_seq4.pl tile1 at 2020-05-30 23:34
// DO NOT EDIT here!

import org.teherba.tile.TilingSequence;

/**
 * A313143 Coordination sequence Gal.5.128.1 where G.u.t.v denotes the coordination sequence for a vertex of type v in tiling number t in the Galebach list of u-uniform tilings.
 * @author Georg Fischer
 */
public class A313143 extends TilingSequence {

  /** Construct the sequence. */
  public A313143() {
    super(0, new String[]
        { "4.4.4.4;A180+1,B120-3,C270+2,B240+3"
        , "6.4.4.3;B180-1,B60-2,A120-2,D210-2"
        , "4.4.3.3.3;D300+4,A90+3,D0+1,E240+3,E180+5"
        , "4.3.4.3.3;C0+3,B210-4,B30+4,C60+1,E240+4"
        , "6.3.3.3.3;E60+2,E300+1,C120+4,D120+5,C180+5"
        });
    defineBaseSet(0);
  }
}
