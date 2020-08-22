package irvine.oeis.a082;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A082988 a(n)=sum(k=0,n,4^k*F(k)) where F(k) is the k-th Fibonacci number.
 * @author Georg Fischer
 */
public class A082988 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A082988() {
    super(0, new long[] {0, 4},
      new long[] {1, -5, -12, 16});
  }
}
