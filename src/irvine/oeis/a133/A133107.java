package irvine.oeis.a133;
// Generated by gen_seq4.pl holos at 2020-04-12 21:28
// ogf: (x^2*(-1+3*x-x^2+(5*x^4-6*x^3+11*x^2-6*x+1+4*x^6-12*x^5)^(1/2)))/(2*(x^2-3*x+1)*(1-2*x)^2)
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A133107 Number of Ferrers diagrams with a single strictly smaller Ferrers puncture with the same orientation removed from the top with half-perimeter = n.
 * @author Georg Fischer
 */
public class A133107 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A133107() {
    super(6, "[[0],[0,-4,4],[0,-20,-28],[8,83,53],[40,-26,-26],[194,179,35],[-308,-290,-50],[140,147,25],[-20,-24,-4]]", "[1,7,32,121,410,1294,3888,11273,31826]", 7);
  }
}
