package irvine.oeis.a272;
// Generated by gen_seq4.pl holos at 2021-06-02 19:27
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A272913 a(n) = 3*2^(2*n-1)*(n-1)*n^3*binomial(2*n,n)^2, a closed form for a triple binomial sum involving absolute values.
 * Recurrence: (n-2)*(n-1)^2*a(n)-16*n*(2*n-1)^2*a(n-1)=0
 * @author Georg Fischer
 */
public class A272913 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A272913() {
    super(0, "[[0],[0, 16,-64, 64],[2,-5, 4,-1]]", "0, 0, 6912, 2073600, 361267200, 48771072000, 5665247723520", 0);
  }
}
