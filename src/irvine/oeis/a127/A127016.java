package irvine.oeis.a127;
// Generated by gen_seq4.pl holos at 2020-04-12 21:28
// ogf: 2/(9-7*sqrt(1-4*x))
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A127016 Expansion of 1/(1+7*x*c(x)), c(x) the g.f. of Catalan numbers A000108.
 * @author Georg Fischer
 */
public class A127016 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A127016() {
    super(0, "[[0],[98,196],[-82,-17],[-16,-8]]", "[1,-7,42,-259]", 2);
  }
}
