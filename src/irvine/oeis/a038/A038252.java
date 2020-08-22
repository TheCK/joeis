package irvine.oeis.a038;
// Generated by gen_seq4.pl trigf 1 1, -5, -10 at 2020-04-01 15:31
// 
// 
// DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionTriangle;

/**
 * A038252 Triangle whose (i,j)-th entry is binomial(i,j)*5^(i-j)*10^j.
 * @author Georg Fischer
 */
public class A038252 extends GeneratingFunctionTriangle {

  /** Construct the sequence. */
  public A038252() {
    super(0, new long[] {1}, new long[] {1, -5, -10});
  }
}
