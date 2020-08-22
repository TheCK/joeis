package irvine.oeis.a100;
// Generated by gen_seq4.pl holos at 2020-04-12 21:28
// ogf: (sqrt(1-4*x^2)*(sqrt(1-4*x^2)+4*x-1))/(2*(5*x-2)*(4*x^2-1))
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A100099 An inverse Chebyshev transform of x/(1-2x).
 * @author Georg Fischer
 */
public class A100099 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A100099() {
    super(0, "[[0],[40,60,20],[-176,-144,-28],[49,28,3],[66,43,7],[-24,-14,-2]]", "[0,1,2,7,16,46]", 4);
  }
}
