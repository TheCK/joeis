package irvine.oeis.a079;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A079934 Greedy frac multiples of sqrt(2): a(1)=1, Sum_{n&gt;=0} frac(a(n)*x)=1 at x=sqrt(2).
 * @author Georg Fischer
 */
public class A079934 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A079934() {
    super(1, new long[] {0, 1, 3, 5, 4, -1, -1, -13, 0, 0, 2},
      new long[] {1, 0, 0, -6, 0, 0, 1});
  }
}
