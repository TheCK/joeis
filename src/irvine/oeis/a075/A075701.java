package irvine.oeis.a075;
// Generated by gen_seq4.pl holos [0,-1,0,0,0,0,0,0,0,1] [1,-1,3,-2,7,-6,24,12,4] 0 at 2019-12-17 15:30
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A075701 a(1)=1, a(n+1)=sigma(a(n))-2*a(n).
 * @author Georg Fischer
 */
public class A075701 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A075701() {
    super(1, "[0,-1,0,0,0,0,0,0,0,1]", "[1,-1,3,-2,7,-6,24,12,4]", 0);
  }
}
