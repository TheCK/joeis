package irvine.oeis.a057;
// Generated by gen_seq4.pl mortra at 2021-09-23 21:42

import irvine.oeis.MorphismTransform;
import irvine.oeis.a026.A026600;

/**
 * A057215 [1-&gt;01, 2-&gt;10, 3-&gt;01]-transform of 3-symbol Thue-Morse A026600.
 * @author Georg Fischer
 */
public class A057215 extends MorphismTransform {

  /** Construct the sequence. */
  public A057215() {
    super(new A026600(), "1->01, 2->10, 3->01");
  }
}
