package irvine.oeis.a247;
// Generated by gen_seq4.pl holose at 2020-04-12 21:28
// egf: exp(-x/2)*(1-2*x)^(-3/4)
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A247249 a(n) = (2*n-1)*a(n-1) + (n-1)*a(n-2) with a(0) = a(1) = 1.
 * @author Georg Fischer
 */
public class A247249 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A247249() {
    super(0, "[[0],[1],[3,2],[-2,-1]]", "[1,1,4,22]", 2);
    setGfType(1);
  }
}
