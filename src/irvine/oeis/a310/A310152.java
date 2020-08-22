package irvine.oeis.a310;
// Generated by gen_seq4.pl tile1 at 2020-05-30 23:34
// DO NOT EDIT here!

import org.teherba.tile.TilingSequence;

/**
 * A310152 Coordination sequence Gal.5.42.1 where G.u.t.v denotes the coordination sequence for a vertex of type v in tiling number t in the Galebach list of u-uniform tilings.
 * @author Georg Fischer
 */
public class A310152 extends TilingSequence {

  /** Construct the sequence. */
  public A310152() {
    super(0, new String[]
        { "12.6.4;B30+2,A120-2,A0-3"
        , "12.4.3.3;C180-1,A330+1,B300-3,D0+3"
        , "12.4.3.3;B180-1,C120-2,E300-3,D180-2"
        , "3.3.3.3.3.3;E240+4,C180-4,B0+4,B300-4,C120+4,E60-4"
        , "12.4.3.3;E180-1,E120-2,C300-3,D120+1"
        });
    defineBaseSet(0);
  }
}
