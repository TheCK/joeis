package irvine.oeis.a122;
// Generated by gen_seq4.pl holos at 2021-06-16 17:26
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A122752 a(0) = 1; a(1) = 1; a(2) = 1; a(n) = (n-1)*a(n-1) + (n-2)*a(n-2) + (n-3)*a(n-3) for n &gt;= 3.
 * Recurrence: a(n) = (n-1)a(n-1)+(n-2)a(n-2)+(n-3)a(n-3) for n &gt;= 3.
 * @author Georg Fischer
 */
public class A122752 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A122752() {
    super(0, "[[0],[-3, 1],[-2, 1],[-1, 1],[-1]]", "[1, 1, 1, 3]", 0);
  }
}
