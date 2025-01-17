package irvine.oeis.a176;
// Generated by gen_seq4.pl holos [[0,0],[-80,16],[164,-40],[-90,27],[3,3],[2,-7],[1,1]] [1,4,7,29,113] 0 at 2020-01-24 16:04
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A176750 Sequence defined by the recurrence formula a(n+1)=sum(a(p)*a(n-p)+k,p=0..n)+l for n&gt;=1, with here a(0)=1, a(1)=4, k=0 and l=-1.
 * @author Georg Fischer
 */
public class A176750 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A176750() {
    super(0, "[[0,0],[-80,16],[164,-40],[-90,27],[3,3],[2,-7],[1,1]]", "[1,4,7,29,113]", 0);
  }
}
