package irvine.oeis.a038;
// Generated by gen_seq4.pl trigf 1 1, -8, -11 at 2020-04-01 15:31
// 
// 
// DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionTriangle;

/**
 * A038289 Triangle whose (i,j)-th entry is binomial(i,j)*8^(i-j)*11^j.
 * @author Georg Fischer
 */
public class A038289 extends GeneratingFunctionTriangle {

  /** Construct the sequence. */
  public A038289() {
    super(0, new long[] {1}, new long[] {1, -8, -11});
  }
}
