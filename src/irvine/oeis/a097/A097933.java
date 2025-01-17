package irvine.oeis.a097;
// Generated by gen_seq4.pl primeval at 2021-05-28 22:45
// DO NOT EDIT here!

import irvine.oeis.prime.PrimeSubsequence;
import irvine.oeis.a091.A091998;

/**
 * A097933 Primes such that p divides 3^((p-1)/2) - 1.
 *
 * @author Georg Fischer
 */
public class A097933 extends PrimeSubsequence {

  /** Construct the sequence. */
  public A097933() {
    super(new A091998());
  }
}
