package irvine.oeis.a104;
// Generated by gen_seq4.pl primerg at 2022-04-10 16:39

import irvine.oeis.a049.A049470;
import irvine.oeis.a103.A103812;

/**
 * A104961 Primes from merging of 5 successive digits in decimal expansion of Cos(1).
 * @author Georg Fischer
 */
public class A104961 extends A103812 {

  /** Construct the sequence. */
  public A104961() {
    super(new A049470(), 5, 1);
  }
}
