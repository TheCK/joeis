package irvine.oeis.a079;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A079991 Number of permutations satisfying -k&lt;=p(i)-i&lt;=r and p(i)-i not in I, i=1..n, with k=3, r=3, I={-1,1}.
 * @author Georg Fischer
 */
public class A079991 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A079991() {
    super(0, new long[] {-1, 1, 1, 0, 2, 0, 1, -1, -1},
      new long[] {-1, 2, 0, 0, 3, 0, 1, -8, -1, 0, -3, 0, 0, 2, 1});
  }
}
