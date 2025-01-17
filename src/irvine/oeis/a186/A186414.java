package irvine.oeis.a186;
// Generated by gen_seq4.pl holos at 2021-07-06 21:47

import irvine.oeis.HolonomicRecurrence;

/**
 * A186414 a(n) = binomial(2n,n)^3/(n+1)^2.
 * binomial(2*n,n)^3/(n+1)^2
 * @author Georg Fischer
 */
public class A186414 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A186414() {
    super(0, "[[0],[8,-48, 96,-64],[0, 1, 2, 1]]", "[1]", 0);
  }
}
