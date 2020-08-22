package irvine.oeis.a310;
// Generated by gen_seq4.pl tile1 at 2020-05-30 23:34
// DO NOT EDIT here!

import org.teherba.tile.TilingSequence;

/**
 * A310540 Coordination sequence Gal.6.487.1 where G.u.t.v denotes the coordination sequence for a vertex of type v in tiling number t in the Galebach list of u-uniform tilings.
 * @author Georg Fischer
 */
public class A310540 extends TilingSequence {

  /** Construct the sequence. */
  public A310540() {
    super(0, new String[]
        { "6.4.3.4;A60+2,A300+1,B240+3,B240-3"
        , "4.3.4.3.3;C0+3,B0-2,A120+3,B300-4,D0+3"
        , "4.4.3.3.3;E300+4,C0-2,B0+1,D0+2,F0+3"
        , "3.3.3.3.3.3;F0+4,C0+4,B0+5,B300-5,C300-4,F180+6"
        , "4.3.4.3.3;C180-1,E120+3,E240+2,C60+1,F60+2"
        , "3.3.3.3.3.3;C120-5,E300+5,C0+5,D0+1,F180+5,D180+6"
        });
    defineBaseSet(0);
  }
}
