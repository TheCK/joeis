package irvine.oeis.a126;
// Generated by gen_seq4.pl holos at 2020-04-12 21:28
// ogf: 2/(7-5*sqrt(1-4*x))
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A126987 Expansion of 1/(1+5*x*c(x)), c(x) the g.f. of Catalan numbers A000108.
 * @author Georg Fischer
 */
public class A126987 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A126987() {
    super(0, "[[0],[50,100],[-38,-1],[-12,-6]]", "[1,-5,20,-85]", 2);
  }
}
