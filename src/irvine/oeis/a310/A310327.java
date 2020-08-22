package irvine.oeis.a310;
// Generated by gen_seq4.pl tile1 at 2020-05-30 23:34
// DO NOT EDIT here!

import org.teherba.tile.TilingSequence;

/**
 * A310327 Coordination sequence Gal.6.76.1 where G.u.t.v denotes the coordination sequence for a vertex of type v in tiling number t in the Galebach list of u-uniform tilings.
 * @author Georg Fischer
 */
public class A310327 extends TilingSequence {

  /** Construct the sequence. */
  public A310327() {
    super(0, new String[]
        { "6.6.6;B60+2,B180+2,B300+2"
        , "6.6.3.3;C60+2,A300+1,D60+1,C240+4"
        , "6.3.3.3.3;E60+2,B300+1,C180+3,B120+4,D180+5"
        , "6.3.3.3.3;B300+3,E300+1,F120+4,E240+3,C180+5"
        , "6.3.3.3.3;D60+2,C300+1,D120+4,F240+3,F180+5"
        , "6.3.3.3.3;F60+2,F300+1,E120+4,D240+3,E180+5"
        });
    defineBaseSet(0);
  }
}
