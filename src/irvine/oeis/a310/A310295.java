package irvine.oeis.a310;
// Generated by gen_seq4.pl tile1 at 2020-05-30 23:34
// DO NOT EDIT here!

import org.teherba.tile.TilingSequence;

/**
 * A310295 Coordination sequence Gal.5.24.1 where G.u.t.v denotes the coordination sequence for a vertex of type v in tiling number t in the Galebach list of u-uniform tilings.
 * @author Georg Fischer
 */
public class A310295 extends TilingSequence {

  /** Construct the sequence. */
  public A310295() {
    super(0, new String[]
        { "6.6.6;A180+1,B180+2,B180-2"
        , "6.6.3.3;C60+2,A180+2,D60+1,E300+3"
        , "6.3.6.3;E60+2,B300+1,E240+2,B120+1"
        , "6.6.3.3;B300+3,D180+2,B300-3,E240+4"
        , "6.3.3.3.3;C0-3,C120+3,B60+4,D120+4,B60-4"
        });
    defineBaseSet(0);
  }
}
