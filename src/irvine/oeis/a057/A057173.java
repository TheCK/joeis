package irvine.oeis.a057;
// Generated by gen_seq4.pl prisubd at 2021-01-15 23:59
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A057173 Numbers n such that (7^n + 1)/8 is a prime.
 * @author Georg Fischer
 */
public class A057173 extends PrimePositionSubsequence {

  private static final Z DIV = Z.EIGHT;
  
  /** Construct the sequence. */
  public A057173() {
    super("[[-6],[7],[-1]]", "[2, 8]", 0);
  }

  @Override
  public boolean isOk(final Z term) {
    final Z[] quotRem = term.divideAndRemainder(DIV);
    return quotRem[1].equals(Z.ZERO) && quotRem[0].isProbablePrime();
  }

}
