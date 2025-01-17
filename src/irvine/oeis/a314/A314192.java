package irvine.oeis.a314;
// Generated by gen_seq4.pl tile1 at 2020-05-30 23:34
// DO NOT EDIT here!

import org.teherba.tile.TilingSequence;

/**
 * A314192 Coordination sequence Gal.6.651.1 where G.u.t.v denotes the coordination sequence for a vertex of type v in tiling number t in the Galebach list of u-uniform tilings.
 * @author Georg Fischer
 */
public class A314192 extends TilingSequence {

  /** Construct the sequence. */
  public A314192() {
    super(0, new String[]
        { "4.4.3.3.3;B0+3,B180+2,C210+3,D120+5,E0+3"
        , "4.4.3.3.3;F300+4,A180+2,A0+1,E0+2,E180+6"
        , "4.3.4.3.3;F90+2,D270+1,A150+3,F270+3,C180+5"
        , "4.4.3.3.3;C90+2,D180+2,F0+1,E240+4,A240+4"
        , "3.3.3.3.3.3;E180+1,B0+4,A0+5,D120+4,F120+5,B180+5"
        , "4.3.4.3.3;D0+3,C270+1,C90+4,B60+1,E240+5"
        });
    defineBaseSet(0);
  }
}
