package irvine.oeis.a231;
// Generated by gen_seq4.pl prisubd at 2021-01-15 23:59
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A231604 Numbers n such that (42^n + 1)/43 is prime.
 * @author Georg Fischer
 */
public class A231604 extends PrimePositionSubsequence {

  private static final Z DIV = Z.valueOf(43);
  
  /** Construct the sequence. */
  public A231604() {
    super("[[-41],[42],[-1]]", "[2, 43]", 0);
  }

  @Override
  public boolean isOk(final Z term) {
    final Z[] quotRem = term.divideAndRemainder(DIV);
    return quotRem[1].equals(Z.ZERO) && quotRem[0].isProbablePrime();
  }

}
