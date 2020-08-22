package irvine.oeis.a313;
// Generated by gen_seq4.pl tile1 at 2020-05-30 23:34
// DO NOT EDIT here!

import org.teherba.tile.TilingSequence;

/**
 * A313020 Coordination sequence Gal.5.146.1 where G.u.t.v denotes the coordination sequence for a vertex of type v in tiling number t in the Galebach list of u-uniform tilings.
 * @author Georg Fischer
 */
public class A313020 extends TilingSequence {

  /** Construct the sequence. */
  public A313020() {
    super(0, new String[]
        { "6.4.4.3;A180-1,A60-2,B300+2,C210+4"
        , "4.4.3.3.3;D330+3,A60+3,B180-3,E60+1,B60-5"
        , "6.4.3.4;D60+2,D300+1,A330-4,A150+4"
        , "6.4.3.4;C60+2,C300+1,B30+1,B90-1"
        , "3.3.3.3.3.3;B300+4,B120-4,B60+4,B240-4,B180+4,B0-4"
        });
    defineBaseSet(0);
  }
}
