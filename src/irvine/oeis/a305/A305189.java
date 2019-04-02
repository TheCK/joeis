package irvine.oeis.a305;
// Generated at 2019-04-01 by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A305189 a(n) = 1*2 + 3 + 4*5 + 6 + 7*8 + 9 + 10*11 + 12 + ... + (up to n). 
 * @author Georg Fischer
 */
public class A305189 extends LinearRecurrence {

  /** Construct the sequence. */
  public A305189() {
    super(new long[] {-1L, 1L, 0L, 3L, -3L, 0L, -3L, 3L, 0L, 1L}, new long[] {1L, 2L, 5L, 9L, 25L, 31L, 38L, 87L, 96L, 106L});
  } // constructor()
} // A305189
