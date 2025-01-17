package irvine.oeis.a310;
// Generated by gen_seq4.pl tile1 at 2020-05-30 23:34
// DO NOT EDIT here!

import org.teherba.tile.TilingSequence;

/**
 * A310455 Coordination sequence Gal.6.348.1 where G.u.t.v denotes the coordination sequence for a vertex of type v in tiling number t in the Galebach list of u-uniform tilings.
 * @author Georg Fischer
 */
public class A310455 extends TilingSequence {

  /** Construct the sequence. */
  public A310455() {
    super(0, new String[]
        { "4.4.4.4;A0+3,B180+2,A0+1,C0+2"
        , "4.4.3.3.3;B0+3,A180+2,B0+1,D180+4,D180+5"
        , "4.4.3.3.3;C0+3,A0+4,C0+1,E0+2,E0+3"
        , "4.4.3.3.3;D0+3,F180+2,D0+1,B180+4,B180+5"
        , "3.3.3.3.3.3;E0+4,C0+4,C0+5,E0+1,C180+4,C180+5"
        , "4.4.3.3.3;F0+3,D180+2,F0+1,F180+4,F180+5"
        });
    defineBaseSet(0);
  }
}
