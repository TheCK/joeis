package irvine.oeis.a310;
// Generated by gen_seq4.pl tile1 at 2020-05-30 23:34
// DO NOT EDIT here!

import org.teherba.tile.TilingSequence;

/**
 * A310309 Coordination sequence Gal.6.63.1 where G.u.t.v denotes the coordination sequence for a vertex of type v in tiling number t in the Galebach list of u-uniform tilings.
 * @author Georg Fischer
 */
public class A310309 extends TilingSequence {

  /** Construct the sequence. */
  public A310309() {
    super(0, new String[]
        { "6.6.6;A180+1,B180+2,B180-2"
        , "6.6.3.3;C60+2,A180+2,D60+1,C240+4"
        , "6.3.3.3.3;E60+2,B300+1,C180+3,B120+4,D180+5"
        , "6.3.3.3.3;B300+3,D60-2,F120+5,E240+3,C180+5"
        , "6.3.3.3.3;C180-1,C300+1,D120+4,F60+1,D0-4"
        , "3.3.3.3.3.3;E300+4,D60+3,D120-3,E120+4,D240+3,D300-3"
        });
    defineBaseSet(0);
  }
}
