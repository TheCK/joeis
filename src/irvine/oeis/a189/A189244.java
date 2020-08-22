package irvine.oeis.a189;
// Generated by gen_seq4.pl holose at 2020-04-12 21:28
// egf: exp((x*(3+x))/(3*x+x^2+1))
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A189244 The n-th derivative of e^((2-x-x^2)/(1-x-x^2)), evaluated at x=1.
 * @author Georg Fischer
 */
public class A189244 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A189244() {
    super(0, "[[0],[0,1],[6,6],[20,11],[15,6],[4,1]]", "[1,3,-7,9,177,-3897]", 4);
    setGfType(1);
  }
}
