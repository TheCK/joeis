package irvine.oeis.a060;
// Generated by gen_seq4.pl binomx at 2021-06-29 22:31
// DO NOT EDIT here!

import irvine.oeis.transform.BinomialTransformSequence;
import irvine.oeis.a186.A186021;

/**
 * A060719 a(0) = 1; a(n+1) = a(n) + Sum_{i=0..n} binomial(n,i)*(a(i)+1).
 * @author Georg Fischer
 */
public class A060719 extends BinomialTransformSequence {

  /** Construct the sequence. */
  public A060719() {
    super(new A186021(), 0);
  }
}
