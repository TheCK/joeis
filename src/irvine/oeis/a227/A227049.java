package irvine.oeis.a227;
// Generated by gen_seq4.pl prisubd at 2021-01-15 23:59
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A227049 Numbers n such that (15^n + 4^n)/19 is prime.
 * @author Georg Fischer
 */
public class A227049 extends PrimePositionSubsequence {

  private static final Z DIV = Z.valueOf(19);
  
  /** Construct the sequence. */
  public A227049() {
    super("[[0],[-60],[19],[-1]]", "[2, 19]", 0);
  }

  @Override
  public boolean isOk(final Z term) {
    final Z[] quotRem = term.divideAndRemainder(DIV);
    return quotRem[1].equals(Z.ZERO) && quotRem[0].isProbablePrime();
  }

}
