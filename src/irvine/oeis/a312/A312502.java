package irvine.oeis.a312;
// Generated by gen_seq4.pl tile1 at 2020-05-30 23:34
// DO NOT EDIT here!

import org.teherba.tile.TilingSequence;

/**
 * A312502 Coordination sequence Gal.5.127.1 where G.u.t.v denotes the coordination sequence for a vertex of type v in tiling number t in the Galebach list of u-uniform tilings.
 * @author Georg Fischer
 */
public class A312502 extends TilingSequence {

  /** Construct the sequence. */
  public A312502() {
    super(0, new String[]
        { "4.4.4.4;A180+1,B120-3,C270+2,B240+3"
        , "6.4.4.3;D180-1,B60-2,A120-2,E300-3"
        , "4.4.4.4;E90+2,A90+3,E270+2,A270+3"
        , "6.3.3.3.3;B180-1,B300+1,E60+5,D180+4,E240+4"
        , "4.4.3.3.3;B240+4,C90+3,B300-4,D120+5,D300+3"
        });
    defineBaseSet(0);
  }
}
