package irvine.oeis.a101;
// Generated by gen_seq4.pl eulerxfm 0 0 at 2020-09-17 12:15
// DO NOT EDIT here!

import irvine.oeis.CharacteristicFunction;
import irvine.oeis.transform.EulerTransform;
import irvine.oeis.a000.A000079;


/**
 * A101417 Number of partitions of n into parts without powers of 2.
 * @author Georg Fischer
 */
public class A101417 extends EulerTransform {

  /** Construct the sequence. */
  public A101417() {
    super(new CharacteristicFunction(1, new A000079(), false), 1);
  }
}
