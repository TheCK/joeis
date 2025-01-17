package irvine.oeis.a312;
// Generated by gen_seq4.pl tile1 at 2020-05-30 23:34
// DO NOT EDIT here!

import org.teherba.tile.TilingSequence;

/**
 * A312594 Coordination sequence Gal.5.189.1 where G.u.t.v denotes the coordination sequence for a vertex of type v in tiling number t in the Galebach list of u-uniform tilings.
 * @author Georg Fischer
 */
public class A312594 extends TilingSequence {

  /** Construct the sequence. */
  public A312594() {
    super(0, new String[]
        { "6.4.4.3;B60+2,C60-2,A180+3,C60-4"
        , "6.3.6.3;D60+2,A300+1,C0-1,E120+1"
        , "6.4.4.3;B0-3,A60-2,C180+3,A60-4"
        , "6.3.3.3.3;E60+2,B300+1,E60+5,D180+4,E240+4"
        , "6.3.3.3.3;B240+4,D300+1,E180+3,D120+5,D300+3"
        });
    defineBaseSet(0);
  }
}
