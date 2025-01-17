package irvine.oeis.a299;
// Generated by gen_seq4.pl eulerx at 2021-05-28 22:45
// DO NOT EDIT here!

import irvine.oeis.transform.EulerTransform;
import irvine.oeis.SkipSequence;
import irvine.oeis.a167.A167934;


/**
 * A299026 Number of compositions of n whose standard factorization into Lyndon words has all weakly increasing factors.
 *
 * @author Georg Fischer
 */
public class A299026 extends EulerTransform {

  /** Construct the sequence. */
  public A299026() {
    super(new SkipSequence(new A167934(), 1), 1);
    next();
  }
}
