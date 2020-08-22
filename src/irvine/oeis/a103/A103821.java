package irvine.oeis.a103;
// Generated by gen_seq4.pl holos at 2020-04-12 21:28
// ogf: 1/((1-x)*sqrt(1-4*x-4*x^2))
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A103821 A Whitney transform of the central binomial coefficients A000984.
 * @author Georg Fischer
 */
public class A103821 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A103821() {
    super(0, "[[0],[8,4],[2],[-13,-5],[3,1]]", "[1,3,11,43,179]", 3);
  }
}
