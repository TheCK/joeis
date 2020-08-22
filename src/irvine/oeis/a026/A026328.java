package irvine.oeis.a026;

import irvine.oeis.PartialSumSequence;

/**
 * A026328 a(n) = number of (s(0), s(1), ..., s(n)) such that s(i) is a nonnegative integer and |s(i) - s(i-1)| &lt;= 1 for i = 1,2,...,n, s(0) = 2, s(n) = 5. Also a(n) = T(n,n-3), where T is the array in A026323.
 * @author Sean A. Irvine
 */
public class A026328 extends PartialSumSequence {

  /** Construct the sequence. */
  public A026328() {
    super(new A026154());
  }
}
