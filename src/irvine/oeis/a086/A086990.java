package irvine.oeis.a086;
// Generated by gen_seq4.pl holos at 2020-04-12 21:28
// ogf: (1+4*x-sqrt(1+4*x^2))/(4+6*x)
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A086990 Expansion of (1+4x-sqrt(1+4x^2))/(4+6x) in powers of x.
 * @author Georg Fischer
 */
public class A086990 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A086990() {
    super(0, "[[0],[0,12,12],[-36,-40,-4],[-15,-20,-5],[-30,-13,-1],[-24,-14,-2]]", "[0,1,-2,3,-4,6]", 4);
  }
}
