package irvine.oeis.a311;
// Generated by gen_seq4.pl tile1 at 2020-05-30 23:34
// DO NOT EDIT here!

import org.teherba.tile.TilingSequence;

/**
 * A311160 Coordination sequence Gal.6.116.1 where G.u.t.v denotes the coordination sequence for a vertex of type v in tiling number t in the Galebach list of u-uniform tilings.
 * @author Georg Fischer
 */
public class A311160 extends TilingSequence {

  /** Construct the sequence. */
  public A311160() {
    super(0, new String[]
        { "4.4.4.4;A180-1,A180+2,A180-3,B0+2"
        , "4.4.4.4;B180-1,A0+4,B180-3,C0+2"
        , "4.4.4.4;C180-1,B0+4,C180-3,D0+2"
        , "4.4.4.4;D180-1,C0+4,D180-3,E240+3"
        , "6.4.4.3;F60+2,E60-2,D120+4,E60-4"
        , "6.3.6.3;E180-1,E300+1,E0-1,E120+1"
        });
    defineBaseSet(0);
  }
}
