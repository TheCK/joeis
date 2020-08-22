package irvine.oeis.a310;
// Generated by gen_seq4.pl tile1 at 2020-05-30 23:34
// DO NOT EDIT here!

import org.teherba.tile.TilingSequence;

/**
 * A310225 Coordination sequence Gal.6.51.1 where G.u.t.v denotes the coordination sequence for a vertex of type v in tiling number t in the Galebach list of u-uniform tilings.
 * @author Georg Fischer
 */
public class A310225 extends TilingSequence {

  /** Construct the sequence. */
  public A310225() {
    super(0, new String[]
        { "6.6.6;A180+1,B180+2,C300+2"
        , "6.6.6;D60+2,A180+2,B180+3"
        , "6.6.3.3;D300+3,A60+3,E60+1,F180+5"
        , "6.6.3.3;F60+2,B300+1,C60+1,F240+4"
        , "6.3.6.3;C300+3,F300+1,C120+3,F120+1"
        , "6.3.3.3.3;E240+4,D300+1,F180+3,D120+4,C180+4"
        });
    defineBaseSet(0);
  }
}
