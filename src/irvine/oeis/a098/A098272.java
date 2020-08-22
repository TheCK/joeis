package irvine.oeis.a098;
// Generated by gen_seq4.pl holos at 2020-04-12 21:28
// ogf: (2*sin(1/3*arcsin(3*sqrt(3)*sqrt(x))))/(sqrt(3)*sqrt(x))
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A098272 a(n) = 2^(2n+1) * binomial(3n,n)/(2n+1).
 * @author Georg Fischer
 */
public class A098272 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A098272() {
    super(0, "[[0],[12,54,54],[-3,-5,-2]]", "[2,8,96]", 1);
  }
}
