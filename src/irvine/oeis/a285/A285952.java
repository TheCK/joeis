package irvine.oeis.a285;
// Generated by gen_seq4.pl mortra at 2021-09-23 21:42

import irvine.oeis.MorphismTransform;
import irvine.oeis.a010.A010060;

/**
 * A285952 {0-&gt;1, 1-&gt;10}-transform of the Thue-Morse word A010060.
 * @author Georg Fischer
 */
public class A285952 extends MorphismTransform {

  /** Construct the sequence. */
  public A285952() {
    super(new A010060(), "0->1, 1->10");
  }
}
