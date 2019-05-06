package irvine.oeis.a021;

import irvine.math.q.Q;
import irvine.oeis.PisotLSequence;

/**
 * A021006 Pisot sequence <code>P(4,11), a(0)=4, a(1)=11, a(n+1)</code> is the nearest integer to <code>a(n)^2/a(n-1)</code>. Evidently satisfies <code>a(n) = 2*a(n-1)+2*a(n-2)</code>.
 * @author Sean A. Irvine
 */
public class A021006 extends PisotLSequence {

  /** Construct the sequence. */
  public A021006() {
    super(4, 11, Q.HALF.negate());
  }
}

