package irvine.oeis.a335;
// Generated by gen_seq4.pl holos at 2020-10-26 23:20
// 4: 5
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;


/**
 * A335927 a(n+1) = Sum_{k=1..n} (a(k) + k*(n-k)), with a(1)=1.
 * @author Georg Fischer
 */
public class A335927 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A335927() {
    super(1, "[[0],[-2],[7],[-9],[5],[-1]]", "[1, 2, 7, 20, 50]", 0);
  }
}
