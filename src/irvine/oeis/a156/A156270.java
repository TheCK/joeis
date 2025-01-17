package irvine.oeis.a156;
// Generated by gen_seq4.pl holos [[0],[16,-32],[1,1]] [1,8,128] 0 at 2020-03-14 22:45
// Recurrence: (n+1)*a[n+0]+16*(-2*n+1)*a[n-1]=0
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A156270 a(n) = 8^n*Catalan(n).
 * @author Georg Fischer
 */
public class A156270 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A156270() {
    super(0, "[[0],[16,-32],[1,1]]", "[1,8,128]", 0);
  }
}
