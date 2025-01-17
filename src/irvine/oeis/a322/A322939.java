package irvine.oeis.a322;
// Generated by gen_seq4.pl holos [[0],[-4],[-3],[-2],[1]] [1,1,1,9,25] 0 at 2020-03-14 22:45
// Recurrence: a[n+0]=4*a[n-3]+3*a[n-2]+2*a[n-1]
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A322939 a(n) = [x^n] (4*x^2 + x - 1)/(4*x^3 + 3*x^2 + 2*x - 1).
 * @author Georg Fischer
 */
public class A322939 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A322939() {
    super(0, "[[0],[-4],[-3],[-2],[1]]", "[1,1,1,9,25]", 0);
  }
}
