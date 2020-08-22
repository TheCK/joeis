package irvine.oeis.a176;
// Generated by gen_seq4.pl holos [[0,0],[-40,8],[96,-24],[-54,15],[-5,7],[2,-7],[1,1]] [1,3,5,17,61] 0 at 2020-01-24 16:04
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A176964 Sequence defined by the recurrence formula a(n+1)=sum(a(p)*a(n-p)+k,p=0..n)+l for n&gt;=1, with here a(0)=1, a(1)=3, k=-1 and l=1.
 * @author Georg Fischer
 */
public class A176964 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A176964() {
    super(0, "[[0,0],[-40,8],[96,-24],[-54,15],[-5,7],[2,-7],[1,1]]", "[1,3,5,17,61]", 0);
  }
}
