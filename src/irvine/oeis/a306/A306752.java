package irvine.oeis.a306;
// Generated by gen_seq4.pl holos [0,-1,1,-8,28,-56,70,-56,28,-8,1] [1,1,1,1,1,1,1,1,1] 0 at 2019-12-17 15:30
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A306752 a(n) = Sum_{k=0..n} binomial(k, 8*(n-k)).
 * @author Georg Fischer
 */
public class A306752 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A306752() {
    super(1, "[0,-1,1,-8,28,-56,70,-56,28,-8,1]", "[1,1,1,1,1,1,1,1,1]", 0);
  }
}
