package irvine.oeis.a305;
// Generated by gen_seq4.pl holose at 2020-04-12 21:28
// egf: (exp(-x)*x^2*(3-2*x+x^2))/(3*(1-x)^3)
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A305730 a(n) is the total displacement of all letters in all permutations of n letters with no fixed points.
 * @author Georg Fischer
 */
public class A305730 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A305730() {
    super(0, "[[0],[1],[-3,1],[3,-3],[9,5],[-6,-3]]", "[0,0,2,8,60,440]", 4);
    setGfType(1);
  }
}
