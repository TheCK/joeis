package irvine.oeis.a093;
// Generated by gen_seq4.pl holose at 2020-04-12 21:28
// egf: exp((4*x)/(1-2*x))/(1-2*x)^(1/2)
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A093620 Values of Laguerre polynomials: a(n) = 2^n*n!*LaguerreL(n,-1/2,-2).
 * @author Georg Fischer
 */
public class A093620 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A093620() {
    super(0, "[[0],[2,4],[-9,-4],[2,1]]", "[1,5,43,499]", 2);
    setGfType(1);
  }
}
