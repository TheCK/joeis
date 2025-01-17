package irvine.oeis.a059;
// Generated by gen_seq4.pl beatty2 at 2021-07-10 18:19

import irvine.math.cr.CR;
import irvine.oeis.cons.BeattySequence;

/**
 * A059546 Beatty sequence for log(10)/(log(10)-1).
 * @author Georg Fischer
 */
public class A059546 extends BeattySequence {

  /** Construct the sequence. */
  public A059546() {
    super(1, CR.TEN.log().divide(CR.TEN.log().subtract(CR.ONE)));
  }
}
