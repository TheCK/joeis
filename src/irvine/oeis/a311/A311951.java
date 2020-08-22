package irvine.oeis.a311;
// Generated by gen_seq4.pl tile1 at 2020-05-30 23:34
// DO NOT EDIT here!

import org.teherba.tile.TilingSequence;

/**
 * A311951 Coordination sequence Gal.4.51.2 where G.u.t.v denotes the coordination sequence for a vertex of type v in tiling number t in the Galebach list of u-uniform tilings.
 * @author Georg Fischer
 */
public class A311951 extends TilingSequence {

  /** Construct the sequence. */
  public A311951() {
    super(0, new String[]
        { "4.4.4.4;A180-1,A0-2,A180-3,B240+3"
        , "6.4.4.3;C60+2,B60-2,A120+4,B60-4"
        , "6.3.6.3;D60+2,B300+1,B0-1,D60-4"
        , "6.3.6.3;D0-3,C300+1,D0-1,C120+1"
        });
    defineBaseSet(1);
  }
}
