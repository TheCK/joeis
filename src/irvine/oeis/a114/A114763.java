package irvine.oeis.a114;
// Generated by gen_seq4.pl floor at 2021-08-30 23:16

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.FloorSequence;

/**
 * A114763 a(n) = floor(sqrt(5)*10^n)^2.
 * @author Georg Fischer
 */
public class A114763 extends FloorSequence {
  /** Construct the sequence. */
  public A114763() {
    super(0);
  }

  protected Z evalCR(final long n) {
    return CR.FIVE.sqrt().multiply(CR.TEN.pow(n)).floor().pow(2);
  }

}
