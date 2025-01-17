package irvine.oeis.a073;

import irvine.oeis.LinearRecurrence;

/**
 * A073778 a(n) = Sum_{k=0..n} T(k)*T(n-k), where T is A000073; convolution of A000073 with itself.
 * @author Sean A. Irvine
 */
public class A073778 extends LinearRecurrence {

  /** Construct the sequence. */
  public A073778() {
    super(new long[] {-1, -2, -3, 0, 1, 2}, new long[] {0, 0, 0, 0, 1, 2});
  }
}
