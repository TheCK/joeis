package irvine.oeis.a055;
// Generated by gen_seq4.pl deris/essent at 2021-12-09 22:52

import irvine.oeis.PrependSequence;
import irvine.oeis.a052.A052424;

/**
 * A055398 Result of fourth stage of sieve of Eratosthenes (after eliminating multiples of 2, 3, 5, 7).
 * @author Georg Fischer
 */
public class A055398 extends PrependSequence {

  /** Construct the sequence. */
  public A055398() {
    super(1, new A052424());
  }
}
