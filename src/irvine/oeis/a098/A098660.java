package irvine.oeis.a098;
// Generated by gen_seq4.pl holos at 2020-04-12 21:28
// ogf: 1/sqrt(1-8*x^2)+(1-sqrt(1-8*x^2))/(4*x*sqrt(1-8*x^2))
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A098660 E.g.f. BesselI(0,2*sqrt(2)*x) + BesselI(1,2*sqrt(2)*x)/sqrt(2).
 * @author Georg Fischer
 */
public class A098660 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A098660() {
    super(0, "[[0],[32,48,16],[64,48,8],[-6,-8,-2],[-12,-7,-1]]", "[1,1,4,6,24]", 3);
  }
}
