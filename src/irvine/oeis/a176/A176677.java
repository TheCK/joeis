package irvine.oeis.a176;
// Generated by gen_seq4.pl holos [[0,0],[-20,4],[20,-4],[18,-9],[-21,15],[2,-7],[1,1]] [1,1,1,2,5] 0 at 2020-01-24 16:04
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A176677 Sequence defined by the recurrence formula a(n+1)=sum(a(p)*a(n-p)+k,p=0..n)+l for n&gt;=1, with here a(0)=1, a(1)=1, k=0 and l=-1.
 * @author Georg Fischer
 */
public class A176677 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A176677() {
    super(0, "[[0,0],[-20,4],[20,-4],[18,-9],[-21,15],[2,-7],[1,1]]", "[1,1,1,2,5]", 0);
  }
}
