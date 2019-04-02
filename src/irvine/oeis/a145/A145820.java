package irvine.oeis.a145;
// Generated at 2019-04-01 by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A145820 Numbers n such that 17, n, n+1 are the sides of a Heron triangle, i.e., a triangle with integer sides and integer area. 
 * @author Georg Fischer
 */
public class A145820 extends LinearRecurrence {

  /** Construct the sequence. */
  public A145820() {
    super(new long[] {1L, -1L, 0L, -6L, 6L, 0L, 1L}, new long[] {8L, 9L, 16L, 25L, 40L, 89L, 144L});
  } // constructor()
} // A145820
