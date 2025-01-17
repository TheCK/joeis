package irvine.oeis.a313;
// Generated by gen_seq4.pl tile1 at 2020-05-30 23:34
// DO NOT EDIT here!

import org.teherba.tile.TilingSequence;

/**
 * A313248 Coordination sequence Gal.6.494.1 where G.u.t.v denotes the coordination sequence for a vertex of type v in tiling number t in the Galebach list of u-uniform tilings.
 * @author Georg Fischer
 */
public class A313248 extends TilingSequence {

  /** Construct the sequence. */
  public A313248() {
    super(0, new String[]
        { "6.4.3.4;A180-1,B300+1,C30+1,D270+3"
        , "6.4.3.4;A60+2,A60-2,E240+3,E240-3"
        , "4.3.4.3.3;A330+3,E150-4,F150+3,C300-4,D240+4"
        , "4.4.3.3.3;A90-4,D180+2,A90+4,C120+5,C60-5"
        , "4.3.4.3.3;F180-1,E0-2,B120+3,C150-2,F0-4"
        , "4.4.3.3.3;E180-1,F0-2,C210+3,E0-5,F180+5"
        });
    defineBaseSet(0);
  }
}
