package irvine.oeis.a310;
// Generated by gen_seq4.pl tile1 at 2020-05-30 23:34
// DO NOT EDIT here!

import org.teherba.tile.TilingSequence;

/**
 * A310242 Coordination sequence Gal.6.14.1 where G.u.t.v denotes the coordination sequence for a vertex of type v in tiling number t in the Galebach list of u-uniform tilings.
 * @author Georg Fischer
 */
public class A310242 extends TilingSequence {

  /** Construct the sequence. */
  public A310242() {
    super(0, new String[]
        { "6.6.6;A180-1,A180+2,B300+2"
        , "6.6.3.3;C180-1,A60+3,B300-3,D240+4"
        , "6.4.4.3;B180-1,C60-2,E120-2,D300-3"
        , "4.4.3.3.3;C240+4,F90+3,C300-4,B120+4,B60-4"
        , "4.4.4.4;E180-1,C120-3,F270+2,E0-4"
        , "4.4.4.4;F180+1,E90+3,D270+2,E270-3"
        });
    defineBaseSet(0);
  }
}
