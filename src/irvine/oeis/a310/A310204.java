package irvine.oeis.a310;
// Generated by gen_seq4.pl tile1 at 2020-05-30 23:34
// DO NOT EDIT here!

import org.teherba.tile.TilingSequence;

/**
 * A310204 Coordination sequence Gal.6.102.1 where G.u.t.v denotes the coordination sequence for a vertex of type v in tiling number t in the Galebach list of u-uniform tilings.
 * @author Georg Fischer
 */
public class A310204 extends TilingSequence {

  /** Construct the sequence. */
  public A310204() {
    super(0, new String[]
        { "12.6.4;B30+2,A120-2,C210-2"
        , "12.4.3.3;D180-1,A330+1,C0-4,E180+5"
        , "6.4.4.3;E180-1,A210-3,C180+3,B0-3"
        , "12.4.3.3;B180-1,D120-2,F240-3,E0-4"
        , "6.3.3.3.3;C180-1,E60-2,F120+4,D0-4,B180+4"
        , "4.4.3.3.3;D300+3,F180+2,D240-3,E240+3,E300-3"
        });
    defineBaseSet(0);
  }
}
