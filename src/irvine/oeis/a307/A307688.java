package irvine.oeis.a307;
// Generated by gen_seq4.pl holos [0,-2,-1,2,-2,1] [0,0,2,3] 0 at 2019-12-17 15:30
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A307688 a(n) = 2*a(n-1)-2*a(n-2)+a(n-3)+2*a(n-4) with a(0)=a(1)=0, a(2)=2, a(3)=3.
 * @author Georg Fischer
 */
public class A307688 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A307688() {
    super(1, "[0,-2,-1,2,-2,1]", "[0,0,2,3]", 0);
  }
}
