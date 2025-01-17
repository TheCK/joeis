package irvine.oeis.a121;
// Generated by gen_seq4.pl floor at 2021-08-30 23:16

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.FloorSequence;

/**
 * A121830 a(n) = floor((Pi - e)n).
 * @author Georg Fischer
 */
public class A121830 extends FloorSequence {
  /** Construct the sequence. */
  public A121830() {
    super(0);
  }

  protected Z evalCR(final long n) {
    return CR.PI.subtract(CR.E).multiply(CR.valueOf(n)).floor();
  }

}
