package irvine.oeis.a100;
// Generated by gen_seq4.pl holos at 2020-04-12 21:28
// ogf: x/(sqrt(1-4*x^2)*(2*sqrt(1-4*x^2)+x-2))
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A100069 Sum(k=0..floor(n/2) binomial(n,k)*4^(n-2*k) ).
 * @author Georg Fischer
 */
public class A100069 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A100069() {
    super(0, "[[0],[1088,1632,544],[-800,-792,-196],[-280,-448,-120],[300,247,49],[-48,-28,-4]]", "[1,4,18,76,326,1384]", 4);
  }
}
