package irvine.oeis.a126;
// Generated by gen_seq4.pl holos at 2020-04-12 21:28
// ogf: (1-3*x-6*x^3-sqrt(1-6*x+9*x^2-12*x^3))/(18*x^4)
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A126189 Number of hex trees with n edges and no adjacent vertices of outdegree 2.
 * @author Georg Fischer
 */
public class A126189 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A126189() {
    super(0, "[[0],[90,126,36],[-486,-369,-63],[1044,561,69],[-912,-393,-39],[522,183,15],[-90,-28,-2]]", "[1,3,10,36,135,519,2034]", 5);
  }
}
