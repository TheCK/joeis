package irvine.oeis.a314;
// Generated by gen_seq4.pl tile1 at 2020-05-30 23:34
// DO NOT EDIT here!

import org.teherba.tile.TilingSequence;

/**
 * A314255 Coordination sequence Gal.6.656.1 where G.u.t.v denotes the coordination sequence for a vertex of type v in tiling number t in the Galebach list of u-uniform tilings.
 * @author Georg Fischer
 */
public class A314255 extends TilingSequence {

  /** Construct the sequence. */
  public A314255() {
    super(0, new String[]
        { "4.4.3.3.3;B90+2,A0-2,C0+1,A180+4,C180+5"
        , "4.3.4.3.3;B180-1,A270+1,C90+4,D60+1,E180+6"
        , "4.3.4.3.3;A0+3,C0-2,F240+2,B270+3,A180+5"
        , "4.3.4.3.3;B300+4,F270+1,F90+4,B300-4,E120+1"
        , "3.3.3.3.3.3;D240+5,B180-5,B0+5,D60+5,B0-5,B180+5"
        , "4.3.4.3.3;D90+2,C120+3,C120-3,D270+3,F180+5"
        });
    defineBaseSet(0);
  }
}
