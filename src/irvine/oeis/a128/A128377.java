package irvine.oeis.a128;
// Generated by gen_seq4.pl invbinom at 2021-12-09 23:00

import irvine.oeis.a000.A000594;
import irvine.oeis.transform.BinomialTransform;

/**
 * A128377 Inverse binomial transform of A000594 (assuming offset 0 in both sequences).
 * @author Georg Fischer
 */
public class A128377 extends BinomialTransform {

  /** Construct the sequence. */
  public A128377() {
    super(new A000594(), 0, true);
  }
}
