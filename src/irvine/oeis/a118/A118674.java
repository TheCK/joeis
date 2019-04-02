package irvine.oeis.a118;
// Generated at 2019-04-01 by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A118674 Nonnegative values x of solutions (x, y) to the Diophantine equation x^2 + (x + 31)^2 = y^2. 
 * @author Georg Fischer
 */
public class A118674 extends LinearRecurrence {

  /** Construct the sequence. */
  public A118674() {
    super(new long[] {1L, -1L, 0L, -6L, 6L, 0L, 1L}, new long[] {0L, 9L, 60L, 93L, 140L, 429L, 620L});
  } // constructor()
} // A118674
