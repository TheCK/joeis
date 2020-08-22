package irvine.oeis.a164;
// Generated by gen_seq4.pl holos at 2020-04-12 21:28
// ogf: (x*(1-x)^2)/(1-2*x)^2-x^3/((1-2*x)*sqrt(1-4*x^2))
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A164990 Number of square involutions of n.
 * @author Georg Fischer
 */
public class A164990 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A164990() {
    super(1, "[[0],[0,-24,24],[0,-8,-28],[-66,-72,-14],[116,105,23],[-10,-8,-2],[-46,-28,-4],[15,8,1]]", "[1,2,4,10,22,52,114,260]", 6);
  }
}
