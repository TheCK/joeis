package irvine.oeis.a054;
// Generated by gen_seq4.pl holos at 2020-04-12 21:28
// ogf: 2/(1-4*x+sqrt(1-4*x^2))
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A054341 Row sums of triangle A054336 (central binomial convolutions).
 * @author Georg Fischer
 */
public class A054341 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A054341() {
    super(0, "[[0],[40,60,20],[-176,-144,-28],[24,18,3],[116,57,7],[-40,-18,-2]]", "[1,2,5,12,30,74]", 4);
  }
}
