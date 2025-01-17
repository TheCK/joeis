package irvine.oeis.a079;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A079989 Number of permutations satisfying -k&lt;=p(i)-i&lt;=r and p(i)-i not in I, i=1..n, with k=3, r=3, I={1,2}.
 * @author Georg Fischer
 */
public class A079989 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A079989() {
    super(0, new long[] {1, 0, -1, -3, 0, 1, -1, 0, 1, 1, 0, -1, 1, 0, -1},
      new long[] {1, -1, -1, -2, -1, -3, -4, 7, 7, 6, -6, 2, 1, -1, -4, -1, 
      3, 0, -1, 1, 1});
  }
}
