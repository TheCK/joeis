package irvine.oeis.a185;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.transform.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A185175 a(n) = A010815(7*n + 5).
 * @author Georg Fischer
 */
public class A185175 extends EulerTransform {

  /** Construct the sequence. */
  public A185175() {
    super(new PeriodicSequence(-1, 0, 1, 1, 0, -1, -1), 1);
  }
}
