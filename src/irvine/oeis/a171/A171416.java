package irvine.oeis.a171;
// Generated by gen_seq4.pl holos at 2020-04-12 21:28
// ogf: (1-x^2-sqrt(1-6*x^2-4*x^3+x^4))/(2*x^2)
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A171416 A sequence with Somos-4 Hankel transform.
 * @author Georg Fischer
 */
public class A171416 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A171416() {
    super(0, "[[0],[0,1,1],[0,-2,-2],[-48,-47,-11],[-312,-166,-22],[-696,-265,-25],[-462,-136,-10],[120,39,3],[126,32,2]]", "[1,1,2,3,7,13,31,65,156]", 7);
  }
}
