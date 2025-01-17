package irvine.oeis.a157;
// Generated by gen_seq4.pl wraptr1 at 2021-10-17 19:42

import irvine.oeis.a000.A000079;
import irvine.oeis.a105.A105755;
import irvine.oeis.triangle.WrappedRecurrence;

/**
 * A157933 Triangle T(i,j) such that Sum_{j=0..i} T(i,j)*x(i,j)/2^i = Sum_{k=0..i, j=0..k} x(k,j), if x(k-1,j) = (x(k,j) + x(k,j+1))/2.
 * @author Georg Fischer
 */
public class A157933 extends WrappedRecurrence {

  /** Construct the sequence. */
  public A157933() {
    super(new A105755());
    setPlus(new A000079());
    skipPlus(2);
  }
}
