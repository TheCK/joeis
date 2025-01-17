package irvine.oeis.a221;
// Generated by gen_seq4.pl floor at 2021-08-30 23:16

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.FloorSequence;

/**
 * A221942 Floor(sqrt(5*2^n)).
 * @author Georg Fischer
 */
public class A221942 extends FloorSequence {
  /** Construct the sequence. */
  public A221942() {
    super(0);
  }

  protected Z evalCR(final long n) {
    return CR.FIVE.multiply(CR.TWO.pow(n)).sqrt().floor();
  }

}
