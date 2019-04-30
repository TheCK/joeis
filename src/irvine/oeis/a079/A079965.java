package irvine.oeis.a079;

import irvine.oeis.LinearRecurrence;

/**
 * A079965 Number of permutations satisfying -k&lt;=p(i)-i&lt;=r and <code>p(i)-i</code> not in I, <code>i=1..n</code>, with <code>k=1</code>, r=5, I={0,3}.
 * @author Sean A. Irvine
 */
public class A079965 extends LinearRecurrence {

  /** Construct the sequence. */
  public A079965() {
    super(new long[] {1, 1, 0, 1, 1, 0}, new long[] {1, 0, 1, 1, 1, 3});
  }
}
