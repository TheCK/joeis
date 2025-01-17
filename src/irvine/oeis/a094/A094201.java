package irvine.oeis.a094;
// Generated by gen_seq4.pl holos [[-1,-5,-11,-13,-10,-4],[1]] [1,44] 0 at 2020-03-14 22:45
// Recurrence: a[n+0]=4*n^5+10*n^4+13*n^3+11*n^2+5*n+1
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A094201 a(n) = 4*n^5 + 10*n^4 + 13*n^3 + 11*n^2 + 5*n + 1.
 * @author Georg Fischer
 */
public class A094201 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A094201() {
    super(0, "[[-1,-5,-11,-13,-10,-4],[1]]", "[1,44]", 0);
  }
}
