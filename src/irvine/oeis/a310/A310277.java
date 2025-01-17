package irvine.oeis.a310;
// Generated by gen_seq4.pl tile1 at 2020-05-30 23:34
// DO NOT EDIT here!

import org.teherba.tile.TilingSequence;

/**
 * A310277 Coordination sequence Gal.6.29.1 where G.u.t.v denotes the coordination sequence for a vertex of type v in tiling number t in the Galebach list of u-uniform tilings.
 * @author Georg Fischer
 */
public class A310277 extends TilingSequence {

  /** Construct the sequence. */
  public A310277() {
    super(0, new String[]
        { "6.6.6;A60+2,A300+1,B300+2"
        , "6.6.3.3;C60+2,A60+3,D60+1,E0+3"
        , "6.3.3.3.3;D60+2,B300+1,E300+2,C180+4,E120+1"
        , "6.3.3.3.3;B300+3,C300+1,E60+6,F300+3,E300+4"
        , "3.3.3.3.3.3;C240+5,C60+3,B0+4,D60+5,F0+2,D300+3"
        , "3.3.3.3.3.3;D300+4,E0+5,D60+4,E120+5,D180+4,E240+5"
        });
    defineBaseSet(0);
  }
}
