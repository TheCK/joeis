package irvine.oeis.a301;
// Generated by gen_seq4.pl holos at 2021-08-18 13:24

import irvine.oeis.HolonomicRecurrence;
/**
 * A301420 Sums of positive coefficients in generalized Chebyshev polynomials of the first kind, for a family of 5 data.
 * radtorec((-x*(1+x)^4+1)/(x^6+4*x^5+5*x^4-5*x^2-6*x+1))
 * @author Georg Fischer
 */
public class A301420 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A301420() {
    super(1, "[[0],[-10, 1],[-72, 8],[-214, 27],[-320, 48],[-196, 42],[132,-3],[352,-52],[264,-57],[70,-23],[-4, 3],[-2, 7],[0,-1]]", "[1, 5, 31, 205, 1376, 9251, 62210, 418361, 2813485, 18920751, 127242501, 855708865, 5754662616, 38700243965]", 0);
  }
}
