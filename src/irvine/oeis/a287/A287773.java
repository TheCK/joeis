package irvine.oeis.a287;
// Generated by gen_seq4.pl mortra at 2021-09-23 21:42

import irvine.oeis.MorphismTransform;
import irvine.oeis.a003.A003849;

/**
 * A287773 {0-&gt;010, 1-&gt;101}-transform of the infinite Fibonacci word A003849.
 * @author Georg Fischer
 */
public class A287773 extends MorphismTransform {

  /** Construct the sequence. */
  public A287773() {
    super(new A003849(), "0->010, 1->101");
  }
}
