package irvine.oeis.a226;
// Generated by gen_seq4.pl eulerx at 2021-05-28 22:45
// DO NOT EDIT here!

import irvine.oeis.transform.EulerTransform;
import irvine.oeis.a001.A001001;


/**
 * A226313 Number of commuting 4-tuples of elements from S_n, divided by n!.
 *
 * @author Georg Fischer
 */
public class A226313 extends EulerTransform {

  /** Construct the sequence. */
  public A226313() {
    super(new A001001(), 1);
    next();
  }
}
