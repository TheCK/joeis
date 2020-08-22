package irvine.oeis.a308;
// Generated by gen_seq4.pl holos [0,-1,5,-10,10,-5,1] [1,2,6,18,46] 0 at 2019-12-17 15:30
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A308305 a(n) = s(n,n) + s(n,n-1) + s(n,n-2), where s(n,k) are the unsigned Stirling numbers of the first kind (see A132393).
 * @author Georg Fischer
 */
public class A308305 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A308305() {
    super(1, "[0,-1,5,-10,10,-5,1]", "[1,2,6,18,46]", 0);
  }
}
