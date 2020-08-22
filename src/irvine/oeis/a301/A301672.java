package irvine.oeis.a301;
// Generated by gen_seq4.pl tile1 at 2020-05-30 23:34
// DO NOT EDIT here!

import org.teherba.tile.TilingSequence;

/**
 * A301672 Coordination sequence for node of type V2 in "krr" 2-D tiling (or net).
 * @author Georg Fischer
 */
public class A301672 extends TilingSequence {

  /** Construct the sequence. */
  public A301672() {
    super(0, new String[]
        { "6.4.4.3;B240+4,A60-2,A240-3,A60-4"
        , "6.3.6.3;A180-1,A300+1,A0-1,A120+1"
        });
    defineBaseSet(0);
  }
}
