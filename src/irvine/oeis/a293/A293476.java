package irvine.oeis.a293;
// Generated at 2019-04-01 by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A293476 a(n) = ((n + 1)/2)*(n + 2)*Pochhammer(n, 5) / 4!. 
 * @author Georg Fischer
 */
public class A293476 extends LinearRecurrence {

  /** Construct the sequence. */
  public A293476() {
    super(new long[] {-1L, 8L, -28L, 56L, -70L, 56L, -28L, 8L}, new long[] {0L, 15L, 180L, 1050L, 4200L, 13230L, 35280L, 83160L});
  } // constructor()
} // A293476
