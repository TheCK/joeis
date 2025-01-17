package irvine.oeis.a263;
// Generated by gen_seq4.pl eumapgf at 2020-11-29 21:38
// DO NOT EDIT here!

import irvine.oeis.transform.EulerTransform;
import irvine.oeis.GeneratingFunctionSequence;


/**
 * A263146 Expansion of Product_{k&gt;=1} (1+x^(5*k-2))^k.
 * ET(ogf=-(x^12+2*x^7-x^5+x^2)/(-x^20+2*x^10-1), order=21)
 * @author Georg Fischer
 */
public class A263146 extends EulerTransform {

  /** Construct the sequence. */
  public A263146() {
    super(new GeneratingFunctionSequence(0, "[0, 0, 1, 0, 0,-1, 0, 2, 0, 0, 0, 0, 1]", "[1, 0, 0, 0, 0, 0, 0, 0, 0, 0,-2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1]"), new long[]{1});
  }
}
