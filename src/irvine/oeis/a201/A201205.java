package irvine.oeis.a201;
// Generated by gen_seq4.pl holos at 2021-07-07 22:49

import irvine.oeis.HolonomicRecurrence;

/**
 * A201205 Bisection of half-convolution of Catalan sequence A000108; even part.
 * 2*n*(256*n^5-544*n^4+256*n^3+75*n^2-69*n+12)*a(n-1)-(8*(4*n-5))*(4*n-3)*(8*n^2+n-1)*(2*n-3)^2*a(n-2)-a(n)*(2*n+1)*n*(8*n^2-15*n+6)*(n+1)^2
 * @author Georg Fischer
 */
public class A201205 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A201205() {
    super(0, "[[0],[1080,-4824,-192, 22688,-34560, 19968,-4096],[0, 24,-138, 150, 512,-1088, 512],[0,-6,-9, 22, 31,-10,-16]]", "[1, 3]", 0);
  }
}
