package irvine.oeis.a283;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-22 22:46
// DO NOT EDIT here!

import irvine.oeis.transform.EulerTransform;
import irvine.oeis.PaddingSequence;


/**
 * A283121 Expansion of exp( Sum_{n&gt;=1} sigma(9*n)*x^n/n ) in powers of x.
 * @author Georg Fischer
 */
public class A283121 extends EulerTransform {

  /** Construct the sequence. */
  public A283121() {
    super(new PaddingSequence(new long[] {  }, new long[] {13, 13, 9}), 1);
  }
}
