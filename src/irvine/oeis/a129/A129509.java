package irvine.oeis.a129;
// Generated by gen_seq4.pl holos at 2020-04-12 21:28
// ogf: (1+x+x^2-sqrt(1+2*x+3*x^2-2*x^3+x^4))/2
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A129509 G.f.: (1+x+x^2-sqrt(1+2x+3x^2-2x^3+x^4))/2.
 * @author Georg Fischer
 */
public class A129509 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A129509() {
    super(0, "[[0],[2,-3,1],[0,3,-3],[-2,-6,2],[16,21,5],[-92,-60,-10],[-86,-51,-7],[-54,-27,-3]]", "[0,0,0,1,-1,0,2,-4]", 6);
  }
}
