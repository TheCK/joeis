package irvine.oeis.a310;
// Generated by gen_seq4.pl tile1 at 2020-05-30 23:34
// DO NOT EDIT here!

import org.teherba.tile.TilingSequence;

/**
 * A310236 Coordination sequence Gal.5.6.1 where G.u.t.v denotes the coordination sequence for a vertex of type v in tiling number t in the Galebach list of u-uniform tilings.
 * @author Georg Fischer
 */
public class A310236 extends TilingSequence {

  /** Construct the sequence. */
  public A310236() {
    super(0, new String[]
        { "6.6.6;A180-1,A180+2,B300+2"
        , "6.6.3.3;C300+3,A60+3,B300-3,D0+3"
        , "6.6.3.3;E300+3,C60-2,B60+1,D60+2"
        , "3.3.3.3.3.3;E240+4,C300+4,B0+4,B300-4,C0-4,E60-4"
        , "6.6.3.3;E180-1,E180+2,C60+1,D120+1"
        });
    defineBaseSet(0);
  }
}
