package irvine.oeis.a313;
// Generated by gen_seq4.pl tile1 at 2020-05-30 23:34
// DO NOT EDIT here!

import org.teherba.tile.TilingSequence;

/**
 * A313266 Coordination sequence Gal.5.222.1 where G.u.t.v denotes the coordination sequence for a vertex of type v in tiling number t in the Galebach list of u-uniform tilings.
 * @author Georg Fischer
 */
public class A313266 extends TilingSequence {

  /** Construct the sequence. */
  public A313266() {
    super(0, new String[]
        { "6.4.3.4;A180-1,B300+1,C30+1,D270+3"
        , "6.4.3.4;A60+2,A60-2,E30+1,E210+4"
        , "4.3.4.3.3;A330+3,E120+3,C120-3,D60+1,D240+4"
        , "4.4.3.3.3;C300+4,D0-2,A90+4,C120+5,D180+5"
        , "4.3.4.3.3;B330+3,C0-2,C240+2,B150+4,E180+5"
        });
    defineBaseSet(0);
  }
}
