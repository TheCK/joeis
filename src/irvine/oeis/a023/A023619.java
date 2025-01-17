package irvine.oeis.a023;

import irvine.oeis.LinearRecurrence;

/**
 * A023619 Convolution of Lucas numbers and (F(2), F(3), F(4), ...).
 * @author Sean A. Irvine
 */
public class A023619 extends LinearRecurrence {

  /** Construct the sequence. */
  public A023619() {
    super(new long[] {-1, -2, 1, 2}, new long[] {1, 5, 13, 29});
  }
}
