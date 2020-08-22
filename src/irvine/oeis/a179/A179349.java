package irvine.oeis.a179;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A179349 Number of permutations of 1..n with i-8&lt;=p(i)&lt;=i+2.
 * @author Georg Fischer
 */
public class A179349 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A179349() {
    super(1, new long[] {-1, 0, 1, 2, 4, 8, 14, 24, 34, 12, 56, -11, -16, -19, -12, 
      -28, 0, -8, -16, -4, -20, 0, 5, 8, 3, 10, 0, 0, 2, 0, 2, 0, 
      0, -1, 0, -1},
      new long[] {-1, 1, 2, 4, 8, 16, 30, 58, 108, 184, 240, -26, -48, -82, -120, 
      -120, 0, -22, -70, -136, -136, 0, 16, 46, 78, 68, 0, 0, 10, 
      30, 28, 0, 0, -6, -16, -14, 0, 0, 0, -2, -2, 0, 0, 0, 1, 1});
  }
}
