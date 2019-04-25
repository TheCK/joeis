package irvine.oeis.a226;

import irvine.oeis.LinearRecurrence;

/**
 * A226508 <code>a(n) = Sum_{i=3^n..3^(n+1)-1} i</code>.
 * @author Sean A. Irvine
 */
public class A226508 extends LinearRecurrence {

  /** Construct the sequence. */
  public A226508() {
    super(new long[] {-27, 12}, new long[] {3, 33});
  }
}
