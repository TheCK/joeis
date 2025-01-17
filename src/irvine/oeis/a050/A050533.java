package irvine.oeis.a050;

import irvine.oeis.LinearRecurrence;

/**
 * A050533 Thickened pyramidal numbers: a(n) = 2*(n+1)*n + Sum_{i=1..n} (4*i*(i-1) + 1).
 * @author Sean A. Irvine
 */
public class A050533 extends LinearRecurrence {

  /** Construct the sequence. */
  public A050533() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 5, 22, 59});
  }
}
