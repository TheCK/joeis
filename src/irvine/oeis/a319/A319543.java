package irvine.oeis.a319;
// Generated at 2019-04-01 by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A319543 a(n) = 1*2*3 - 4*5*6 + 7*8*9 - 10*11*12 + 13*14*15 - ... + (up to n). 
 * @author Georg Fischer
 */
public class A319543 extends LinearRecurrence {

  /** Construct the sequence. */
  public A319543() {
    super(new long[] {1L, -1L, 0L, 4L, -4L, 0L, 6L, -6L, 0L, 4L, -4L, 0L, 1L}, new long[] {1L, 2L, 6L, 2L, -14L, -114L, -107L, -58L, 390L, 380L, 280L, -930L, -917L});
  } // constructor()
} // A319543
