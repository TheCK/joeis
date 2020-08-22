package irvine.oeis.a185;
// Generated by gen_seq4.pl holos [[-1],[-2,-1],[1]] [2] 0 at 2019-12-06 18:14
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A185109 a(0)=2; for n &gt; 0, a(n) = (n+2)*a(n-1) + 1.
 * @author Georg Fischer
 */
public class A185109 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A185109() {
    super(0, "[[-1],[-2,-1],[1]]", "[2]", 0);
  }
}
