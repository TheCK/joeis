package irvine.oeis.a066;
// Generated by gen_seq4.pl holos [[-1],[0,0,-1],[1]] [0] 0 at 2019-12-06 18:14
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A066998 a(0)=0; a(n) = n^2*a(n-1) + 1.
 * @author Georg Fischer
 */
public class A066998 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A066998() {
    super(0, "[[-1],[0,0,-1],[1]]", "[0]", 0);
  }
}
