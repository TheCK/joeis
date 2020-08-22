package irvine.oeis.a310;
// Generated by gen_seq4.pl tile1 at 2020-05-30 23:34
// DO NOT EDIT here!

import org.teherba.tile.TilingSequence;

/**
 * A310107 Coordination sequence Gal.6.40.1 where G.u.t.v denotes the coordination sequence for a vertex of type v in tiling number t in the Galebach list of u-uniform tilings.
 * @author Georg Fischer
 */
public class A310107 extends TilingSequence {

  /** Construct the sequence. */
  public A310107() {
    super(0, new String[]
        { "6.6.6;A180+1,B180+2,B180-2"
        , "6.6.6;B180-1,A180+2,C300+2"
        , "6.6.3.3;D300+3,B60+3,C300-3,E0+3"
        , "6.6.3.3;F300+3,D60-2,C60+1,E60+2"
        , "3.3.3.3.3.3;F240+4,D300+4,C0+4,C300-4,D0-4,F60-4"
        , "6.6.3.3;F180-1,F180+2,D60+1,E120+1"
        });
    defineBaseSet(0);
  }
}
