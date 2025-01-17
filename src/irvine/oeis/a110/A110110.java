package irvine.oeis.a110;
// Generated by gen_seq4.pl holos at 2020-04-12 21:28
// ogf: ((1+x)*(-1+sqrt(1-6*x^2+x^4)/(1-2*x-x^2)))/(2*x)
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A110110 Number of symmetric Schroeder paths of length 2n (A Schroeder path of length 2n is a lattice path from (0,0) to (2n,0) consisting of U=(1,1), D=(1,-1) and H=(2,0) steps and never going below the x-axis).
 * @author Georg Fischer
 */
public class A110110 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A110110() {
    super(0, "[[0],[0,1,1],[4,6,2],[0,-8,-4],[-72,-58,-10],[-232,-98,-10],[-428,-134,-10],[-304,-72,-4],[80,26,2],[72,17,1]]", "[1,2,4,8,18,38,88,192,450,1002]", 8);
  }
}
