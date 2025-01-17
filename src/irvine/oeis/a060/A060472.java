package irvine.oeis.a060;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A060472 Smallest positive a(n) such that the number of solutions to a(n)=a(j)+a(k), j&lt;k&lt;n is four or less.
 * @author Georg Fischer
 */
public class A060472 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A060472() {
    super(1, new long[] {0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 3, 2, 2, 
      1, 1, 4, 1, 1, 1, 1, 6, 1, 1, 0, 5, 0, 0, 0, -1, 3, 0, 0, 
      0, -3, 5},
      new long[] {1, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 
      1});
  }
}
