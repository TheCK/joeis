package irvine.oeis.a233;
// Generated by gen_seq4.pl holos [[0],[-181440,-1506456,-5056506,-8790061,-8353079,-4117715,-823543],[0,151200,615960,986904,778896,303264,46656]] [1,10,115] 0 at 2020-03-14 22:45
// Recurrence: 72*n*(6*n+5)*(3*n+5)*(2*n+3)*(3*n+4)*(6*n+7)*a[n+0]-7*(7*n+4)*(7*n+8)*(7*n+5)*(7*n+9)*(7*n+6)*(7*n+3)*a[n-1]=0
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A233908 10*binomial(7*n+10,n)/(7*n+10).
 * @author Georg Fischer
 */
public class A233908 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A233908() {
    super(0, "[[0],[-181440,-1506456,-5056506,-8790061,-8353079,-4117715,-823543],[0,151200,615960,986904,778896,303264,46656]]", "[1,10,115]", 0);
  }
}
