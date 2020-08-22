package irvine.oeis.a310;
// Generated by gen_seq4.pl tile1 at 2020-05-30 23:34
// DO NOT EDIT here!

import org.teherba.tile.TilingSequence;

/**
 * A310156 Coordination sequence Gal.6.43.1 where G.u.t.v denotes the coordination sequence for a vertex of type v in tiling number t in the Galebach list of u-uniform tilings.
 * @author Georg Fischer
 */
public class A310156 extends TilingSequence {

  /** Construct the sequence. */
  public A310156() {
    super(0, new String[]
        { "6.6.6;A180+1,B180+2,B180+3"
        , "6.6.6;C60+2,A180+2,A180+3"
        , "6.6.6;D60+2,B300+1,D60+1"
        , "6.6.6;C300+3,C300+1,E300+2"
        , "6.6.3.3;F60+2,D60+3,F60+1,F240+4"
        , "6.3.3.3.3;E300+3,E300+1,F180+3,E120+4,F180+5"
        });
    defineBaseSet(0);
  }
}
