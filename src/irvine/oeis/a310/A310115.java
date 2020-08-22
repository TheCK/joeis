package irvine.oeis.a310;
// Generated by gen_seq4.pl tile1 at 2020-05-30 23:34
// DO NOT EDIT here!

import org.teherba.tile.TilingSequence;

/**
 * A310115 Coordination sequence Gal.6.89.1 where G.u.t.v denotes the coordination sequence for a vertex of type v in tiling number t in the Galebach list of u-uniform tilings.
 * @author Georg Fischer
 */
public class A310115 extends TilingSequence {

  /** Construct the sequence. */
  public A310115() {
    super(0, new String[]
        { "12.6.4;A180-1,A120-2,B90+1"
        , "6.4.3.4;A270+3,C300+1,D240+3,B0-4"
        , "6.4.3.4;B60+2,C60-2,E30+1,F210+4"
        , "4.3.4.3.3;F90+2,B120-3,B120+3,F270+3,D180+5"
        , "4.3.4.3.3;C330+3,E120+3,E240+2,C270-3,F180+5"
        , "4.3.4.3.3;C90-4,D270+1,D90+4,C150+4,E180+5"
        });
    defineBaseSet(0);
  }
}
