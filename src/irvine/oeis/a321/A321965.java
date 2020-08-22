package irvine.oeis.a321;
// Generated by gen_seq4.pl holos [[0],[-2,-5,-4,-1],[10,11,3],[-8,-3],[1]] [1,2,8,46,338] 3 at 2020-03-14 22:45
// Recurrence: a[n+3]=(n+1)^2*(n+2)*a[n+0]-(5+3*n)*(n+2)*a[n+1]+(8+3*n)*a[n+2]
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A321965 a(n) = n! [x^n] exp((1/(x - 1)^2 - 1)/2)/(1 - x).
 * @author Georg Fischer
 */
public class A321965 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A321965() {
    super(0, "[[0],[-2,-5,-4,-1],[10,11,3],[-8,-3],[1]]", "[1,2,8,46,338]", 3);
  }
}
