package irvine.oeis.a097;
// Generated by gen_seq4.pl holos at 2020-04-12 21:28
// ogf: 2/(1-8*x+(1-8*x)^(3/4))
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A097180 Row sums of triangle A097179, in which the n-th row polynomial R_n(y) is formed from the initial (n+1) terms of g.f. A077860(y)^(n+1), where R_n(1/2) = 4^n for all n&gt;=0.
 * @author Georg Fischer
 */
public class A097180 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A097180() {
    super(0, "[[0],[1680,3424,2304,512],[-1560,-2316,-1152,-192],[360,444,180,24],[-24,-26,-9,-1]]", "[1,7,52,395,3036]", 3);
  }
}
