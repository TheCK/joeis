package irvine.oeis.a294;
// Generated by gen_seq4.pl eulerxfm 0 0 at 2020-09-17 12:15
// DO NOT EDIT here!

import irvine.oeis.CharacteristicFunction;
import irvine.oeis.transform.EulerTransform;
import irvine.oeis.a085.A085787;


/**
 * A294621 Number of partitions of n into generalized heptagonal numbers (A085787).
 * @author Georg Fischer
 */
public class A294621 extends EulerTransform {

  /** Construct the sequence. */
  public A294621() {
    super(new CharacteristicFunction(new A085787()), 1);
  }
}
