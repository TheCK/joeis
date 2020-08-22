package irvine.oeis.a025;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a000.A000045;
import irvine.oeis.a000.A000201;

/**
 * A025084 a(n) = s(1)t(n) + s(2)t(n-1) + ... + s(k)t(n-k+1), where k = [ n/2 ], s = (Fibonacci numbers), t = A000201 (lower Wythoff sequence).
 * @author Sean A. Irvine
 */
public class A025084 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A025084() {
    super(new A000045(), new PrependSequence(new A000201(), 0), false);
    next();
  }
}
