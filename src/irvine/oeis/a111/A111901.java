package irvine.oeis.a111;
// Generated by gen_seq4.pl eulerxfm 0 0 at 2020-09-17 12:15
// DO NOT EDIT here!

import irvine.oeis.CharacteristicFunction;
import irvine.oeis.transform.EulerTransform;
import irvine.oeis.a000.A000430;


/**
 * A111901 Number of partitions of n into parts that are primes or squares of primes.
 * @author Georg Fischer
 */
public class A111901 extends EulerTransform {

  /** Construct the sequence. */
  public A111901() {
    super(new CharacteristicFunction(new A000430()), 1);
  }
}
