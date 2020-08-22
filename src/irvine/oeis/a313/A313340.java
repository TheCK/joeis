package irvine.oeis.a313;
// Generated by gen_seq4.pl tile1 at 2020-05-30 23:34
// DO NOT EDIT here!

import org.teherba.tile.TilingSequence;

/**
 * A313340 Coordination sequence Gal.4.97.1 where G.u.t.v denotes the coordination sequence for a vertex of type v in tiling number t in the Galebach list of u-uniform tilings.
 * @author Georg Fischer
 */
public class A313340 extends TilingSequence {

  /** Construct the sequence. */
  public A313340() {
    super(0, new String[]
        { "6.4.4.3;B60+2,A60-2,A240-3,C120+1"
        , "6.3.3.3.3;A180-1,A300+1,C60+5,D120+5,C60-5"
        , "4.3.4.3.3;A240+4,C0-2,D240+2,D60+1,B300+3"
        , "4.3.4.3.3;C300+4,C120+3,C120-3,C300-4,B240+4"
        });
    defineBaseSet(0);
  }
}
