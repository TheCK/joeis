package irvine.oeis.a310;
// Generated by gen_seq4.pl tile1 at 2020-05-30 23:34
// DO NOT EDIT here!

import org.teherba.tile.TilingSequence;

/**
 * A310366 Coordination sequence Gal.6.357.1 where G.u.t.v denotes the coordination sequence for a vertex of type v in tiling number t in the Galebach list of u-uniform tilings.
 * @author Georg Fischer
 */
public class A310366 extends TilingSequence {

  /** Construct the sequence. */
  public A310366() {
    super(0, new String[]
        { "4.4.4.4;A180+1,B180+2,A180+3,C0+2"
        , "4.4.3.3.3;C0+3,A180+2,C0+1,D180+4,D0-4"
        , "4.4.3.3.3;B0+3,A0+4,B0+1,D0-5,D180+5"
        , "4.4.3.3.3;D180-1,E60+3,D180-3,B180+4,C180+5"
        , "6.4.4.3;F240+4,E60-2,D300+2,E60-4"
        , "6.3.6.3;E180-1,E300+1,E0-1,E120+1"
        });
    defineBaseSet(0);
  }
}
