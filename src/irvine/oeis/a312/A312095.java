package irvine.oeis.a312;
// Generated by gen_seq4.pl tile1 at 2020-05-30 23:34
// DO NOT EDIT here!

import org.teherba.tile.TilingSequence;

/**
 * A312095 Coordination sequence Gal.6.406.1 where G.u.t.v denotes the coordination sequence for a vertex of type v in tiling number t in the Galebach list of u-uniform tilings.
 * @author Georg Fischer
 */
public class A312095 extends TilingSequence {

  /** Construct the sequence. */
  public A312095() {
    super(0, new String[]
        { "6.4.4.3;B60+2,A60-2,A180+3,A60-4"
        , "6.3.6.3;C60+2,A300+1,A0-1,C240-2"
        , "6.3.6.3;C180-1,B300+1,C180-3,D300+3"
        , "6.3.6.3;E60+2,C240-4,C60+4,E240-2"
        , "6.3.6.3;E180-1,D300+1,E180-3,F120+1"
        , "6.3.6.3;E240+4,E240-4,E60+4,E60-4"
        });
    defineBaseSet(0);
  }
}
