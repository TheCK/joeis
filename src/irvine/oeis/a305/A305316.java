package irvine.oeis.a305;
// Generated at 2019-04-01 by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A305316 a(n) = sqrt(5*b(n)^2 - 4) with b(n) = Fibonacci(6*n+5) = A134497(n). 
 * @author Georg Fischer
 */
public class A305316 extends LinearRecurrence {

  /** Construct the sequence. */
  public A305316() {
    super(new long[] {-1L, 18L}, new long[] {11L, 199L});
  } // constructor()
} // A305316
