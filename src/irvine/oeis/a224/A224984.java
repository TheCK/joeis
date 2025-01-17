package irvine.oeis.a224;
// Generated by gen_seq4.pl prisubd at 2021-01-15 23:59
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A224984 Numbers n such that (14^n + 13^n)/27 is prime.
 * @author Georg Fischer
 */
public class A224984 extends PrimePositionSubsequence {

  private static final Z DIV = Z.valueOf(27);
  
  /** Construct the sequence. */
  public A224984() {
    super("[[0],[-182],[27],[-1]]", "[2, 27]", 0);
  }

  @Override
  public boolean isOk(final Z term) {
    final Z[] quotRem = term.divideAndRemainder(DIV);
    return quotRem[1].equals(Z.ZERO) && quotRem[0].isProbablePrime();
  }

}
