package irvine.oeis.a184;
// Generated by gen_seq4.pl holos [0,-1,2,0,-2,1] [1,2,4,7,10] 0 at 2019-12-17 15:30
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A184674 a(n) = n+floor((n/2-1/(2*n))^2); complement of A184675.
 * @author Georg Fischer
 */
public class A184674 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A184674() {
    super(1, "[0,-1,2,0,-2,1]", "[1,2,4,7,10]", 0);
  }
}
