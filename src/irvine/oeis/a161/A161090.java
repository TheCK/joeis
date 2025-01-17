package irvine.oeis.a161;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A161090 Number of partitions of n into squares where every part appears at least 2 times.
 * @author Georg Fischer
 */
public class A161090 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  protected int mN; // current index
  protected int mOccur; // number of occurrences of the parts

  /**
   * Empty constructor
   */
  public A161090() {
    this(1, 2);
  }
  
  /**
   * Constructor with number of occurrences,
   * used by A161091-A161102 generated with partcapp.
   * @param offset index of the first term of the sequence
   * @param occur minimal number of occurrences of the parts
   */
  public A161090(final int offset, final int occur) {
    mOccur = occur;
    mN = offset - 1;
  }
  
  @Override
  public Z next() {
    ++mN;
    Polynomial<Z> prod = RING.one();
    for (int k = 1; k * k <= mN; ++k) {
      final int expon = k * k; // squares
      prod = RING.multiply(prod, RING.add(RING.one(),
         RING.series(RING.monomial(Z.ONE, mOccur * expon), RING.oneMinusXToTheN(expon), mN)), mN);
    }
    return prod.coeff(mN);
  }

}
