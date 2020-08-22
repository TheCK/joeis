package irvine.oeis.a312;
// Generated by gen_seq4.pl tile1 at 2020-05-30 23:34
// DO NOT EDIT here!

import org.teherba.tile.TilingSequence;

/**
 * A312671 Coordination sequence Gal.5.177.1 where G.u.t.v denotes the coordination sequence for a vertex of type v in tiling number t in the Galebach list of u-uniform tilings.
 * @author Georg Fischer
 */
public class A312671 extends TilingSequence {

  /** Construct the sequence. */
  public A312671() {
    super(0, new String[]
        { "6.4.4.3;B60+2,A60-2,A240-3,A60-4"
        , "6.3.6.3;C60+2,A300+1,A0-1,C240-2"
        , "6.3.3.3.3;C180-1,B300+1,C180-3,D180+4,E180+5"
        , "4.4.3.3.3;E0+3,E180+2,E0+1,C180+4,C0-4"
        , "4.4.3.3.3;D0+3,D180+2,D0+1,C0-5,C180+5"
        });
    defineBaseSet(0);
  }
}
