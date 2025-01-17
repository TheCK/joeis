package irvine.oeis.a065;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A065930 (x,y) = (a(n),a(n+1)) are the solutions of (t(x)+t(y))/(1+xy)) = t(4) = 10, where t(n) denotes the n-th triangular number t(n) = n(n+1)/2.
 * @author Georg Fischer
 */
public class A065930 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A065930() {
    super(0, new long[] {-4, 5},
      new long[] {-1, 21, -21, 1});
  }
}
