package irvine.oeis.a257;
// Generated by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A257051 <code>a(n) = cpg(n, 3) + cpg(n, 4) + ... + cpg(n, n)</code> where <code>cpg(n</code>, m) is the m-th n-th-order centered polygonal number.
 * @author Georg Fischer
 */
public class A257051 extends LinearRecurrence {

  /** Construct the sequence. */
  public A257051() {
    super(new long[] {1L, -5L, 10L, -10L, 5L}, new long[] {0L, 10L, 38L, 98L, 208L}, new long[] {0L, 0L});
  } // constructor()
} // A257051
