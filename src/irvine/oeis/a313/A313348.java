package irvine.oeis.a313;
// Generated by gen_seq4.pl tile1 at 2020-05-30 23:34
// DO NOT EDIT here!

import org.teherba.tile.TilingSequence;

/**
 * A313348 Coordination sequence Gal.6.489.1 where G.u.t.v denotes the coordination sequence for a vertex of type v in tiling number t in the Galebach list of u-uniform tilings.
 * @author Georg Fischer
 */
public class A313348 extends TilingSequence {

  /** Construct the sequence. */
  public A313348() {
    super(0, new String[]
        { "6.4.3.4;A60+2,A300+1,B30+1,B90-1"
        , "4.3.4.3.3;A330+3,B0-2,C240+2,D270+3,B60-5"
        , "4.3.4.3.3;E300+4,B120+3,B120-3,E60+1,F120+1"
        , "4.3.4.3.3;E90+2,B150-4,B90+4,E270+3,D180+5"
        , "4.3.4.3.3;C300+4,D270+1,D90+4,C60+1,F180+6"
        , "3.3.3.3.3.3;C240+5,E300+5,C0+5,E60+5,C120+5,E180+5"
        });
    defineBaseSet(0);
  }
}
