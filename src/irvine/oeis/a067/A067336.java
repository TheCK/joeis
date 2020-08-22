package irvine.oeis.a067;
// Generated by gen_seq4.pl holos at 2020-04-12 21:28
// ogf: (1+sqrt(1-4*x))/(3*sqrt(1-4*x)-1)
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A067336 a(0)=1, a(1)=2, a(n) = a(n-1)*9/2 - Catalan(n-1) where Catalan(n) = binomial(2n,n)/(n+1) = A000108(n).
 * @author Georg Fischer
 */
public class A067336 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A067336() {
    super(0, "[[0],[0,108,216],[-108,-258,-138],[78,97,29],[-12,-10,-2]]", "[1,2,8,34,148]", 3);
  }
}
