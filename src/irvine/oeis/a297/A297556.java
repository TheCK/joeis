package irvine.oeis.a297;
// Generated at 2019-04-01 by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A297556 a(n) = a(n-1) + 16*a(n-3) - 16*a(n-4), where a(0) = 1, a(1) = 4, a(2) = 7, a(3) = 19. 
 * @author Georg Fischer
 */
public class A297556 extends LinearRecurrence {

  /** Construct the sequence. */
  public A297556() {
    super(new long[] {-16L, 16L, 0L, 1L}, new long[] {1L, 6L, 7L, 19L});
  } // constructor()
} // A297556
