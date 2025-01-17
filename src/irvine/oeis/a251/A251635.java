package irvine.oeis.a251;
// Generated by gen_seq4.pl rio at 2021-10-28 23:47

import irvine.oeis.triangle.GeneratingFunctionTriangle;

/**
 * A251635 Riordan array (1-2*x,x), inverse of Riordan array (1/(1-2*x), x) = A130321.
 *
 * @author Georg Fischer
 */
public class A251635 extends GeneratingFunctionTriangle {

  /** Construct the sequence. */
  public A251635() {
    super(0, new long[] {1, -2, 0}, new long[] {1, 0, -1, 0, 0, 0});
  }
}
