package irvine.oeis.a314;
// Generated by gen_seq4.pl tile1 at 2020-05-30 23:34
// DO NOT EDIT here!

import org.teherba.tile.TilingSequence;

/**
 * A314223 Coordination sequence Gal.6.632.1 where G.u.t.v denotes the coordination sequence for a vertex of type v in tiling number t in the Galebach list of u-uniform tilings.
 * @author Georg Fischer
 */
public class A314223 extends TilingSequence {

  /** Construct the sequence. */
  public A314223() {
    super(0, new String[]
        { "4.4.3.3.3;A180-1,A0-2,B0+1,C0+2,D0+3"
        , "4.3.4.3.3;A0+3,B0-2,E240+2,B300-4,C0+3"
        , "3.3.3.3.3.3;D0+4,A0+4,B0+5,B300-5,A300-4,D120+1"
        , "3.3.3.3.3.3;C240+6,A180-5,A0+5,C0+1,D120+6,D240+5"
        , "4.3.4.3.3;E300+4,B120+3,B120-3,E60+1,F120+1"
        , "3.3.3.3.3.3;E240+5,E300+5,E0+5,E60+5,E120+5,E180+5"
        });
    defineBaseSet(0);
  }
}
