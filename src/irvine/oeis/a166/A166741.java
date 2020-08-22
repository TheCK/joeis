package irvine.oeis.a166;
// Generated by gen_seq4.pl holos [[0],[-8,4,-1],[0],[1]] [1,2,4] 0 at 2020-03-14 22:45
// Recurrence: a[n+0]=(n^2-4*n+8)*a[n-2]
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A166741 E.g.f.: exp(2*arcsin(x)).
 * @author Georg Fischer
 */
public class A166741 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A166741() {
    super(0, "[[0],[-8,4,-1],[0],[1]]", "[1,2,4]", 0);
  }
}
