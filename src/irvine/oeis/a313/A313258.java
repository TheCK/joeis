package irvine.oeis.a313;
// Generated by gen_seq4.pl tile1 at 2020-05-30 23:34
// DO NOT EDIT here!

import org.teherba.tile.TilingSequence;

/**
 * A313258 Coordination sequence Gal.4.54.1 where G.u.t.v denotes the coordination sequence for a vertex of type v in tiling number t in the Galebach list of u-uniform tilings.
 * @author Georg Fischer
 */
public class A313258 extends TilingSequence {

  /** Construct the sequence. */
  public A313258() {
    super(0, new String[]
        { "4.4.4.4;A0+3,A180+2,A0+1,B0+2"
        , "4.4.3.3.3;B0+3,A0+4,B0+1,C0+2,C0+3"
        , "3.3.3.3.3.3;C0+4,B0+4,B0+5,C0+1,D180+4,D180+5"
        , "4.4.3.3.3;D0+3,D180+2,D0+1,C180+5,C180+6"
        });
    defineBaseSet(0);
  }
}
