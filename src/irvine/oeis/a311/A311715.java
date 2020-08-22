package irvine.oeis.a311;
// Generated by gen_seq4.pl tile1 at 2020-05-30 23:34
// DO NOT EDIT here!

import org.teherba.tile.TilingSequence;

/**
 * A311715 Coordination sequence Gal.6.513.1 where G.u.t.v denotes the coordination sequence for a vertex of type v in tiling number t in the Galebach list of u-uniform tilings.
 * @author Georg Fischer
 */
public class A311715 extends TilingSequence {

  /** Construct the sequence. */
  public A311715() {
    super(0, new String[]
        { "6.6.3.3;B300+3,A180+2,C240+3,D180+5"
        , "6.6.3.3;E60+2,F180+2,A60+1,D240+4"
        , "6.3.6.3;A300+3,D300+1,A120+3,D120+1"
        , "6.3.3.3.3;C60+2,F300+1,E180+3,B120+4,A180+4"
        , "6.3.3.3.3;F300+3,B300+1,D180+3,F120+4,E180+5"
        , "6.6.3.3;D60+2,B180+2,E60+1,E240+4"
        });
    defineBaseSet(0);
  }
}
