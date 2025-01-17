package irvine.oeis.a251;
// Generated by gen_seq4.pl holos at 2021-06-16 17:24
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A251573 E.g.f.: exp(3*x*G(x)^2) / G(x)^2 where G(x) = 1 + x*G(x)^3 is the g.f. of A001764.
 * 27*(n-2)*a(n-2)-3*(3*n-8)*(15-13*n+3*n^2)*a(n-1)+2*(n-3)*(2*n-3)*a(n)=0
 * @author Georg Fischer
 */
public class A251573 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A251573() {
    super(0, "[[0],[54,-27],[-360, 447,-189, 27],[-18, 18,-4]]", "[1, 1, 3, 21]", 0);
  }
}
