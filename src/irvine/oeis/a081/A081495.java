package irvine.oeis.a081;
// Generated by gen_seq4.pl holos at 2020-04-12 21:28
// ogf: ((1-x)^3-(1-2*x-x^3)*sqrt(1-4*x))/((1-x)^2*sqrt(1-4*x))
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A081495 Start with Pascal's triangle; form a rhombus by sliding down n steps from top on both sides then sliding down inwards to complete the rhombus and then deleting the inner numbers; a(n) = sum of entries on perimeter of rhombus.
 * @author Georg Fischer
 */
public class A081495 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A081495() {
    super(1, "[[0],[4,-12,8],[-8,-74,-74],[-56,150,102],[682,219,3],[-710,-396,-54],[58,72,12],[180,54,4],[-42,-13,-1]]", "[1,5,17,55,189,681,2519,9451,35765]", 7);
  }
}
