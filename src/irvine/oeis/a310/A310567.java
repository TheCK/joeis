package irvine.oeis.a310;
// Generated by gen_seq4.pl tile1 at 2020-05-30 23:34
// DO NOT EDIT here!

import org.teherba.tile.TilingSequence;

/**
 * A310567 Coordination sequence Gal.6.369.1 where G.u.t.v denotes the coordination sequence for a vertex of type v in tiling number t in the Galebach list of u-uniform tilings.
 * @author Georg Fischer
 */
public class A310567 extends TilingSequence {

  /** Construct the sequence. */
  public A310567() {
    super(0, new String[]
        { "4.4.4.4;B90+2,C180+2,B270+2,C0+2"
        , "4.4.3.3.3;D300+4,A270+1,D240-4,E180+4,E0-4"
        , "4.4.3.3.3;D330-3,A180+2,D210+3,F120+5,F60-5"
        , "4.3.4.3.3;F90+2,F270+1,C150+3,B60+1,E60-5"
        , "4.4.3.3.3;F330-3,E0-2,E180-3,B180+4,D60-5"
        , "4.3.4.3.3;D90+2,D270+1,E330-1,F300-4,C240+4"
        });
    defineBaseSet(0);
  }
}
