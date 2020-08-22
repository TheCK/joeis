package irvine.oeis.a311;
// Generated by gen_seq4.pl tile1 at 2020-05-30 23:34
// DO NOT EDIT here!

import org.teherba.tile.TilingSequence;

/**
 * A311625 Coordination sequence Gal.5.99.1 where G.u.t.v denotes the coordination sequence for a vertex of type v in tiling number t in the Galebach list of u-uniform tilings.
 * @author Georg Fischer
 */
public class A311625 extends TilingSequence {

  /** Construct the sequence. */
  public A311625() {
    super(0, new String[]
        { "4.4.4.4;A0+3,B180+2,A0+1,B0+2"
        , "4.4.4.4;B0+3,A180+2,B0+1,C0+2"
        , "4.4.4.4;C0+3,B0+4,C0+1,D0+2"
        , "4.4.3.3.3;D0+3,C0+4,D0+1,E180+5,E180+6"
        , "3.3.3.3.3.3;E0+4,D0+4,D0+5,E0+1,D180+4,D180+5"
        });
    defineBaseSet(0);
  }
}
