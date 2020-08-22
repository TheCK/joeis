package irvine.oeis.a111;
// Generated by gen_seq4.pl holose at 2020-04-12 21:28
// egf: exp(x/(1+x))/sqrt(1-x^2)
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A111882 Row sums of triangle A111595 (normalized rescaled squared Hermite polynomials).
 * @author Georg Fischer
 */
public class A111882 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A111882() {
    super(0, "[[0],[1,1],[1,1],[-1,-1],[-3,-1]]", "[1,1,0,4,4]", 3);
    setGfType(1);
  }
}
