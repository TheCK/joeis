package irvine.oeis.a166;

import irvine.oeis.LinearRecurrence;

/**
 * A166482 <code>a(n) =</code> Sum_{k=0..n} <code>C(n+k</code>,2k)*F(2k+1).
 * @author Sean A. Irvine
 */
public class A166482 extends LinearRecurrence {

  /** Construct the sequence. */
  public A166482() {
    super(new long[] {-1, 7, -13, 7}, new long[] {1, 3, 12, 51});
  }
}
