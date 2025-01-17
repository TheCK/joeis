package irvine.oeis.a143;
// Generated by gen_seq4.pl holos at 2021-05-08 19:57
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A143388 a(n) = Sum_{k=0..n} A033184(n,k)*A033184(n,n-k), where Catalan triangle entry A033184(n,k) = C(2*n-k,n-k)*(k+1)/(n+1).
 * @author Georg Fischer
 */
public class A143388 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A143388() {
    super(0, "[[0],[18, 9,-159,-81,-27],[24, 46, 32, 14, 4]]", "[1, 2]", 0);
  }
}
