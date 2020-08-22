package irvine.oeis.a128;
// Generated by gen_seq4.pl holos at 2020-04-12 21:28
// ogf: (sqrt(1-20*x^2)+2*x-1)/(2*x*(1-6*x))
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A128387 Expansion of c(5x^2)/(1-x*c(5x^2)), where c(x) is the g.f. of A000108.
 * @author Georg Fischer
 */
public class A128387 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A128387() {
    super(0, "[[0],[2400,3600,1200],[-1360,-1320,-320],[-320,-240,-40],[200,114,16],[-20,-9,-1]]", "[1,1,6,11,66,146]", 4);
  }
}
