package irvine.oeis.a119;
// Generated by gen_seq4.pl holos [[0],[-24,92,-142,113,-49,11,-1],[8,-26,31,-16,3],[-3,5,-3],[1]] [1,1,5,55] 0 at 2019-12-06 18:14
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A119399 a(n) = Sum_{k=0..n} (n!/k!)^2*binomial(n-1,k-1).
 * @author Georg Fischer
 */
public class A119399 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A119399() {
    super(0, "[[0],[-24,92,-142,113,-49,11,-1],[8,-26,31,-16,3],[-3,5,-3],[1]]", "[1,1,5,55]", 0);
  }
}
