package irvine.oeis.a218;
// Generated by gen_seq4.pl eulerxfm 0 0 at 2020-09-17 12:15
// DO NOT EDIT here!

import irvine.oeis.CharacteristicFunction;
import irvine.oeis.transform.EulerTransform;
import irvine.oeis.a000.A000326;


/**
 * A218379 Number of partitions of n into pentagonal parts.
 * @author Georg Fischer
 */
public class A218379 extends EulerTransform {

  /** Construct the sequence. */
  public A218379() {
    super(new CharacteristicFunction(new A000326()), 1);
  }
}
