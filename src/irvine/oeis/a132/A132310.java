package irvine.oeis.a132;
// Generated by gen_seq4.pl holos [[0],[-6,12],[2,-7],[0,1]] [1,5,21] 0 at 2019-12-06 18:14
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A132310 a(n) = 3^n*Sum_{ k=0..n } binomial(2*k,k)/3^k.
 * @author Georg Fischer
 */
public class A132310 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A132310() {
    super(0, "[[0],[-6,12],[2,-7],[0,1]]", "[1,5,21]", 0);
  }
}
