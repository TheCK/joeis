package irvine.oeis.a141;
// Generated by gen_seq4.pl nest at 2020-12-29 12:34
// DO NOT EDIT here!

import irvine.oeis.NestedSequence;
import irvine.oeis.a000.A000005;
import irvine.oeis.a009.A009087;


/**
 * A141242 a(n) is the number of divisors of the n-th positive integer with a prime number of divisors. In other words a(n) is the number of divisors of A009087(n).
 * Formula: <code>a(n) = A000005(A009087(n)).</code>
 * @author Georg Fischer
 */
public class A141242 extends NestedSequence {

  /** Construct the sequence. */
  public A141242() {
    super(1, new A000005(), new A009087(), 1, 1); 
  }

}
