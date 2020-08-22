package irvine.oeis.a232;
// Generated by gen_seq4.pl holos [[0],[-362880,-8876304,-86112396,-441450324,-1325591001,-2410616376,-2611501074,-1549681956,-387420489],[0,1814400,18927360,82225152,193040384,264765440,212336640,92274688,16777216]] [1,10,135] 0 at 2020-03-14 22:45
// Recurrence: 128*n*(8*n+3)*(4*n+3)*(8*n+9)*(2*n+1)*(8*n+7)*(4*n+5)*(8*n+5)*a[n+0]-81*(9*n+2)*(9*n+4)*(3*n+2)*(9*n+8)*(9*n+1)*(3*n+1)*(9*n+5)*(9*n+7)*a[n-1]=0
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A232265 a(n) = 10*binomial(9*n + 10, n)/(9*n + 10).
 * @author Georg Fischer
 */
public class A232265 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A232265() {
    super(0, "[[0],[-362880,-8876304,-86112396,-441450324,-1325591001,-2410616376,-2611501074,-1549681956,-387420489],[0,1814400,18927360,82225152,193040384,264765440,212336640,92274688,16777216]]", "[1,10,135]", 0);
  }
}
