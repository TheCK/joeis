package irvine.oeis.a059;
// Generated by gen_seq4.pl holos at 2020-04-12 21:28
// ogf: (sqrt((1+x-x^2)/(1-3*x-x^2))-1)/x/2
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A059398 Row sums of triangle in A059397.
 * @author Georg Fischer
 */
public class A059398 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A059398() {
    super(0, "[[0],[2,3,1],[4,6,2],[-12,-16,-4],[16,4],[-140,-48,-4],[-84,-26,-2],[42,13,1]]", "[1,2,6,17,51,154,473,1464]", 6);
  }
}
