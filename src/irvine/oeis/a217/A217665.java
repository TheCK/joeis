package irvine.oeis.a217;
// Generated by gen_seq4.pl holos at 2020-04-12 21:28
// ogf: (1-3*x)/sqrt((1-4*x)*(1-4*x+4*x^2-4*x^3))
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A217665 G.f.: Sum_{n&gt;=0} x^n * Sum_{k=0..n} binomial(n,k)^2 * x^k/(1-3*x)^k.
 * @author Georg Fischer
 */
public class A217665 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A217665() {
    super(0, "[[0],[48,48],[-138,-76],[190,80],[-140,-44],[45,11],[-5,-1]]", "[1,1,2,8,32,122,462]", 5);
  }
}
