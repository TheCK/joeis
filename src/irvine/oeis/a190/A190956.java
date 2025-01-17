package irvine.oeis.a190;

import irvine.oeis.LinearRecurrence;

/**
 * A190956 a(n) = 10*a(n-1) + 6*a(n-2), with a(0)=0, a(1)=1.
 * @author Sean A. Irvine
 */
public class A190956 extends LinearRecurrence {

  /** Construct the sequence. */
  public A190956() {
    super(new long[] {6, 10}, new long[] {0, 1});
  }
}
