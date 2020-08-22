package irvine.oeis.a176;
// Generated by gen_seq4.pl holos [[0,0],[-20,4],[34,-8],[4,-5],[-21,15],[2,-7],[1,1]] [1,1,0,-2,-8] 0 at 2020-01-24 16:04
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A176855 Sequence defined by the recurrence formula a(n+1)=sum(a(p)*a(n-p)+k,p=0..n)+l for n&gt;=1, with here a(0)=1, a(1)=1, k=-1 and l=0.
 * @author Georg Fischer
 */
public class A176855 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A176855() {
    super(0, "[[0,0],[-20,4],[34,-8],[4,-5],[-21,15],[2,-7],[1,1]]", "[1,1,0,-2,-8]", 0);
  }
}
