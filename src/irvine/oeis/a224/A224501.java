package irvine.oeis.a224;
// Generated by gen_seq4.pl prisubd at 2021-01-15 23:59
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A224501 Numbers n such that (11^n + 4^n)/15 is prime.
 * @author Georg Fischer
 */
public class A224501 extends PrimePositionSubsequence {

  private static final Z DIV = Z.valueOf(15);
  
  /** Construct the sequence. */
  public A224501() {
    super("[[0],[-44],[15],[-1]]", "[2, 15]", 0);
  }

  @Override
  public boolean isOk(final Z term) {
    final Z[] quotRem = term.divideAndRemainder(DIV);
    return quotRem[1].equals(Z.ZERO) && quotRem[0].isProbablePrime();
  }

}
