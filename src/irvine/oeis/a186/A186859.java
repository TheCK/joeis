package irvine.oeis.a186;
// Generated by gen_seq4.pl holose at 2020-04-12 21:28
// egf: exp(x^6+3*x^5+4*x^4+3*x^3+2*x^2+x)
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A186859 E.g.f. A(x)=exp(x^6+3*x^5+4*x^4+3*x^3+2*x^2+x).
 * @author Georg Fischer
 */
public class A186859 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A186859() {
    super(0, "[[0],[-6],[-15],[-16],[-9],[-4],[-1],[6,1]]", "[1,1,5,31,241,2021,19741,224155]", 6);
    setGfType(1);
  }
}
