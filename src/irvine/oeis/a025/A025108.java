package irvine.oeis.a025;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a000.A000045;
import irvine.oeis.a001.A001950;

/**
 * A025108 s(1)t(n) + s(2)t(n-1) + ... + s(k)t(n-k+1), where k = [ n/2 ], s = (F(2), F(3), F(4), ...), t = A001950 (upper Wythoff sequence).
 * @author Sean A. Irvine
 */
public class A025108 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A025108() {
    super(new SkipSequence(new A000045(), 1), new PrependSequence(new A001950(), 0), false);
    next();
  }
}
