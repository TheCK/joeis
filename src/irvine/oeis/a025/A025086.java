package irvine.oeis.a025;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.a000.A000045;
import irvine.oeis.a023.A023533;

/**
 * A025086 a(n) = s(1)t(n) + s(2)t(n-1) + ... + s(k)t(n-k+1), where k = [ n/2 ], s = (Fibonacci numbers), t = A023533.
 * @author Sean A. Irvine
 */
public class A025086 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A025086() {
    super(new A000045(), new A023533(), false);
    next();
  }
}
