package irvine.oeis.a310;
// Generated by gen_seq4.pl tile1 at 2020-05-30 23:34
// DO NOT EDIT here!

import org.teherba.tile.TilingSequence;

/**
 * A310263 Coordination sequence Gal.6.27.1 where G.u.t.v denotes the coordination sequence for a vertex of type v in tiling number t in the Galebach list of u-uniform tilings.
 * @author Georg Fischer
 */
public class A310263 extends TilingSequence {

  /** Construct the sequence. */
  public A310263() {
    super(0, new String[]
        { "6.6.6;A60+2,A300+1,B300+2"
        , "6.6.3.3;C60+2,A60+3,C180-2,D240+4"
        , "6.3.3.3.3;C180-1,B300+1,D180+3,E120+5,F0+3"
        , "6.3.3.3.3;E60+2,E300+1,C180+3,B120+4,C300-3"
        , "6.3.3.3.3;D60+2,D300+1,C240-4,F240+4,C240+4"
        , "3.3.3.3.3.3;E300+4,C180-5,C0+5,E120+4,C0-5,C180+5"
        });
    defineBaseSet(0);
  }
}
