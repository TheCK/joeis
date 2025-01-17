package irvine.oeis.a310;
// Generated by gen_seq4.pl tile1 at 2020-05-30 23:34
// DO NOT EDIT here!

import org.teherba.tile.TilingSequence;

/**
 * A310114 Coordination sequence Gal.5.33.1 where G.u.t.v denotes the coordination sequence for a vertex of type v in tiling number t in the Galebach list of u-uniform tilings.
 * @author Georg Fischer
 */
public class A310114 extends TilingSequence {

  /** Construct the sequence. */
  public A310114() {
    super(0, new String[]
        { "12.6.4;A180-1,A120-2,B210-2"
        , "6.4.4.3;C180-1,A210-3,B240-3,D210-2"
        , "6.4.4.3;B180-1,C60-2,C240-3,D330+3"
        , "4.3.4.3.3;D180-1,B210-4,C30+4,D300-4,E0+3"
        , "3.3.3.3.3.3;D240+5,D180-5,D0+5,D300-5,D120+5,D60-5"
        });
    defineBaseSet(0);
  }
}
