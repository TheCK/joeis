package irvine.oeis.a314;
// Generated by gen_seq4.pl tile1 at 2020-05-30 23:34
// DO NOT EDIT here!

import org.teherba.tile.TilingSequence;

/**
 * A314188 Coordination sequence Gal.4.145.2 where G.u.t.v denotes the coordination sequence for a vertex of type v in tiling number t in the Galebach list of u-uniform tilings.
 * @author Georg Fischer
 */
public class A314188 extends TilingSequence {

  /** Construct the sequence. */
  public A314188() {
    super(0, new String[]
        { "4.4.3.3.3;B90+2,A180+2,C0+1,D0+2,A60-5"
        , "4.3.4.3.3;C90+2,A270+1,A330-1,C270+3,B180+5"
        , "4.3.4.3.3;A0+3,B270+1,B90+4,A240-3,D0+3"
        , "3.3.3.3.3.3;A60-4,A0+4,C0+5,A240-4,A180+4,C180+5"
        });
    defineBaseSet(1);
  }
}
