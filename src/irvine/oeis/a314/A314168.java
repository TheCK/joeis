package irvine.oeis.a314;
// Generated by gen_seq4.pl tile1 at 2020-05-30 23:34
// DO NOT EDIT here!

import org.teherba.tile.TilingSequence;

/**
 * A314168 Coordination sequence Gal.4.138.1 where G.u.t.v denotes the coordination sequence for a vertex of type v in tiling number t in the Galebach list of u-uniform tilings.
 * @author Georg Fischer
 */
public class A314168 extends TilingSequence {

  /** Construct the sequence. */
  public A314168() {
    super(0, new String[]
        { "4.4.3.3.3;A180-1,A0-2,B210+3,A300-4,C0+3"
        , "4.3.4.3.3;B300+4,A90-3,A150+3,B60+1,D180+6"
        , "3.3.3.3.3.3;A240+5,A180-5,A0+5,A300-5,A120+5,A60-5"
        , "3.3.3.3.3.3;B240+5,B300+5,B0+5,B60+5,B120+5,B180+5"
        });
    defineBaseSet(0);
  }
}
