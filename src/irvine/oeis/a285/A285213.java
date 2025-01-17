package irvine.oeis.a285;
// Generated by gen_seq4.pl eumapgf at 2020-11-29 21:38
// DO NOT EDIT here!

import irvine.oeis.transform.EulerTransform;
import irvine.oeis.GeneratingFunctionSequence;


/**
 * A285213 Expansion of Product_{k&gt;=0} (1-x^(4*k+3))^(4*k+3).
 * ET(ogf=-(x^6+3*x^2)/(x^8-2*x^4+1), order=9)
 * @author Georg Fischer
 */
public class A285213 extends EulerTransform {

  /** Construct the sequence. */
  public A285213() {
    super(new GeneratingFunctionSequence(0, "[0, 0,-3, 0, 0, 0,-1]", "[1, 0, 0, 0,-2, 0, 0, 0, 1]"), new long[]{1});
  }
}
