package irvine.oeis.a036;
// Generated by gen_seq4.pl holos at 2020-04-12 21:28
// ogf: 2/((1-x)*(1-2*x+sqrt(1-4*x^2)))
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A036256 a(n) = Sum_{i=0..n} binomial(i,floor(i/2)).
 * @author Georg Fischer
 */
public class A036256 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A036256() {
    super(0, "[[0],[8,4],[-6,-4],[-6,-1],[4,1]]", "[1,2,4,7,13]", 3);
  }
}
