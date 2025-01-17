package irvine.oeis.a345;
// Generated by gen_seq4.pl lingf at 2021-08-18 17:31
// : 

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A345031 a(n) = 6*a(n-1) - 7*a(n-2) - 2*a(n-3) for n &gt;= 3, with a(0) = a(1) = 0, a(2) = 1.
 * @author Georg Fischer
 */
public class A345031 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A345031() {
    super(0, "[0, 0, 1]", "[1,-6, 7, 2]");
  }
}
