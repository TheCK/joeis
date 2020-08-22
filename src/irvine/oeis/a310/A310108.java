package irvine.oeis.a310;
// Generated by gen_seq4.pl tile1 at 2020-05-30 23:34
// DO NOT EDIT here!

import org.teherba.tile.TilingSequence;

/**
 * A310108 Coordination sequence Gal.5.16.1 where G.u.t.v denotes the coordination sequence for a vertex of type v in tiling number t in the Galebach list of u-uniform tilings.
 * @author Georg Fischer
 */
public class A310108 extends TilingSequence {

  /** Construct the sequence. */
  public A310108() {
    super(0, new String[]
        { "6.6.6;A180+1,B180+2,B180-2"
        , "6.6.6;B180-1,A180+2,C300+2"
        , "6.6.3.3;D180-1,B60+3,C300-3,E240+4"
        , "6.4.4.3;C180-1,D60-2,D240-3,E300-3"
        , "4.4.3.3.3;D240+4,E180+2,D300-4,C120+4,C60-4"
        });
    defineBaseSet(0);
  }
}
