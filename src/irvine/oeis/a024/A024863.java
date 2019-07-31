package irvine.oeis.a024;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a000.A000201;
import irvine.oeis.a001.A001477;

/**
 * A024863 <code>a(n) = s(1)t(n) + s(2)t(n-1) + ... + s(k)t(n-k+1)</code>, where k <code>= [ n/2 ], s =</code> (natural numbers), <code>t = A000201</code> (lower Wythoff sequence).
 * @author Sean A. Irvine
 */
public class A024863 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A024863() {
    super(new A001477(), new PrependSequence(new A000201(), 0), false);
    next();
  }
}