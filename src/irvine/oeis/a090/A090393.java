package irvine.oeis.a090;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A090393 Eighth diagonal (m=7) of triangle A084938; a(n) = A084938(n+7,n) = (n^7 + 63*n^6 + 1855*n^5 + 34125*n^4 + 438424*n^3 + 3980172*n^2 + 20946960*n)/5040.
 * @author Georg Fischer
 */
public class A090393 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A090393() {
    super(0, new long[] {0, 5040, -28032, 65388, -81760, 57742, -21824, 3447},
      new long[] {1, -8, 28, -56, 70, -56, 28, -8, 1});
  }
}
