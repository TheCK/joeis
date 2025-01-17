package irvine.oeis.a313;
// Generated by gen_seq4.pl tile1 at 2020-05-30 23:34
// DO NOT EDIT here!

import org.teherba.tile.TilingSequence;

/**
 * A313087 Coordination sequence Gal.6.310.1 where G.u.t.v denotes the coordination sequence for a vertex of type v in tiling number t in the Galebach list of u-uniform tilings.
 * @author Georg Fischer
 */
public class A313087 extends TilingSequence {

  /** Construct the sequence. */
  public A313087() {
    super(0, new String[]
        { "4.4.4.4;A180-1,B60+3,A180-3,C0+2"
        , "6.4.4.3;D60+2,B60-2,A300+2,B60-4"
        , "4.4.3.3.3;C180-1,A0+4,C180-3,E0+2,E180+6"
        , "6.3.6.3;F180-1,B300+1,B0-1,F120+1"
        , "3.3.3.3.3.3;E180+1,C0+4,C180-4,E180+4,C0-5,C180+5"
        , "6.4.4.3;D180-1,F60-2,F180+3,F60-4"
        });
    defineBaseSet(0);
  }
}
