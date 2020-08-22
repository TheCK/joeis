package irvine.oeis.a176;
// Generated by gen_seq4.pl holos [[0,0],[-120,24],[246,-60],[-140,43],[11,-1],[2,-7],[1,1]] [1,5,8,39,156] 0 at 2020-01-24 16:04
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A176757 Sequence defined by the recurrence formula a(n+1)=sum(a(p)*a(n-p)+k,p=0..n)+l for n&gt;=1, with here a(0)=1, a(1)=5, k=0 and l=-2.
 * @author Georg Fischer
 */
public class A176757 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A176757() {
    super(0, "[[0,0],[-120,24],[246,-60],[-140,43],[11,-1],[2,-7],[1,1]]", "[1,5,8,39,156]", 0);
  }
}
