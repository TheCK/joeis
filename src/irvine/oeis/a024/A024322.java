package irvine.oeis.a024;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a000.A000045;
import irvine.oeis.a023.A023531;

/**
 * A024322 s(1)t(n) + s(2)t(n-1) + ... + s(k)t(n+1-k), where k=[ (n+1)/2) ], s = A023531, t = (F(2), F(3), ...).
 * @author Sean A. Irvine
 */
public class A024322 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A024322() {
    super(new A023531(), new SkipSequence(new A000045(), 1));
  }
}
