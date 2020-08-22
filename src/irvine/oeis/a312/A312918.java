package irvine.oeis.a312;
// Generated by gen_seq4.pl tile1 at 2020-05-30 23:34
// DO NOT EDIT here!

import org.teherba.tile.TilingSequence;

/**
 * A312918 Coordination sequence Gal.5.150.1 where G.u.t.v denotes the coordination sequence for a vertex of type v in tiling number t in the Galebach list of u-uniform tilings.
 * @author Georg Fischer
 */
public class A312918 extends TilingSequence {

  /** Construct the sequence. */
  public A312918() {
    super(0, new String[]
        { "6.4.4.3;A180-1,B60-2,B240-3,C330+3"
        , "6.4.4.3;D180-1,A60-2,A240-3,E0-4"
        , "4.3.4.3.3;E90+2,A210-4,A30+4,E270+3,C180+5"
        , "6.6.3.3;B180-1,D180+2,B60+1,E180+5"
        , "4.3.4.3.3;B240+4,C270+1,C90+4,B0-4,D180+4"
        });
    defineBaseSet(0);
  }
}
