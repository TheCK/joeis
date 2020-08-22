package irvine.oeis.a310;
// Generated by gen_seq4.pl tile1 at 2020-05-30 23:34
// DO NOT EDIT here!

import org.teherba.tile.TilingSequence;

/**
 * A310436 Coordination sequence Gal.6.557.1 where G.u.t.v denotes the coordination sequence for a vertex of type v in tiling number t in the Galebach list of u-uniform tilings.
 * @author Georg Fischer
 */
public class A310436 extends TilingSequence {

  /** Construct the sequence. */
  public A310436() {
    super(0, new String[]
        { "6.6.3.3;B60+2,A180+2,B180-2,C0+3"
        , "6.3.3.3.3;D60+2,A300+1,C300+2,E0+2,B60-5"
        , "3.3.3.3.3.3;E60+3,B60+3,A0+4,B180-3,E120+6,F240+4"
        , "6.3.6.3;D240+4,B300+1,B0-1,D120+1"
        , "3.3.3.3.3.3;B60-4,B0+4,C300+1,F180+3,F120+5,C240+5"
        , "6.3.3.3.3;F60+2,F300+1,E180+4,C120+6,E240+5"
        });
    defineBaseSet(0);
  }
}
