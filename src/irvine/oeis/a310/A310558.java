package irvine.oeis.a310;
// Generated by gen_seq4.pl tile1 at 2020-05-30 23:34
// DO NOT EDIT here!

import org.teherba.tile.TilingSequence;

/**
 * A310558 Coordination sequence Gal.6.363.1 where G.u.t.v denotes the coordination sequence for a vertex of type v in tiling number t in the Galebach list of u-uniform tilings.
 * @author Georg Fischer
 */
public class A310558 extends TilingSequence {

  /** Construct the sequence. */
  public A310558() {
    super(0, new String[]
        { "4.4.4.4;A180+1,B180+2,C270+2,D0+2"
        , "4.4.3.3.3;E300+4,A180+2,D0+1,B180+4,D180+5"
        , "4.4.3.3.3;F300+4,A90+3,E210+3,F120+5,C180+5"
        , "4.4.3.3.3;B0+3,A0+4,F210+3,E120+5,B180+5"
        , "4.3.4.3.3;F90+2,F270+1,C150+3,B60+1,D240+4"
        , "4.3.4.3.3;E90+2,E270+1,D150+3,C60+1,C240+4"
        });
    defineBaseSet(0);
  }
}
