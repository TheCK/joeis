package irvine.oeis.a285;
// Generated by gen_seq4.pl eumapgf at 2020-11-29 21:38
// DO NOT EDIT here!

import irvine.oeis.transform.EulerTransform;
import irvine.oeis.GeneratingFunctionSequence;


/**
 * A285070 Expansion of Product_{k&gt;=0} (1-x^(4*k+1))^(4*k+1).
 * ET(ogf=-(-3*x^4-1)/(-x^8+2*x^4-1), order=9)
 * @author Georg Fischer
 */
public class A285070 extends EulerTransform {

  /** Construct the sequence. */
  public A285070() {
    super(new GeneratingFunctionSequence(0, "[-1, 0, 0, 0,-3]", "[1, 0, 0, 0,-2, 0, 0, 0, 1]"), new long[]{1});
  }
}
