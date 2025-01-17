package irvine.oeis.a098;
// Generated by gen_seq4.pl prisubd at 2021-01-15 23:59
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A098438 Numbers k such that (30^k - 1)/29 is prime.
 * @author Georg Fischer
 */
public class A098438 extends PrimePositionSubsequence {

  private static final Z DIV = Z.valueOf(29);
  
  /** Construct the sequence. */
  public A098438() {
    super("[[29],[30],[-1]]", "[0, 29]", 0);
  }

  @Override
  public boolean isOk(final Z term) {
    final Z[] quotRem = term.divideAndRemainder(DIV);
    return quotRem[1].equals(Z.ZERO) && quotRem[0].isProbablePrime();
  }

}
