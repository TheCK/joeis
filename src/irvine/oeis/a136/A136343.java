package irvine.oeis.a136;
// Generated by gen_seq4.pl eulerxfm 0 0 at 2020-09-17 12:15
// DO NOT EDIT here!

import irvine.oeis.CharacteristicFunction;
import irvine.oeis.transform.EulerTransform;
import irvine.oeis.SkipSequence;
import irvine.oeis.a000.A000071;


/**
 * A136343 Number of partitions of n such that each summand is greater than or equal to the sum of the next two summands.
 * @author Georg Fischer
 */
public class A136343 extends EulerTransform {

  /** Construct the sequence. */
  public A136343() {
    super(new CharacteristicFunction(new SkipSequence(new A000071(), 2)), 1);
  }
}
