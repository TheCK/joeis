package irvine.oeis.a093;
// Generated by gen_seq4.pl holose at 2020-04-12 21:28
// egf: (2*x+4*x^2)/(1-2*x)*exp(x)
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A093302 a(n) = (a(n-1)+(2n-1))*(2n) with a(0) = 0.
 * @author Georg Fischer
 */
public class A093302 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A093302() {
    super(0, "[[0],[-4],[0,4],[5],[-2,-1]]", "[0,2,20,150,1256]", 3);
    setGfType(1);
  }
}
