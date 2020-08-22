package irvine.oeis.a310;
// Generated by gen_seq4.pl tile1 at 2020-05-30 23:34
// DO NOT EDIT here!

import org.teherba.tile.TilingSequence;

/**
 * A310528 Coordination sequence Gal.5.215.1 where G.u.t.v denotes the coordination sequence for a vertex of type v in tiling number t in the Galebach list of u-uniform tilings.
 * @author Georg Fischer
 */
public class A310528 extends TilingSequence {

  /** Construct the sequence. */
  public A310528() {
    super(0, new String[]
        { "6.4.3.4;A60+2,A300+1,B240+3,B240-3"
        , "4.3.4.3.3;C90+2,B0-2,A120+3,B300-4,D240+4"
        , "4.3.4.3.3;C180-1,B270+1,D150+3,C300-4,E60+2"
        , "4.4.3.3.3;C330-3,D180+2,C210+3,B120+5,B60-5"
        , "3.3.3.3.3.3;C120-5,C300+5,C240-5,C60+5,C0-5,C180+5"
        });
    defineBaseSet(0);
  }
}
