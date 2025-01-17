package irvine.oeis.a273;
// Generated by gen_seq4.pl prisubd at 2021-01-15 23:59
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A273403 Numbers n such that (10^n - 7^n)/3 is prime.
 * @author Georg Fischer
 */
public class A273403 extends PrimePositionSubsequence {

  private static final Z DIV = Z.THREE;
  
  /** Construct the sequence. */
  public A273403() {
    super("[[0],[-70],[17],[-1]]", "[0, 3]", 0);
  }

  @Override
  public boolean isOk(final Z term) {
    final Z[] quotRem = term.divideAndRemainder(DIV);
    return quotRem[1].equals(Z.ZERO) && quotRem[0].isProbablePrime();
  }

}
