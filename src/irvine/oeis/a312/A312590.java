package irvine.oeis.a312;
// Generated by gen_seq4.pl tile1 at 2020-05-30 23:34
// DO NOT EDIT here!

import org.teherba.tile.TilingSequence;

/**
 * A312590 Coordination sequence Gal.6.266.1 where G.u.t.v denotes the coordination sequence for a vertex of type v in tiling number t in the Galebach list of u-uniform tilings.
 * @author Georg Fischer
 */
public class A312590 extends TilingSequence {

  /** Construct the sequence. */
  public A312590() {
    super(0, new String[]
        { "4.4.4.4;A180-1,B180+2,B0+1,C240+3"
        , "4.4.4.4;A0+3,A180+2,B180-3,D0+2"
        , "6.4.4.3;E60+2,C60-2,A120+4,D120+1"
        , "4.4.3.3.3;C240+4,B0+4,D180-3,F180+5,E300+3"
        , "6.3.3.3.3;C180-1,C300+1,D60+5,F60+1,D60-5"
        , "3.3.3.3.3.3;E300+4,D0+4,D180-4,E120+4,D180+4,D0-4"
        });
    defineBaseSet(0);
  }
}
