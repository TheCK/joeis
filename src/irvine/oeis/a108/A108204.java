package irvine.oeis.a108;

import irvine.oeis.HolonomicRecurrence;

/**
 * A108204 a(n) = 2*(n-1)*a(n-1) -(n-1)*a(n-2) with a(0)=0, a(1)=1.
 * @author Georg Fischer
 */
public class A108204 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A108204() {
    super(0, "[[0],[1,-1],[-2, 2],[-1]]", "[0, 1]", 0);
  }
}
