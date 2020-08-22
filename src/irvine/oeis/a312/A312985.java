package irvine.oeis.a312;
// Generated by gen_seq4.pl tile1 at 2020-05-30 23:34
// DO NOT EDIT here!

import org.teherba.tile.TilingSequence;

/**
 * A312985 Coordination sequence Gal.6.566.1 where G.u.t.v denotes the coordination sequence for a vertex of type v in tiling number t in the Galebach list of u-uniform tilings.
 * @author Georg Fischer
 */
public class A312985 extends TilingSequence {

  /** Construct the sequence. */
  public A312985() {
    super(0, new String[]
        { "6.6.3.3;B60+2,C180+2,B60+1,B240+4"
        , "6.3.3.3.3;A300+3,A300+1,B180+3,A120+4,B180+5"
        , "6.6.3.3;D60+2,A180+2,D60+1,E0+3"
        , "6.3.3.3.3;C300+3,C300+1,E300+2,F0+2,E300+4"
        , "3.3.3.3.3.3;F60+3,D60+3,C0+4,D60+5,F60+1,E180+6"
        , "3.3.3.3.3.3;E300+5,D0+4,E300+1,E120+5,D180+4,E120+1"
        });
    defineBaseSet(0);
  }
}
