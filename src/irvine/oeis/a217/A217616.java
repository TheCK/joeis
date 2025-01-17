package irvine.oeis.a217;
// Generated by gen_seq4.pl holos [[0],[-8,4],[12,-8],[-4,4],[2,-4],[0,1]] [1,2,4,12,38] 0 at 2019-12-06 18:14
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A217616 G.f.: Sum_{n&gt;=0} x^n * Sum_{k=0..n} binomial(n,k)^2 * x^k*(2-x)^(n-k).
 * @author Georg Fischer
 */
public class A217616 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A217616() {
    super(0, "[[0],[-8,4],[12,-8],[-4,4],[2,-4],[0,1]]", "[1,2,4,12,38]", 0);
  }
}
