package irvine.oeis.a345;
// Generated by gen_seq4.pl holos at 2021-08-16 19:34

import irvine.oeis.HolonomicRecurrence;
/**
 * A345897 a(n) = 2*n^4/3 - 4*n^3/3 + 11*n^2/6 - 13*n/6 + 1.
 * radtorec((7*x^4-x^3+14*x^2-5*x+1)/(1-x)^5)
 * @author Georg Fischer
 */
public class A345897 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A345897() {
    super(0, "[[0],[-28, 7],[58,-8],[-6, 15],[46,-19],[-6, 6],[0,-1]]", "[1, 0, 4, 29, 107, 286, 630, 1219]", 0);
  }
}
