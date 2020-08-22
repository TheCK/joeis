package irvine.oeis.a316;
// Generated by gen_seq4.pl tile1 at 2020-05-30 23:34
// DO NOT EDIT here!

import org.teherba.tile.TilingSequence;

/**
 * A316026 Coordination sequence Gal.3.36.3 where G.u.t.v denotes the coordination sequence for a vertex of type v in tiling number t in the Galebach list of u-uniform tilings.
 * @author Georg Fischer
 */
public class A316026 extends TilingSequence {

  /** Construct the sequence. */
  public A316026() {
    super(0, new String[]
        { "6.4.3.4;A60+2,A300+1,B30+1,B90-1"
        , "4.4.3.3.3;A330+3,B0-2,B180-3,C0+2,B60-5"
        , "3.3.3.3.3.3;B60-4,B0+4,B180-4,B120+4,B300-4,B240+4"
        });
    defineBaseSet(2);
  }
}
