package irvine.oeis.a038;
// Generated by gen_seq4.pl trigf 1 1, -12, -1 at 2020-04-01 15:31
// 
// 
// DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionTriangle;

/**
 * A038327 Triangle whose (i,j)-th entry is binomial(i,j)*12^(i-j)*1^j.
 * @author Georg Fischer
 */
public class A038327 extends GeneratingFunctionTriangle {

  /** Construct the sequence. */
  public A038327() {
    super(0, new long[] {1}, new long[] {1, -12, -1});
  }
}
