package irvine.oeis.a212;
// Generated by gen_seq4.pl holos at 2021-06-13 21:50
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A212580 Number of equivalence classes of S_n under transformations of positionally and numerically adjacent elements of the form abc &lt;--&gt; acb where a&lt;b&lt;c.
 * Recurrence: -a(n)+n*a(n-1)+3*a(n-2)-(2*n-2)*a(n-3)+(n-2)*a(n-5)
 * @author Georg Fischer
 */
public class A212580 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A212580() {
    super(0, "[[0],[-2, 1],[0],[2,-2],[3],[0, 1],[-1]]", "[1, 1, 2, 5, 20]", 0);
  }
}
