package irvine.oeis.a202;
// Generated by gen_seq4.pl holos [[0],[-120,-250,-175,-50,-5],[-480,-520,-180,-20],[-360,-210,-30],[-80,-20],[-5],[1]] [1,5,45,485,6145,88245,1403725] 5 at 2020-03-14 22:45
// Recurrence: a[n+5]-5*a[n+4]-20*(n+4)*a[n+3]-30*(n+3)*(n+4)*a[n+2]-20*(n+2)*(n+3)*(n+4)*a[n+1]-5*(n+1)*(n+2)*(n+3)*(n+4)*a[n+0]=0
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A202825 Expansion of e.g.f.: exp( (1+x)^5 - 1 ).
 * @author Georg Fischer
 */
public class A202825 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A202825() {
    super(0, "[[0],[-120,-250,-175,-50,-5],[-480,-520,-180,-20],[-360,-210,-30],[-80,-20],[-5],[1]]", "[1,5,45,485,6145,88245,1403725]", 5);
  }
}
