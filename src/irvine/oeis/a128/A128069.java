package irvine.oeis.a128;
// Generated by gen_seq4.pl prisubd at 2021-01-15 23:59
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A128069 Numbers k such that (3^k + 10^k)/13 is prime.
 * @author Georg Fischer
 */
public class A128069 extends PrimePositionSubsequence {

  private static final Z DIV = Z.valueOf(13);
  
  /** Construct the sequence. */
  public A128069() {
    super("[[0],[-30],[13],[-1]]", "[2, 13]", 0);
  }

  @Override
  public boolean isOk(final Z term) {
    final Z[] quotRem = term.divideAndRemainder(DIV);
    return quotRem[1].equals(Z.ZERO) && quotRem[0].isProbablePrime();
  }

}
