package irvine.oeis.a256;
// Generated by gen_seq4.pl partsumm/partsum at 2022-04-12 22:10

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a014.A014684;

/**
 * A256885 a(n) = n*(n + 1)/2 - pi(n), where pi(n) = A000720(n) is the prime counting function.
 * @author Georg Fischer
 */
public class A256885 extends PartialSumSequence {

  /** Construct the sequence. */
  public A256885() {
    super(new A014684());
  }
}
