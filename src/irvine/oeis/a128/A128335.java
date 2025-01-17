package irvine.oeis.a128;
// Generated by gen_seq4.pl prisubd at 2021-01-15 23:59
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A128335 Numbers k such that (4^k + 5^k)/9 is prime.
 * @author Georg Fischer
 */
public class A128335 extends PrimePositionSubsequence {

  private static final Z DIV = Z.NINE;
  
  /** Construct the sequence. */
  public A128335() {
    super("[[0],[-20],[9],[-1]]", "[2, 9]", 0);
  }

  @Override
  public boolean isOk(final Z term) {
    final Z[] quotRem = term.divideAndRemainder(DIV);
    return quotRem[1].equals(Z.ZERO) && quotRem[0].isProbablePrime();
  }

}
