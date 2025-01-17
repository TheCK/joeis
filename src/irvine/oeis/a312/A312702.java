package irvine.oeis.a312;
// Generated by gen_seq4.pl tile1 at 2020-05-30 23:34
// DO NOT EDIT here!

import org.teherba.tile.TilingSequence;

/**
 * A312702 Coordination sequence Gal.6.508.1 where G.u.t.v denotes the coordination sequence for a vertex of type v in tiling number t in the Galebach list of u-uniform tilings.
 * @author Georg Fischer
 */
public class A312702 extends TilingSequence {

  /** Construct the sequence. */
  public A312702() {
    super(0, new String[]
        { "6.6.3.3;A300+3,B180+2,A60+1,C0+3"
        , "6.6.3.3;D60+2,A180+2,E60+1,F0+3"
        , "3.3.3.3.3.3;A240+4,A300+4,A0+4,A60+4,A120+4,A180+4"
        , "6.3.3.3.3;E60+2,B300+1,F300+2,E240+3,D180+5"
        , "6.3.3.3.3;B300+3,D300+1,D120+4,F60+1,F300+4"
        , "3.3.3.3.3.3;E300+4,D60+3,B0+4,E60+5,F120+6,F240+5"
        });
    defineBaseSet(0);
  }
}
