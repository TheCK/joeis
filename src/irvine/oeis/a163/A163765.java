package irvine.oeis.a163;
// Generated by gen_seq4.pl invbinom at 2021-12-09 23:00

import irvine.oeis.a048.A048775;
import irvine.oeis.transform.BinomialTransform;

/**
 * A163765 Inverse binomial transform of A048775 (assuming offset zero in both sequences).
 * @author Georg Fischer
 */
public class A163765 extends BinomialTransform {

  /** Construct the sequence. */
  public A163765() {
    super(new A048775(), 0, true);
  }
}
