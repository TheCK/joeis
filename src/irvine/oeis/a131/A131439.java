package irvine.oeis.a131;
// Generated by gen_seq4.pl invbinom at 2021-12-09 23:00

import irvine.oeis.transform.BinomialTransform;

/**
 * A131439 Inverse binomial transform of A131438 (assuming zero offset in both sequences).
 * @author Georg Fischer
 */
public class A131439 extends BinomialTransform {

  /** Construct the sequence. */
  public A131439() {
    super(new A131438(), 0, true);
  }
}
