package irvine.oeis.a311;
// Generated by gen_seq4.pl tile1 at 2020-05-30 23:34
// DO NOT EDIT here!

import org.teherba.tile.TilingSequence;

/**
 * A311234 Coordination sequence Gal.6.287.1 where G.u.t.v denotes the coordination sequence for a vertex of type v in tiling number t in the Galebach list of u-uniform tilings.
 * @author Georg Fischer
 */
public class A311234 extends TilingSequence {

  /** Construct the sequence. */
  public A311234() {
    super(0, new String[]
        { "4.4.4.4;A180+1,B60+3,A180+3,B300-3"
        , "6.4.4.3;C60+2,B60-2,A300+2,B60-4"
        , "6.3.6.3;D300+3,B300+1,B0-1,D0-3"
        , "6.6.3.3;E60+2,D60-2,C60+1,D60-4"
        , "6.3.6.3;F180-1,D300+1,D0-1,F120+1"
        , "6.4.4.3;E180-1,F60-2,F180+3,F60-4"
        });
    defineBaseSet(0);
  }
}
