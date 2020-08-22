package irvine.oeis.a177;
// Generated by gen_seq4.pl holos [[0,0],[-120,24],[288,-72],[-206,67],[35,-13],[2,-7],[1,1]] [1,8,17,99,471] 0 at 2020-01-24 16:04
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A177129 Sequence defined by the recurrence formula a(n+1)=sum(a(p)*a(n-p)+k,p=0..n)+l for n&gt;=1, with here a(0)=1, a(1)=8, k=0 and l=1.
 * @author Georg Fischer
 */
public class A177129 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A177129() {
    super(0, "[[0,0],[-120,24],[288,-72],[-206,67],[35,-13],[2,-7],[1,1]]", "[1,8,17,99,471]", 0);
  }
}
