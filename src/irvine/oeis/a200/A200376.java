package irvine.oeis.a200;
// Generated by gen_seq4.pl holos at 2020-04-12 21:28
// ogf: 1/sqrt(1-10*x^2+x^4/(1-8*x^2))+x/(1-9*x^2)
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A200376 G.f.: 1/sqrt(1-10*x^2 + x^4/(1-8*x^2)) + x/(1-9*x^2).
 * @author Georg Fischer
 */
public class A200376 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A200376() {
    super(0, "[[0],[72,72],[0],[-44,-17],[0],[4,1]]", "[1,1,5,9,37,81]", 4);
  }
}
