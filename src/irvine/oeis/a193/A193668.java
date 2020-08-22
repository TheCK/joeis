package irvine.oeis.a193;
// Generated by gen_seq4.pl holos [[0],[-2,1],[-2,-1],[1]] [1,1,5] 0 at 2019-12-06 18:14
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A193668 a(n) = Sum_{i=0..n-1} (n+i)*a(n-1-i) for n&gt;1, a(0)=1, a(1)=1.
 * @author Georg Fischer
 */
public class A193668 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A193668() {
    super(0, "[[0],[-2,1],[-2,-1],[1]]", "[1,1,5]", 0);
  }
}
