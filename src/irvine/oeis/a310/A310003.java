package irvine.oeis.a310;
// Generated by gen_seq4.pl tile1 at 2020-05-30 23:34
// DO NOT EDIT here!

import org.teherba.tile.TilingSequence;

/**
 * A310003 Coordination sequence Gal.5.45.1 where G.u.t.v denotes the coordination sequence for a vertex of type v in tiling number t in the Galebach list of u-uniform tilings.
 * @author Georg Fischer
 */
public class A310003 extends TilingSequence {

  /** Construct the sequence. */
  public A310003() {
    super(0, new String[]
        { "12.12.3;A180-1,A180+2,B120+1"
        , "12.12.3;A240+3,C180+2,A60-3"
        , "12.12.3;D30+2,B180+2,D270-2"
        , "12.3.4.3;E180-1,C330+1,D240-3,E0-3"
        , "12.4.3.3;D180-1,E120-2,D0-4,E180+4"
        });
    defineBaseSet(0);
  }
}
