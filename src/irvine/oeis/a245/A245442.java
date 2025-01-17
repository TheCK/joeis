package irvine.oeis.a245;
// Generated by gen_seq4.pl prisubd at 2021-01-15 23:59
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A245442 Numbers n such that (50^n - 1)/49 is prime.
 * @author Georg Fischer
 */
public class A245442 extends PrimePositionSubsequence {

  private static final Z DIV = Z.valueOf(49);
  
  /** Construct the sequence. */
  public A245442() {
    super("[[49],[50],[-1]]", "[0, 49]", 0);
  }

  @Override
  public boolean isOk(final Z term) {
    final Z[] quotRem = term.divideAndRemainder(DIV);
    return quotRem[1].equals(Z.ZERO) && quotRem[0].isProbablePrime();
  }

}
