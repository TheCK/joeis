package irvine.oeis.a313;
// Generated by gen_seq4.pl tile1 at 2020-05-30 23:34
// DO NOT EDIT here!

import org.teherba.tile.TilingSequence;

/**
 * A313151 Coordination sequence Gal.6.382.1 where G.u.t.v denotes the coordination sequence for a vertex of type v in tiling number t in the Galebach list of u-uniform tilings.
 * @author Georg Fischer
 */
public class A313151 extends TilingSequence {

  /** Construct the sequence. */
  public A313151() {
    super(0, new String[]
        { "6.4.4.3;A180-1,B300+1,A180+3,C330+3"
        , "6.4.3.4;A60+2,D300+1,E30+1,C210+4"
        , "4.3.4.3.3;B90-4,A210-4,A30+4,B150+4,E180+5"
        , "6.4.3.4;B60+2,D60-2,F30+1,F210+4"
        , "4.3.4.3.3;B330+3,F120+3,F120-3,B270-3,C180+5"
        , "4.3.4.3.3;D330+3,F0-2,E240+2,D150+4,F180+5"
        });
    defineBaseSet(0);
  }
}
