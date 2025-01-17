package irvine.oeis.a128;
// Generated by gen_seq4.pl prisubd at 2021-01-15 23:59
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A128349 Numbers k such that (13^k - 5^k)/8 is prime.
 * @author Georg Fischer
 */
public class A128349 extends PrimePositionSubsequence {

  private static final Z DIV = Z.EIGHT;
  
  /** Construct the sequence. */
  public A128349() {
    super("[[0],[-65],[18],[-1]]", "[0, 8]", 0);
  }

  @Override
  public boolean isOk(final Z term) {
    final Z[] quotRem = term.divideAndRemainder(DIV);
    return quotRem[1].equals(Z.ZERO) && quotRem[0].isProbablePrime();
  }

}
