package irvine.oeis.a135;
// Generated by gen_seq4.pl holos at 2020-04-12 21:28
// ogf: (1-2*x-sqrt(1-4*x+8*x^3-4*x^4))/(2*x^2*(1-x))
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A135052 Expansion of g.f.: (1-2*x-sqrt(1-4*x+8*x^3-4*x^4))/(2*x^2*(1-x)).
 * @author Georg Fischer
 */
public class A135052 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A135052() {
    super(0, "[[0],[16,24,8],[-224,-192,-40],[872,516,76],[-1352,-588,-64],[596,162,10],[760,288,26],[-1102,-321,-23],[514,129,8],[-80,-18,-1]]", "[1,1,3,7,19,51,143,407,1183,3487]", 8);
  }
}
