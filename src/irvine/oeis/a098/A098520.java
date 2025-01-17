package irvine.oeis.a098;
// Generated by gen_seq4.pl holos at 2020-04-12 21:28
// ogf: (2*x)/(1-2*x-15*x^2+(1-x)*sqrt(1-2*x-15*x^2))
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A098520 E.g.f. exp(x)*BesselI(1,4*x)/2.
 * @author Georg Fischer
 */
public class A098520 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A098520() {
    super(0, "[[0],[30,45,15],[6,7,2],[-3,-4,-1]]", "[0,1,2,15]", 2);
  }
}
