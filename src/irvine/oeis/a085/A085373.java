package irvine.oeis.a085;
// Generated by gen_seq4.pl holos at 2020-04-12 21:28
// ogf: (1-x)/(1-4*x)^(5/2)
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A085373 a(n) = binomial(2n+1, n+1)*binomial(n+2, 2).
 * @author Georg Fischer
 */
public class A085373 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A085373() {
    super(0, "[[0],[6,4],[-14,-5],[2,1]]", "[1,9,60,350]", 2);
  }
}
