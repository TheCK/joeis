package irvine.oeis.a310;
// Generated by gen_seq4.pl tile1 at 2020-05-30 23:34
// DO NOT EDIT here!

import org.teherba.tile.TilingSequence;

/**
 * A310106 Coordination sequence Gal.6.8.1 where G.u.t.v denotes the coordination sequence for a vertex of type v in tiling number t in the Galebach list of u-uniform tilings.
 * @author Georg Fischer
 */
public class A310106 extends TilingSequence {

  /** Construct the sequence. */
  public A310106() {
    super(0, new String[]
        { "6.6.6;A60+2,A300+1,B300+2"
        , "6.6.6;C60+2,A60+3,C180-2"
        , "6.6.3.3;C180-1,B300+1,D60+1,E0+3"
        , "6.6.3.3;C300+3,F300+1,C300-3,E300+4"
        , "3.3.3.3.3.3;D240+4,C180-4,C0+4,D60+4,C0-4,C180+4"
        , "6.6.6;D60+2,D180+2,D300+2"
        });
    defineBaseSet(0);
  }
}
