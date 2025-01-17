package irvine.oeis.a201;
// Generated by gen_seq4.pl holos at 2021-06-13 21:50
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A201546 The number of permutations of {1,2,...,2n} that contain a cycle of length greater than n.
 * Recurrence: -a(n)+(6-12*n+8*n^2)*a(n-1)-4*(n-1)^2*(2*n-3)^2*a(n-2)
 * @author Georg Fischer
 */
public class A201546 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A201546() {
    super(1, "[[0],[-36, 120,-148, 80,-16],[6,-12, 8],[-1]]", "[1, 14, 444              ]", 0);
  }
}
