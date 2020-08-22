package irvine.oeis.a052;
// Generated by gen_seq4.pl holos [[0],[-40,-44,4,8],[8,-8,-6],[1,1]] [0,0,0,0,0,120,2880] 2 at 2019-12-06 18:14
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A052721 E.g.f. x*( (1-2*x-sqrt(1-4*x))/2 -x*(1-2*x-sqrt(1-4*x)) -x^2).
 * @author Georg Fischer
 */
public class A052721 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A052721() {
    super(0, "[[0],[-40,-44,4,8],[8,-8,-6],[1,1]]", "[0,0,0,0,0,120,2880]", 2);
  }
}
