package irvine.oeis.a312;
// Generated by gen_seq4.pl tile1 at 2020-05-30 23:34
// DO NOT EDIT here!

import org.teherba.tile.TilingSequence;

/**
 * A312983 Coordination sequence Gal.3.25.2 where G.u.t.v denotes the coordination sequence for a vertex of type v in tiling number t in the Galebach list of u-uniform tilings.
 * @author Georg Fischer
 */
public class A312983 extends TilingSequence {

  /** Construct the sequence. */
  public A312983() {
    super(0, new String[]
        { "6.4.4.3;A180-1,B300+1,A180+3,C330+3"
        , "6.4.3.4;A60+2,A60-2,C30+1,C210+4"
        , "4.3.4.3.3;B330+3,A210-4,A30+4,B150+4,C180+5"
        });
    defineBaseSet(1);
  }
}
