package irvine.oeis.a310;
// Generated by gen_seq4.pl tile1 at 2020-05-30 23:34
// DO NOT EDIT here!

import org.teherba.tile.TilingSequence;

/**
 * A310017 Coordination sequence Gal.4.33.1 where G.u.t.v denotes the coordination sequence for a vertex of type v in tiling number t in the Galebach list of u-uniform tilings.
 * @author Georg Fischer
 */
public class A310017 extends TilingSequence {

  /** Construct the sequence. */
  public A310017() {
    super(0, new String[]
        { "12.12.3;A180-1,B180+2,C120+1"
        , "12.12.3;D30+2,A180+2,D120+1"
        , "12.12.3;A240+3,C180+2,A60-3"
        , "12.3.4.3;B240+3,B330+1,D90+4,D270+3"
        });
    defineBaseSet(0);
  }
}
